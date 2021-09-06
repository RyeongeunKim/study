import java.util.List;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ChattingServer extends Application {
	// field
	ExecutorService executorService;
	ServerSocket serverSocket;
	List<Client> connections = new Vector<Client>();
	
	// method
	void startServer() {
		executorService = Executors.newFixedThreadPool(10);// 스레드 10개 할당

		// executorService =
		// Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		// 스레드풀 객체 생성 newFixedThreadPool - 최고의 성능을 위해 코어의 수만큼

		try {
			// 서버소켓 생성 및 바인딩 코드
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("localhost", 5001));

			// 예외가 발생하면 서버소켓을 안전하게 닫아준다
		} catch (Exception e) {
			if (!serverSocket.isClosed()) {
				stopServer();
			}
			return; // startServer() 종료
		}
		
		//연결수락코드 runnable-작업객체
		Runnable runnable = new Runnable() { // 연결 수락 작업 객체
			@Override
			public void run() { // 연락 수락을 위해 run()을 재정의 해준다
				//
//				Socket socket = null;
				byte getNickname[] = null;
				String nickname = null;
				
				
				//
				Platform.runLater(() -> { // Platform.runLater()은 변경 요청 코드
											// 변경요청 (람다식)
					displayText("[서버 시작]");		// javafx 필드부분에 text 출력

					btnStartStop.setText("stop"); // start -> stop 으로 변경
				});

				while (true) {	//수락 작업 accept
					try {
						
						Socket socket = serverSocket.accept(); // 클라이언트 연결 요청 까지
																// 대기
						String message = "[연결 수락: " + socket.getRemoteSocketAddress() + ": "
								+ Thread.currentThread().getName() + "]"; // 소켓주소와
																			// 현재스레드
																			// 출력
						
						Platform.runLater(() -> displayText(message));
						
						InputStream is = socket.getInputStream();
						
						getNickname = new byte[20];
						is.read(getNickname);
						nickname = new String(getNickname).trim();
						
						System.out.println(nickname + "님 입장");
					
						//Client client = new Client(socket, nickname);
						connections.add(new Client(socket, nickname)); // client를 connections에 추가
						
						//notifyConnector = nickname + "[참여 인원 수 : " + connections.size() +"]";
						//Platform.runLater(() -> displayText(notifyConnector));
						
						Platform.runLater(() -> displayText("[참여 인원 수: " + connections.size() + "]")); // 현재
																										// 클라이언트
																										// 개수

					} catch (IOException e) { // accept() 예외 발생시
						if (!serverSocket.isClosed()) {
							stopServer();
						}
						break; // while()문 종료
					}
				}
			}
		};
		executorService.submit(runnable); // 스레드풀에서 처리

	}// startServer() end

	void stopServer() {

		try {
			Iterator<Client> iterator = connections.iterator(); // 반복자 호출
			while (iterator.hasNext()) {
				Client client = iterator.next();
				client.socket.close();
				iterator.remove();
			}

			if (serverSocket != null && !serverSocket.isClosed()) {
				serverSocket.close();
			}

			if (executorService != null && !executorService.isShutdown()) {
				executorService.shutdown();
			}

			Platform.runLater(() -> { // 자바FX UI 접근
				displayText("[서버 멈춤]");
				btnStartStop.setText("start"); // stop -> start 버튼 변경
			});
		} catch (Exception e) {
		}
	}

	class Client { // 데이터 통신코드
		Socket socket;
		String nickname = null;

		Client(Socket socket, String nickname) { // 생성자
			this.socket = socket;
			this.nickname = nickname;

			receive();
		}

		void receive() {
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
					try {
						while (true) { // 계속 클라이언트의 데이터를 받아야하므로 무한루프를 생성
							byte[] byteArr = new byte[100]; // 바이트 배열 선언
							InputStream inputStream = socket.getInputStream();
							// 클라이언트에 온 데이터 받기

							int readByteCount = inputStream.read(byteArr);
							if (readByteCount == -1) { // 클라이언트가 정상 종료 했다면
								throw new IOException(); // 강제적으로 IOException 발생
							}

							String message = "[요청 처리:" + socket.getRemoteSocketAddress() + ": "
									+ Thread.currentThread().getName() + "]";
							Platform.runLater(() -> displayText(message));

							String data = new String(byteArr, 0, readByteCount, "utf-8");
							//문자열 변환, byteArr의 0 인덱스부터 읽은 바이트 수 만큼 문자열로 변환 
							data = Client.this.nickname + " : " + data;
							for (Client client : connections) {
								client.send(data);

							}
						}

					} catch (Exception e) {
						try {
							connections.remove(Client.this);
							String message = "[" + Client.this.nickname + "님께서 나가셨습니다. : " + socket.getRemoteSocketAddress() + " : "
									+ Thread.currentThread().getName() + "]";
							Platform.runLater(() -> displayText(message));
							socket.close();
						} catch (IOException e1) {
						}

					}
				}
			};
			executorService.submit(runnable);

		}

		void send(String data) {
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
					try {
						byte[] byteArr = data.getBytes("utf-8");
						OutputStream outputStream = socket.getOutputStream();
						outputStream.write(byteArr);
						outputStream.flush();
					} catch (Exception e) {
						String message = "[클라이언트 통신 안됨: " + socket.getRemoteSocketAddress() + ": "
								+ Thread.currentThread().getName() + "]";
						Platform.runLater(() -> displayText(message));
						connections.remove(Client.this);
						try {
							socket.close();
						} catch (IOException e2) {
						}
					}
				}
			};
			executorService.submit(runnable);
		}
	}

	// UI 생성코드

	TextArea txtDisplay;
	Button btnStartStop;

	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane root = new BorderPane();
		root.setPrefSize(500, 300);

		txtDisplay = new TextArea();
		txtDisplay.setEditable(false);
		BorderPane.setMargin(txtDisplay, new Insets(0, 0, 2, 0));
		root.setCenter(txtDisplay);

		btnStartStop = new Button("start");
		btnStartStop.setPrefHeight(30);
		btnStartStop.setMaxWidth(Double.MAX_VALUE);
		btnStartStop.setOnAction(e -> {
			if (btnStartStop.getText().equals("start")) {
				startServer();
			} else if (btnStartStop.getText().equals("stop")) {
				stopServer();
			}
		});

		root.setBottom(btnStartStop);

		Scene scene = new Scene(root);
		//scene.getStylesheets().add(getClass().getResource("app.css").toString());
		primaryStage.setScene(scene);
		primaryStage.setTitle("Server");
		primaryStage.setOnCloseRequest(event -> stopServer());
		primaryStage.show();
	}

	void displayText(String text) { // 디스플레이에 문자열 출력
		txtDisplay.appendText(text + "\n");
	}

	public static void main(String[] args) {
		launch(args);
	}

}