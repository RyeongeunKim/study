package Pack;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/*
//ex)
public class Network
{
	public static void main(String[] args) 
	{
		// System.out.println("1000");
	}
}
*/

//ex4-5) �ڹ�Fx - �������̿�
class ConnectThread extends Thread{
	Network network;
	ConnectThread(Network network){
		this.network = network;
	}
	public void run() {
		System.out.println(2);
		Platform.runLater(
				()->{
					//button.setText("ȣ����");
					network.btn1.setText("ȣ����");
				});
	}
}
public class Network extends Application 
{
	Button btn1 = new Button("�׽�Ʈ1");
	Button btn2 = new Button("�׽�Ʈ2");
	
	@Override
	public void start(Stage arg0) throws Exception {
		VBox root = new VBox();
		root.setPrefSize(400, 300);
		root.setSpacing(15); // ���� ���� ���� ���ڸ� ����
		//----------------------------------------
		
		// �͸��Լ��� �̿��ؼ� ������ �ߵ�
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				new Thread() {
					public void run() {
						System.out.println(1);
						Platform.runLater(
							()->{
								//btn2.setText("ȣ����");
								System.out.println(2);
							});
					}
				}.start();
			}
		});
		
		btn2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				new ConnectThread(Network.this).start();
			}
		});
		
		root.getChildren().addAll(btn1, btn2);
		//----------------------------------------
		Scene scene = new Scene(root); // �� ����� �׸��� ���� ��ü
		arg0.setTitle("ȣ����");
		arg0.setScene(scene);
		arg0.show();
	}
	
	public static void main(String[] args) 
	{
		launch(); 
		System.out.println("Exit");
	}
}

