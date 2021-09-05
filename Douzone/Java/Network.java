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

//ex4-5) 자바Fx - 스레드이용
class ConnectThread extends Thread{
	Network network;
	ConnectThread(Network network){
		this.network = network;
	}
	public void run() {
		System.out.println(2);
		Platform.runLater(
				()->{
					//button.setText("호랑이");
					network.btn1.setText("호랑이");
				});
	}
}
public class Network extends Application 
{
	Button btn1 = new Button("테스트1");
	Button btn2 = new Button("테스트2");
	
	@Override
	public void start(Stage arg0) throws Exception {
		VBox root = new VBox();
		root.setPrefSize(400, 300);
		root.setSpacing(15); // 띄우고 싶은 간격 숫자를 넣음
		//----------------------------------------
		
		// 익명함수를 이용해서 스레드 발동
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				new Thread() {
					public void run() {
						System.out.println(1);
						Platform.runLater(
							()->{
								//btn2.setText("호랑이");
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
		Scene scene = new Scene(root); // 한 장면을 그리기 위한 객체
		arg0.setTitle("호랑이");
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
//ex4-4) 자바Fx
public class Network extends Application 
{
	@Override
	public void start(Stage arg0) throws Exception {
		VBox root = new VBox();
		root.setPrefSize(400, 300);
		root.setSpacing(15); // 띄우고 싶은 간격 숫자를 넣음
		//----------------------------------------
		Button btn1 = new Button("테스트1");
		Button btn2 = new Button("테스트2");
		
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				 btn2.setText("호랑이");
				
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
		Scene scene = new Scene(root); // 한 장면을 그리기 위한 객체
		arg0.setTitle("호랑이");
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
//ex4-3) 자바Fx
public class Network extends Application 
{
	@Override
	public void start(Stage arg0) throws Exception {
		VBox root = new VBox();
		root.setPrefSize(400, 300);
		root.setSpacing(15); // 띄우고 싶은 간격 숫자를 넣음
		//----------------------------------------
//		//방법1 
//		Button btn1 = new Button("테스트1");
//		root.getChildren().add(btn1);
//		
//		Button btn2 = new Button("테스트2");
//		root.getChildren().add(btn2);
		
		Button btn1 = new Button("테스트1");
		
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("호랑이");
			}
		});
		
		TextArea textArea = new TextArea();
		
		// 엔터를 치면 이벤트가 발생한다.
		TextField textField = new TextField();
		textField.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("코끼리"); 
				textField.getText();
				String s = textField.getText();
				textArea.appendText(s+"\n"); 
				textField.setText("");
			}
		});
		
		root.getChildren().addAll(btn1, textArea, textField);
		//----------------------------------------
		Scene scene = new Scene(root); // 한 장면을 그리기 위한 객체
		arg0.setTitle("호랑이");
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
//ex4-2) 자바Fx
public class Network extends Application 
{
	@Override
	public void start(Stage arg0) throws Exception {
		VBox root = new VBox();
		root.setPrefSize(400, 300);
		root.setSpacing(15); // 띄우고 싶은 간격 숫자를 넣음
		//----------------------------------------
//		//방법1 
//		Button btn1 = new Button("테스트1");
//		root.getChildren().add(btn1);
//		
//		Button btn2 = new Button("테스트2");
//		root.getChildren().add(btn2);
		
		Button btn1 = new Button("테스트1");
		Button btn2 = new Button("테스트2");
		
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("호랑이");
			}
		});
		
		btn2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("사자");
			}
		});
		
		root.getChildren().addAll(btn1, btn2);
		//----------------------------------------
		Scene scene = new Scene(root); // 한 장면을 그리기 위한 객체
		arg0.setTitle("호랑이");
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
//ex4-1) 자바Fx
public class Network extends Application 
{
	@Override
	public void start(Stage arg0) throws Exception {
		VBox root = new VBox();
		root.setPrefSize(400, 300);
		root.setSpacing(15); // 띄우고 싶은 간격 숫자를 넣음
		//----------------------------------------
//		//방법1 
//		Button btn1 = new Button("테스트1");
//		root.getChildren().add(btn1);
//		
//		Button btn2 = new Button("테스트2");
//		root.getChildren().add(btn2);
		
		Button btn1 = new Button("테스트1");
		Button btn2 = new Button("테스트2");
		root.getChildren().addAll(btn1, btn2);
		//----------------------------------------
		Scene scene = new Scene(root); // 한 장면을 그리기 위한 객체
		arg0.setTitle("호랑이");
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
		t.start(); // 스레드를 발동시킨다
		
		new Thread() {
			public void run() {
				System.out.println(2);
			}
		}.start(); // 스레드를 발동시킨다
	}
}
*/
/*
//ex2) 스레드
class Tiger extends Thread {
	public void run() {
		System.out.println("Tiger start");
		Thread t = new Lion();
		t.start();
		Scanner sc = new Scanner(System.in);
		sc.nextInt(); // 블로킹 함수
		System.out.println("Tiger end");		
	}
}
class Lion extends Thread {
	public void run() {
		System.out.println("Lion start");
		
		Scanner sc = new Scanner(System.in);
		sc.nextInt(); // 블로킹 함수
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
		sc.nextInt(); // 블로킹 함수
		System.out.println("main end");
	}
}
*/
/*
//ex1-2) 스레드
class Tiger extends Thread {
	public void run() { // 2
		System.out.println(2);
		// 반복문
		for (int i = 0; i < 10; i++) {
			System.out.println("호랑이" + i);
			// 0은 안멈추는게 아니라 
			// 멈출 수 있는 시간에서 가장 최소한으로 쉬어라
			// 1은 오래 쉬는거..원하는 결과를 보려고 0을 함
			try {Thread.sleep(0);} catch (Exception e) {} 
		} // 스레드는 소멸되었다
		System.out.println("종료");
	} 
}

public class Network
{
	public static void main(String[] args) 
	{
		Thread t = new Tiger();
		t.start(); // 1
		System.out.println(1);
		// 반복문
		for (int i = 0; i < 10; i++) {
			System.out.println("코끼리" + i);
			// 0은 안멈추는게 아니라 
			// 멈출 수 있는 시간에서 가장 최소한으로 쉬어라
			try {Thread.sleep(0);} catch (Exception e) {} 
		}
		System.out.println("main Exit");
	}
}
*/
/*
// ex1-1) 스레드
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
		System.out.println("스레드 시작");
		System.out.println("B run call");
		System.out.println("스레드 종료");
	}
}

public class Network {

	public static void main(String[] args) {
		A a = new B();
		a.start();
	}

}
*/