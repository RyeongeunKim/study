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
				//���� �� �о�´�.
				String str = br.readLine();
				//�ʿ� ���� []����
				str = str.substring(1,str.length()-1);
				System.out.println(str);
				
				//���� ������ ����
				if(str.substring(0,4).equals("nick")) {//�г���
					socketnick = str.substring(5);
					str = str.substring(5)+"�Բ��� �����ϼ̽��ϴ�.";	
					socketip = socket.getInetAddress();
//					//������ ���������� ����� ����Ʈ �����ش�.
//					for (ClientThread list : ConnectThread.clientlist) {
//						new NickThread(list.socket).start();;
//					}
					
				}else if(str.substring(0,4).equals("chat")) {//ä��
					str = socketnick + ": " + str.substring(5);
				}else if(str.substring(0,4).equals("exit")) {//���� ����
					Iterator<ClientThread> iter = ConnectThread.clientlist.iterator();
					while (iter.hasNext()) {
						ClientThread ct = iter.next();
						if(ct.socketip == this.socketip) {
							iter.remove();
							str = socketnick + "���� ä�ù濡�� �������ϴ�.";
							System.out.println("���������� �������� �Ϸ�.");
							
						}
					}
					System.out.println("���� �� �̿��� ��: " + ConnectThread.clientlist.size());
					for (ClientThread list : ConnectThread.clientlist) {//���� �޽��� ������
						new ChattingThread(list.socket, str).start();
					}
					Platform.runLater(() -> { 
						server.displayText("[���� ����: " + socket.getInetAddress() + "]");  // javafx �ʵ�κп� text ���
					});
					Platform.runLater(() -> server.displayText("[���� �ο� ��: " + ConnectThread.clientlist.size() + "]"));
					break;
					
				}else {//�߸��� ����
					System.out.println(str);
				}
				//socket �� ��ŭ �ݺ��Ѵ�. (��ο��� �ѷ��ֱ�)
				for (ClientThread list : ConnectThread.clientlist) {
					System.out.println("������:" +ConnectThread.clientlist.size());
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
		// Platform.runLater() : �����û(���ٽ�)
		Platform.runLater(() -> { 
			server.displayText("[���� ����]"); // javafx �ʵ�κп� text ���
			server.getBtnStartStop().setText("stop"); // start -> stop ���� ����
		});
		
		try {
			
			ServerSocket mss = new ServerSocket();
			System.out.println("Main Server Socket Creat");

			
			mss.bind(new InetSocketAddress(InetAddress.getLocalHost(), 5001));
			System.out.println("Binding �Ϸ�");

			// while(������ ������ ����.)
			while (true) {
				Socket ss = mss.accept(); // ���ŷ �Լ�.
				ClientThread client = new ClientThread(ss,server);
				clientlist.add(client);
				client.start();

				Platform.runLater(() -> { 
					server.displayText("[���� ����: " + ss.getInetAddress() + "]");  // javafx �ʵ�κп� text ���
					server.getBtnStartStop().setText("stop"); // start -> stop ���� ����
				});
				Platform.runLater(() -> server.displayText("[���� �ο� ��: " + clientlist.size() + "]"));
				
				System.out.println("Client�� �����߽��ϴ�.");
				System.out.println("�̿��� ��:" + clientlist.size());

			}

			// ����ó���� �Ѵ�.
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
				System.out.println("��������.");
				window.close();
			}
		});
		
		root.setBottom(btnStartStop);

		// ---------------------------------------------------
		Scene scene = new Scene(root); // �� ��� ��ü�� ���.
		arg0.setScene(scene); // ����� ���
		arg0.setTitle("Server"); // ����
		arg0.show();
	}

	void displayText(String text) { // ���÷��̿� ���ڿ� ���
		txtDisplay.appendText(text + "\n");
	}

	public Button getBtnStartStop() {
		return btnStartStop;
	}

	public static void main(String[] args) {
		launch(); // ���ŷ
		System.out.println("Exit");
	}

}