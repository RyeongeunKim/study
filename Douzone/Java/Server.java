import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

class ChattingThread extends Thread {//send msg to client
	private Socket socket;
	private OutputStream os;
	private OutputStreamWriter osw;
	private PrintWriter pw;
	private String str;

	ChattingThread(Socket socket, String str) {
		this.socket = socket;
		this.str = str;
	}

//	@Override
	public void run() {

		try {
			System.out.println("chat ip: " + socket.getInetAddress());
			System.out.println("------------------------------------");
			System.out.println("send: " + str);
			System.out.println("-----------------------------------");
			os = socket.getOutputStream();
			osw = new OutputStreamWriter(os, "UTF-8");
			pw = new PrintWriter(osw, true);
			pw.println(str);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

class ClientThread extends Thread {
	    private Socket socket;
	    private InputStream is;
	    private InputStreamReader isr;
	    private BufferedReader br;
	    private String socketnick;
	    private InetAddress socketip;
	    private Server server;

	public ClientThread(Socket socket,Server server) {
		this.socket = socket;
		this.server = server;
	}

	@Override
	public void run() {
		try {
			System.out.println("client: " + socket.getInetAddress());
			is = socket.getInputStream();
			isr = new InputStreamReader(is, "UTF-8");
			br = new BufferedReader(isr);
			while (true) {
				//한줄 씩 읽어온다.
				String str = br.readLine();
				//필요 없는 []제거
				str = str.substring(1,str.length()-1);
				System.out.println(str);
				
				//받은 데이터 구분
				if(str.substring(0,4).equals("nick")) {//닉네임
					socketnick = str.substring(5);
					str = str.substring(5)+"님께서 입장하셨습니다.";	
					socketip = socket.getInetAddress();
//					//접속이 있을때마다 사용자 리스트 보내준다.
//					for (ClientThread list : ConnectThread.clientlist) {
//						new NickThread(list.socket).start();;
//					}
					
				}else if(str.substring(0,4).equals("chat")) {//채팅
					str = socketnick + ": " + str.substring(5);
				}else if(str.substring(0,4).equals("exit")) {//접속 종료
					Iterator<ClientThread> iter = ConnectThread.clientlist.iterator();
					while (iter.hasNext()) {
						ClientThread ct = iter.next();
						if(ct.socketip == this.socketip) {
							iter.remove();
							str = socketnick + "님이 채팅방에서 나갔습니다.";
							System.out.println("정상적으로 접속종료 완료.");
							
						}
					}
					System.out.println("종료 후 이용자 수: " + ConnectThread.clientlist.size());
					for (ClientThread list : ConnectThread.clientlist) {//종료 메시지 보내기
						new ChattingThread(list.socket, str).start();
					}
					Platform.runLater(() -> { 
						server.displayText("[연결 해제: " + socket.getInetAddress() + "]");  // javafx 필드부분에 text 출력
					});
					Platform.runLater(() -> server.displayText("[참여 인원 수: " + ConnectThread.clientlist.size() + "]"));
					break;
					
				}else {//잘못된 전송
					System.out.println(str);
				}
				//socket 수 만큼 반복한다. (모두에게 뿌려주기)
				for (ClientThread list : ConnectThread.clientlist) {
					System.out.println("사이즈:" +ConnectThread.clientlist.size());
					new ChattingThread(list.socket, str).start();
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class ConnectThread extends Thread {
	public static Vector<ClientThread> clientlist = new Vector<ClientThread>();
    private Server server = null;
    
	public ConnectThread(Object o) {
		this.server = (Server)o;
	}
	@Override
	public void run() {
		// Platform.runLater() : 변경요청(람다식)
		Platform.runLater(() -> { 
			server.displayText("[서버 시작]"); // javafx 필드부분에 text 출력
			server.getBtnStartStop().setText("stop"); // start -> stop 으로 변경
		});
		
		try {
			
			ServerSocket mss = new ServerSocket();
			System.out.println("Main Server Socket Creat");

			
			mss.bind(new InetSocketAddress(InetAddress.getLocalHost(), 5001));
			System.out.println("Binding 완료");

			// while(여러명 접속을 위함.)
			while (true) {
				Socket ss = mss.accept(); // 블로킹 함수.
				ClientThread client = new ClientThread(ss,server);
				clientlist.add(client);
				client.start();

				Platform.runLater(() -> { 
					server.displayText("[연결 수락: " + ss.getInetAddress() + "]");  // javafx 필드부분에 text 출력
					server.getBtnStartStop().setText("stop"); // start -> stop 으로 변경
				});
				Platform.runLater(() -> server.displayText("[참여 인원 수: " + clientlist.size() + "]"));
				
				System.out.println("Client가 접속했습니다.");
				System.out.println("이용자 수:" + clientlist.size());

			}

			// 리딩처리를 한다.
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class Server extends Application {
	private Stage window;
    private TextArea txtDisplay;
    private Button btnStartStop; 
	
	
	@Override
	public void start(Stage arg0) throws Exception {
		window = arg0;
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
			if(btnStartStop.getText().equals("start")) {
				new ConnectThread(this).start();
			} else if(btnStartStop.getText().equals("stop")) {
				System.out.println("서버종료.");
				window.close();
			}
		});
		
		root.setBottom(btnStartStop);

		// ---------------------------------------------------
		Scene scene = new Scene(root); // 한 장면 객체에 등록.
		arg0.setScene(scene); // 장면을 등록
		arg0.setTitle("Server"); // 제목
		arg0.show();
	}

	void displayText(String text) { // 디스플레이에 문자열 출력
		txtDisplay.appendText(text + "\n");
	}

	public Button getBtnStartStop() {
		return btnStartStop;
	}

	public static void main(String[] args) {
		launch(); // 블록킹
		System.out.println("Exit");
	}

}