/*
//ex4-4) �ڹ�Fx
public class Network extends Application 
{
	@Override
	public void start(Stage arg0) throws Exception {
		VBox root = new VBox();
		root.setPrefSize(400, 300);
		root.setSpacing(15); // ���� ���� ���� ���ڸ� ����
		//----------------------------------------
		Button btn1 = new Button("�׽�Ʈ1");
		Button btn2 = new Button("�׽�Ʈ2");
		
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				 btn2.setText("ȣ����");
				
			}
		});
		
		btn2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				//btn1.setVisible(false);
				btn1.setDisable(true);
			}
		});
		root.getChildren().addAll(btn1, btn2);
		//----------------------------------------
		Scene scene = new Scene(root); // �� ����� �׸��� ���� ��ü
		arg0.setTitle("ȣ����");
		arg0.setScene(scene);
		arg0.show();
	}
	
	public static void main(String[] args) 
	{
		launch(); 
		System.out.println("Exit");
	}
}
*/
/*
//ex4-3) �ڹ�Fx
public class Network extends Application 
{
	@Override
	public void start(Stage arg0) throws Exception {
		VBox root = new VBox();
		root.setPrefSize(400, 300);
		root.setSpacing(15); // ���� ���� ���� ���ڸ� ����
		//----------------------------------------
//		//���1 
//		Button btn1 = new Button("�׽�Ʈ1");
//		root.getChildren().add(btn1);
//		
//		Button btn2 = new Button("�׽�Ʈ2");
//		root.getChildren().add(btn2);
		
		Button btn1 = new Button("�׽�Ʈ1");
		
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("ȣ����");
			}
		});
		
		TextArea textArea = new TextArea();
		
		// ���͸� ġ�� �̺�Ʈ�� �߻��Ѵ�.
		TextField textField = new TextField();
		textField.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("�ڳ���"); 
				textField.getText();
				String s = textField.getText();
				textArea.appendText(s+"\n"); 
				textField.setText("");
			}
		});
		
		root.getChildren().addAll(btn1, textArea, textField);
		//----------------------------------------
		Scene scene = new Scene(root); // �� ����� �׸��� ���� ��ü
		arg0.setTitle("ȣ����");
		arg0.setScene(scene);
		arg0.show();
	}
	
	public static void main(String[] args) 
	{
		launch(); 
		System.out.println("Exit");
	}
}
*/
/*
//ex4-2) �ڹ�Fx
public class Network extends Application 
{
	@Override
	public void start(Stage arg0) throws Exception {
		VBox root = new VBox();
		root.setPrefSize(400, 300);
		root.setSpacing(15); // ���� ���� ���� ���ڸ� ����
		//----------------------------------------
//		//���1 
//		Button btn1 = new Button("�׽�Ʈ1");
//		root.getChildren().add(btn1);
//		
//		Button btn2 = new Button("�׽�Ʈ2");
//		root.getChildren().add(btn2);
		
		Button btn1 = new Button("�׽�Ʈ1");
		Button btn2 = new Button("�׽�Ʈ2");
		
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("ȣ����");
			}
		});
		
		btn2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("����");
			}
		});
		
		root.getChildren().addAll(btn1, btn2);
		//----------------------------------------
		Scene scene = new Scene(root); // �� ����� �׸��� ���� ��ü
		arg0.setTitle("ȣ����");
		arg0.setScene(scene);
		arg0.show();
	}
	
	public static void main(String[] args) 
	{
		launch(); 
		System.out.println("Exit");
	}
}
*/
/*
//ex4-1) �ڹ�Fx
public class Network extends Application 
{
	@Override
	public void start(Stage arg0) throws Exception {
		VBox root = new VBox();
		root.setPrefSize(400, 300);
		root.setSpacing(15); // ���� ���� ���� ���ڸ� ����
		//----------------------------------------
//		//���1 
//		Button btn1 = new Button("�׽�Ʈ1");
//		root.getChildren().add(btn1);
//		
//		Button btn2 = new Button("�׽�Ʈ2");
//		root.getChildren().add(btn2);
		
		Button btn1 = new Button("�׽�Ʈ1");
		Button btn2 = new Button("�׽�Ʈ2");
		root.getChildren().addAll(btn1, btn2);
		//----------------------------------------
		Scene scene = new Scene(root); // �� ����� �׸��� ���� ��ü
		arg0.setTitle("ȣ����");
		arg0.setScene(scene);
		arg0.show();
	}
	
	public static void main(String[] args) 
	{
		launch(); 
		System.out.println("Exit");
	}
}
*/
/*
//ex3)
public class Network
{
	public static void main(String[] args) 
	{	
		Thread t = new Thread() {
			public void run() {
				System.out.println(1);
			}
		};
		t.start(); // �����带 �ߵ���Ų��
		
		new Thread() {
			public void run() {
				System.out.println(2);
			}
		}.start(); // �����带 �ߵ���Ų��
	}
}
*/
/*
//ex2) ������
class Tiger extends Thread {
	public void run() {
		System.out.println("Tiger start");
		Thread t = new Lion();
		t.start();
		Scanner sc = new Scanner(System.in);
		sc.nextInt(); // ���ŷ �Լ�
		System.out.println("Tiger end");		
	}
}
class Lion extends Thread {
	public void run() {
		System.out.println("Lion start");
		
		Scanner sc = new Scanner(System.in);
		sc.nextInt(); // ���ŷ �Լ�
		System.out.println("Lion end");		
	}
}

public class Network
{
	public static void main(String[] args) 
	{
		System.out.println("main start");
		Thread t = new Tiger();
		t.start();
		Scanner sc = new Scanner(System.in);
		sc.nextInt(); // ���ŷ �Լ�
		System.out.println("main end");
	}
}
*/
/*
//ex1-2) ������
class Tiger extends Thread {
	public void run() { // 2
		System.out.println(2);
		// �ݺ���
		for (int i = 0; i < 10; i++) {
			System.out.println("ȣ����" + i);
			// 0�� �ȸ��ߴ°� �ƴ϶� 
			// ���� �� �ִ� �ð����� ���� �ּ������� �����
			// 1�� ���� ���°�..���ϴ� ����� ������ 0�� ��
			try {Thread.sleep(0);} catch (Exception e) {} 
		} // ������� �Ҹ�Ǿ���
		System.out.println("����");
	} 
}

public class Network
{
	public static void main(String[] args) 
	{
		Thread t = new Tiger();
		t.start(); // 1
		System.out.println(1);
		// �ݺ���
		for (int i = 0; i < 10; i++) {
			System.out.println("�ڳ���" + i);
			// 0�� �ȸ��ߴ°� �ƴ϶� 
			// ���� �� �ִ� �ð����� ���� �ּ������� �����
			try {Thread.sleep(0);} catch (Exception e) {} 
		}
		System.out.println("main Exit");
	}
}
*/
/*
// ex1-1) ������
class A {
	void start() {
		System.out.println("start call");
		run();
	}
	
	void run() {
		System.out.println("A run call");
	}
}
class B extends A {
	void run() {
		System.out.println("������ ����");
		System.out.println("B run call");
		System.out.println("������ ����");
	}
}

public class Network {

	public static void main(String[] args) {
		A a = new B();
		a.start();
	}

}
*/