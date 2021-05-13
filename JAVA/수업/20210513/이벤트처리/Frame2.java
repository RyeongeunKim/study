package 이벤트처리;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


//1단계 방식의 이벤트 처리
// 프레임클래스 , 이벤트리스너클래스(이벤트 처리 클래스) 따로 만들어서 이용 하는 방법
/*
	주제 : "Action"버튼을 클릭하면 "액션"으로 버튼의 문자열을 변경 하고....
		 다시 바뀐 "액션"버튼을 클릭하면  "Action"으로 버튼의 문자열을 변경 시키는 
		 토글 버튼 구현

*/

//프레임 창 클래스 
public class Frame2 extends JFrame{

	//생성자
	Frame2(){
		//프레임창 창제목설정
		this.setTitle("이벤트리스너작성");
		//프레임창 배치관리자를 new FlowLayout()으로 설정
		this.setLayout(new FlowLayout());
		//프레임창의 x버튼을 클릭하면 프레임창이 닫히게 설정
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//버튼 컴포넌트 생성 하고 생성한 버튼 컴포넌트를 프레임창에 추가하여 부착(등록)
		JButton btn = new JButton("Action");
		this.add(btn);
		//버튼 컴포넌트에 이벤트 처리할 이벤트 리스너 객체(new MyActionListener();) 등록
		btn.addActionListener(new MyActionListener());
		//프레임창 사이즈 설정 및  프레임을 보이게 설정
		this.setSize(300, 150);  this.setVisible(true);  
	}
	
	public static void main(String[] args) {
		//프레임창 객체 생성
		new Frame2();
	}

}

//이벤트 리스너 클래스 
//버튼을 클릭했을때 버튼에 관하여 Action이벤트가 발생하므로
//이벤트종류(Action)에 대응하는  -> 리스너 인터페이스 : ActionListener

//참고 ActionListener인터페이스의 추상메소드를 강제로 오버라이딩 해서 만들어야함.
class MyActionListener implements ActionListener{
	//버튼을 클릭하면 호출되는 콜백 메소드 
	@Override
	public void actionPerformed(ActionEvent e) {
		//사용자가 클릭한 버튼 컴포넌트는????
		//ActionEvent객체의 getSource()메소드를 이용하여 반환 받을수 있따.
		JButton b = (JButton)e.getSource(); //클릭당한 JButton객체 얻기 
		
		//만약 JButton컴포넌트의 텍스트문자열이  "Action"이면?
		if(b.getText().equals("Action")) {
			//JButton버튼컴포넌트의 텍스트 문자열을  "액션"으로 변경
			b.setText("액션");
		}else {//"Action"이 아니면~
			//"액션" -> "Action"
			b.setText("Action");
		}		
	}
}












