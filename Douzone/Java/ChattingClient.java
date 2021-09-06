import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ChattingClient extends Application {
	Socket socket;

	void startClient() {
		Thread thread = new Thread() { // 별도의 스레드

			@Override
			public void run() {
				try {
					// 소켓 생성 및 연결
					socket = new Socket();
					socket.connect(new InetSocketAddress("localhost", 5001));
					Platform.runLater(() -> {
						try {
							socket.getOutputStream().write(txtInput.getText().getBytes());
							socket.getOutputStream().flush();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						displayText("연결 완료: " + socket.getRemoteSocketAddress() + "]");
						displayText("[대화방에 참여하였습니다.]");
						btnConn.setText("나가기");
						btnSend.setDisable(false); // 보내기 버튼 활성화
					});

				} catch (IOException e) {
					Platform.runLater(() -> displayText("[서버 통신 안됨"));
					if (!socket.isClosed()) {
						stopClient();
					}
					return;
				}
				receive(); // 서버에서 보낸 데이터 받기
			}
		};
		thread.start(); // 스레드 시작
	}

	void stopClient() {
		try {

			Platform.runLater(() -> {
				displayText("[대화방에서 나갔습니다.]");
				btnConn.setText("방 참여");
				btnSend.setDisable(true);
			});
			if (socket != null && !socket.isClosed()) {
				socket.close();
			}
		} catch (Exception e) {
		}
	}

	void receive() {
		// 데이터 받기 코드
		while (true) {

			try {
				byte[] byteArr = new byte[100];
				InputStream inputStream = socket.getInputStream();

				int readByteCount = inputStream.read(byteArr); // 데이터 받기
				if (readByteCount == -1) { // -1을 리턴하면 서버가 정상적으로 종료
					throw new IOException();
				}

				// 정상적으로 데이터를 읽을 경우
				String data = new String(byteArr, 0, readByteCount, "utf-8"); // 문자열
																				// 변환

				Platform.runLater(() -> displayText(data));
			} catch (Exception e) {
				Platform.runLater(() -> displayText("[서버 통신 안됨]"));
				stopClient();
				break;

			}
		}
	}

	void send(String data) {
		Thread thread = new Thread() { // 별도의 스레드
			@Override
			public void run() {
				try {
					byte[] byteArr = data.getBytes("utf-8");
					OutputStream outputStream = socket.getOutputStream();
					outputStream.write(byteArr);
					outputStream.flush();
					// Platform.runLater(() -> displayText("[보내기 완료]"));
				} catch (Exception e) {
					Platform.runLater(() -> displayText("[서버 통신 안됨]"));
					stopClient();
				}
			}
		};
		thread.start();
	}

	// UI 생성코드

	TextArea txtDisplay;
	TextField txtInput;
	Button btnConn;
	Button btnSend;

	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane root = new BorderPane();
		root.setPrefSize(500, 300);

		txtDisplay = new TextArea();
		txtDisplay.setEditable(false);
		BorderPane.setMargin(txtDisplay, new Insets(0, 0, 2, 0));
		root.setCenter(txtDisplay);

		BorderPane bottom = new BorderPane();
		txtInput = new TextField();
		txtInput.setPrefSize(60, 30);
		BorderPane.setMargin(txtInput, new Insets(0, 1, 1, 1));

		btnConn = new Button("방 참여");
		btnConn.setPrefSize(60, 30);

		btnConn.setOnAction(e -> {
			if (btnConn.getText().equals("방 참여")) {
				Platform.runLater(()->{
					if(txtInput.getText().equals("")){
						displayText("[ 채팅에서 사용할 닉네임을 먼저 입력해주세요. ]");
					}
					else{
						startClient();	
					}
				});
			} else if (btnConn.getText().equals("나가기")) {
				stopClient();
			}
		});

		btnSend = new Button("보내기");
		btnSend.setPrefSize(60, 30);
		btnSend.setDisable(true);
		btnSend.setOnAction(e->{
			Platform.runLater(()->{
				send(txtInput.getText());
				txtInput.setText("");
			});
		});

		bottom.setCenter(txtInput);
		bottom.setLeft(btnConn);
		bottom.setRight(btnSend);
		root.setBottom(bottom);

		Scene scene = new Scene(root);
		//scene.getStylesheets().add(getClass().getResource("app.css").toString());
		primaryStage.setScene(scene);
		primaryStage.setTitle("Client");
		primaryStage.setOnCloseRequest(event -> stopClient());
		primaryStage.show();
	}

	void displayText(String text) {
		txtDisplay.appendText(text + "\n");

	}

	public static void main(String[] args) {
		launch(args);
	}

}