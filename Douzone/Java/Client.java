import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


class ReciveThread extends Thread {
	Socket socket;
	InputStream is = null;
	InputStreamReader isr = null;
	BufferedReader br = null;
	TextArea msgArea = null;
	ReciveThread(Socket socket,TextArea msgArea) {
		this.socket = socket;
		this.msgArea = msgArea;
	}
	
	@Override
	public void run() {
		try {
			is = socket.getInputStream();
			isr = new InputStreamReader(is, "UTF-8");
			br = new BufferedReader(isr);
//			System.out.println("Recive While전");
			while (true) {
//				System.out.println("ReciveThread옴");
				String data = br.readLine();
				System.out.println(data + " : 데이터 받음");
				msgArea.appendText(data+"\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public Socket getSocket() {
		return socket;
	}
}

public class Client extends Application{
	Socket cs = null;
	String chat = null;
	String serverIp = null;
	String userNick = null;
	PrintWriter pw = null; 
	
	Map<String, String> map = null;
	
//	OutputStream outputStream = null;
	@Override
	public void start(Stage arg0) throws Exception {
		GridPane root = new GridPane();  // 최상단 UI  Vertical의 약자 세로, Horizontal 가로
		//==================================
		
		Label user_id = new Label("User ID"); 
		TextField ID_Field = new TextField();
		ID_Field.setPrefWidth(200);
		Button Conn_Btn = new Button("접속");
		Label server_ip = new Label("Server IP"); 
		TextField Server_IpField = new TextField();
		
		root.addRow(0, user_id, ID_Field, server_ip, Server_IpField, Conn_Btn);
//		root.add(userList, 5, 0);
		//root.setRowSpan(userList, 2);
		
		TextArea msgArea = new TextArea();
		root.addRow(1, msgArea);
		root.setColumnSpan(msgArea, 5);
		
		Label l1 = new Label("메세지 입력");
		TextField msg = new TextField();
		Button SendMsg_Btn = new Button("보내기");
		Button Exit_Btn = new Button("나가기");
		root.add(l1, 0, 2);
		root.add(msg, 1, 2);
		root.add(SendMsg_Btn, 3, 2);
		root.add(Exit_Btn, 4, 2);
		SendMsg_Btn.setDisable(true);
		root.setPadding(new Insets(25,25,25,25));
		root.setColumnSpan(msg, 2);
		
		Conn_Btn.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
//				PrintWriter pw;
				// TODO Auto-generated method stub
				try {
					cs = new Socket(); // client socket
					
					serverIp = Server_IpField.getText();
					//  InetAddress.getLocalHost()
					// 사용자 입력한 IP로 접속 포트는 5001 고정 
					// 만약 사용자가 IP입렵 안했을시 local로 접속하도록 수정
					String serverIp = Server_IpField.getText();
					if(!serverIp.isEmpty()) {
						System.out.print(InetAddress.getByName(serverIp));
						cs.connect(new InetSocketAddress(InetAddress.getByName(serverIp) , 5001));
					}else if(serverIp.equals("localhost") || serverIp.equals("")) {
						cs.connect(new InetSocketAddress(InetAddress.getLocalHost() , 5001));
					}
					pw = new PrintWriter(new OutputStreamWriter(cs.getOutputStream(), StandardCharsets.UTF_8), true);
					
					userNick = ID_Field.getText();
					map = new HashMap<String, String>();
					map.put("nick",userNick);
					System.out.print("NickName : " + map);  //.get("nick")
					
					pw.println(map);  // 클라이언트 사용자 id 전송
					pw.flush();
					System.out.println("서버에 접속 성공");
//					cs.connect(new InetSocketAddress("220.119.22.169" , 5001));  // 서버에 접속 예외 걸리지 않으면 접속 성공

					// 접속 성공시 사용자가 접속버튼을 못누르게 비활성화,  메세지 전송버튼 활성화
					Conn_Btn.setDisable(true);
					SendMsg_Btn.setDisable(false);
					ID_Field.setDisable(true);
					Server_IpField.setDisable(true);
					
					new ReciveThread(cs, msgArea).start();  // 서버 -> 클라  메세지 받는 스레드 시작
					
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		});
		
		SendMsg_Btn.setOnAction(new EventHandler<ActionEvent>() {
			int count = 0;
			
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				try {  // 클라 -> 서버  메세지 보내는 로직
					map = new HashMap<String, String>();
					map.put("chat", msg.getText());
					msg.setText("");
					pw = new PrintWriter(new OutputStreamWriter(cs.getOutputStream(), StandardCharsets.UTF_8), true);
					
					pw.println(map);
					pw.flush();
					System.out.println(map);			
					
					System.out.println("데이타 보냄");	
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		});
		
		Exit_Btn.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				try {
					Conn_Btn.setDisable(false);
					SendMsg_Btn.setDisable(true);
					ID_Field.setDisable(false);
					Server_IpField.setDisable(false);
					
					map = new HashMap<String, String>();
					map.put("exit",userNick);
					pw = new PrintWriter(new OutputStreamWriter(cs.getOutputStream(), StandardCharsets.UTF_8), true);
					
					pw.println(map);
					pw.flush();
					
					cs.close();
					System.out.println("채팅을 종료 합니다.");
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		
		//==================================
		Scene scene = new Scene(root);
		arg0.setTitle("Client");
		arg0.setScene(scene);
		arg0.show();
	}

	
	public static void main(String[] args) { // 엔트리 포인트
		launch();  // 블로킹잡혀있다
		System.out.println("Exit");
	}
}