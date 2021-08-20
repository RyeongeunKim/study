
//프레임(창) 만들기 두가지 방법
//방법1. main()메소드내부에서 JFrame클래스에 대한 객체 생성 
//방법2. JFrame클래스를 상속받는 사용자정의 프레임클래스를 만들어
//      사용자정의 프레임클래스에 대한 객체를 main()메소드내부에서 생성


//방법1. main()메소드내부에서 JFrame클래스에 대한 객체 생성 

//순서1. awt, swing패키지내부에 있는 전체화면을 구성하기 위한 
//      모든 클래스나 인터페이스를 사용하겠다 라고 import선언
import java.awt.*;
import javax.swing.*;

//순서1-1. awt, swing패키지 내부에 있는 
//        이벤트 등록 관련한 클래스나 인터페이스를 사용하겠다라고 import선언
import java.awt.event.*;
import javax.swing.event.*;

public class MyApp {
	public static void main(String[] args) {

		//순서2. 프레임창 만들기
		//		방법 : JFrame클래스에 대한 객체 생성시 만들 창제목을 생성자로 전달 하여 만들기
		JFrame f = new JFrame("첫번째 프레임");
		//프레임창 창제목 변경 메소드 
		f.setTitle("방법1. 프레임창");
		/*
			참고.		
			AWT패키지를 이용하여 프레임창 만드는 방법 ->  Frame클래스에 대한 객체 생성
			Swing패키지를 이용하여 프레임창 만드는 방법 -> JFrame클래스에 대한 객체 생성
			
			생성된 JFrame객체의 3공간으로 구성됨
			1공간 : Menu Bar가 들어가는 공간
			2공간 : Frame들이 들어가는 공간
			3공간 : Content Pane이 들어가는 공간
			
			ContentPane : 
			화면에 출력되는 모든 컴포넌트들이 부착되는 공간
			예) JButton, JLabel, JTextField 컴포넌트 등등......
		
			중요! Swing에서는 ContentPane에만 컴포넌트를 부착할수 있다.
			중요! ContentPane은 JFrame객체가 처음 생성될대 자동으로 생성된다.
			ContentPane컨테이너객체를 얻어서 여러 버튼 컴포넌트를 부착해 봅시다.
		*/
		
		//JFrame객체의 getContentPane()메소드를 호출하여 반환데이터로
		//ContentPane컨테이너 객체를 반환받아 얻어올수 있다
		//(반환 값으로 Container부모클래스타입으로 자식 ContentPane컨테이너객체를 반환 받는다)
		Container contentPane = f.getContentPane();
		
		//JFrame창 내부에 존재하는ContentPane컨테이너객체에 JButton컴포넌트를 생성 해서 부착
		JButton b1 = new JButton("Click");
		
		//위생성한 Click버튼을 ContentPane컨테이너(도화지)에 부착 
		contentPane.add(b1);
		
		//ContentPane컨테이너를  Jpanel컨테이너로 변경하기 
		//JFrame객체 생성시 붙어 있는 ContentPane컨테이너를 제거하고
		//새로운 JPanel컨테이너를 만들어서 JFrame창에 붙이기 
		MyPanel mp = new MyPanel();
		
		//JFrame창에 새로운 JPanel(new MyPanel();) 부착(붙이기)
		f.setContentPane(mp);
		
		//위 Click버튼을 다시 JPanel(new MyPanel();)에 부착
		mp.add(b1);
		
		//JFrame창 내부에는 JPanel(new MyPanel();)도화지가 부착되어 있고
		//도화지 내부에는  Click JButton이 부착 되어 있다.
		
		//JFrame창 폭 300픽셀, 높이 300픽셀크기로 설정
		f.setSize(300, 300);
		//JFrame창이 윈도우 운영체제의 화면에 나타나게 하도록 설정 (true)
		f.setVisible(true);
		
	}

}//MyApp클래스 끝

//JPanel클래스를 상속  받아 MyPanel사용자 정의 JPandel컨테이너 클래스 만들기
class MyPanel extends JPanel{
	
	
}


/*
 	결론1 : 방법1은 단순하지만 권장되지 않는다.
 	       프레임창에 스윙 컴포넌트들을 추가하는 과정이 불편하며
 	       확장성, 융통성이 결여되는 단점이 있기 떄문임
 	       
 	결론2 : JDK 1.5버전 부터는 JFrame을 수정하여 
 	       개발자가 내부적으로  JFrame의 add()메소드는 추가되는 컴포넌트를 
 	       자동으로 ContentPane에 부착하도록 하고 있음
 	       따라서 개발자들은 ContentPane을 의식하지않고
 	       직접  JFrame에 컴포넌트를 추가할수 있다.
 	       
 	       JFrame frame = new JFrame();  창 
 	       JButton b1 = new JButton("Click"); 버튼
 	       frame.add(b1); // JFrame창 내부에 있는 ContentPane컨테이너에 add메소드를 이용하여
 	         	       	  // 자동으로 JButton버튼을 부착 한다.
 
 
*/
















