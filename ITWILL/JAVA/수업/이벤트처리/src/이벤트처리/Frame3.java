package 이벤트처리;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


//2단계 방식의 이벤트 처리
// 프레임클래스 자신이 이벤트리스너 클래스 역할을 하게 만들어 처리 하는 방법


/*
	주제 : "Action"버튼을 클릭하면 "액션"으로 버튼의 문자열을 변경 하고....
		 다시 바뀐 "액션"버튼을 클릭하면  "Action"으로 버튼의 문자열을 변경 시키는 
		 토글 버튼 구현

*/

//프레임 창 그리고 이벤트를 처리하는 이벤트 리스너의 역할을 하는 클래스 (2단계 방법)
public class Frame3 extends JFrame implements ActionListener{

	//생성자
	Frame3(){
		//프레임창 창제목설정
		this.setTitle("이벤트리스너작성");
		//프레임창 배치관리자를 new FlowLayout()으로 설정
		this.setLayout(new FlowLayout());
		//프레임창의 x버튼을 클릭하면 프레임창이 닫히게 설정
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//버튼 컴포넌트 생성 하고 생성한 버튼 컴포넌트를 프레임창에 추가하여 부착(등록)
		JButton btn = new JButton("Action");
		this.add(btn);
		//버튼 컴포넌트에 이벤트 처리할 이벤트 리스너 객체(new Frame3(); this) 등록
		btn.addActionListener(this);
		//프레임창 사이즈 설정 및  프레임을 보이게 설정
		this.setSize(300, 150);  this.setVisible(true);  
	}
	
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
	
	public static void main(String[] args) {
		//프레임창 객체 생성
		new Frame3();
	}

}














