package 이벤트처리;



import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

/*
		이벤트 처리 방식 4단계 중에서...
		
		1단계. 프레임창 클래스와 다른 이벤트 리스너클래스를 이용하는 방법
		
		
		실습 내용 : "Mouse Event 테스트 버튼"문자열을 가진 JButton컴포넌트를 생성하고,
		          버튼에 마우스포인터를 올려놓으면 버튼의 배경색이 빨간색으로 변경되게 하고,
		          버튼에 올라가 있는 마우스포인터를 내리면 버튼의 배경색이 노란색으로 변경되는 스윙 프로그램 만드시오.

*/

import javax.swing.JFrame;


//버튼 컴포넌트에 마우스이벤트가 발생하면 이벤트를 처리할 이벤트 리스너 클래스 만들기 
class MyMouseListener  implements MouseListener {

	//마우스로 다른 컴포넌트를 클릭하는 순간 호출 되는 콜백 메소드 
	@Override
	public void mouseClicked(MouseEvent e) { 
		//마우스로 다른 컴포넌트가 클릭 되는 순간 이벤트 처리 코드 작성
		//구현 생략
	}

	//마우스 버튼이 눌러지는 순간 호출 되는 콜백 메소드 
	@Override
	public void mousePressed(MouseEvent e) {
		
	}

	//눌러진 마우스 버튼이 떼어지는 순간 호출 되는 콜백 메소드 
	@Override
	public void mouseReleased(MouseEvent e) {
		
	}

	// 마우스가 컴포넌트 위에 올라가는 순간 호출되는 콜백 메소드
	@Override
	public void mouseEntered(MouseEvent e) {
		//이벤트가 발생한(마우스포인터를 버튼에 올리는 행위가 발생한)
		//버튼컴포넌트(이벤트소스)에 대한 정보는? 
		//이벤트분배스레드가 이벤트객체(MouseEvent)를 생성해서 매개수로 전달 해준다
		//이벤트 객체(MouseEvent)는 이벤트가 발생당한 버튼컴포넌트(이벤트소스)의 정보를 가지고 있다.
		//그러므로 이벤트 객체의 getSource()메소드를 호출하면  이벤트가 발생당한 버튼 컴포넌트객체를 반환 받을수 있다.
		JButton btn  = (JButton)e.getSource();
		//버튼 컴포넌트의 배경색을 빨간색으로 변경
		btn.setBackground(Color.RED);
		
	}

	// 마우스가 컴포넌트 위에서 내려오는 순간 호출되는 콜백 메소드 
	@Override
	public void mouseExited(MouseEvent e) {
		//마우스포인터가 올라가 있다가 내려온 버튼 컴포넌트 객체의 주소 얻기 
		JButton btn = (JButton)e.getSource();
		//버튼컴포넌트의 배경색을 노란색으로 변경
		btn.setBackground(Color.YELLOW);
	}
	
}//이벤트를 처리할 이벤트처리 리스너 클래스 끝

//사용자정의 프레임창 역할의 클래스 만들기
public class Frame1 extends JFrame{

	//프레임창 꾸미기 (생성자)
	public Frame1() {
		//프레임창 제목 설정
		setTitle("이벤트처리");
		//프레임창에 FlowLayout으로 배치관리자 설정
		setLayout(new FlowLayout());
		//프레임창의 x아이콘을 클릭하면 프레임창 닫히게 이벤트 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//버튼 컴포넌트 생성 
		JButton btn = new JButton("Mose Event 테스트 버튼");
		//버튼 컴포넌트의 배경색을 노란색으로 변경 하여 설정
		btn.setBackground(Color.YELLOW);
		//버튼 컴포넌트를 프레임창에 부착
		this.add(btn);
		//이벤트를 처리할 리스너 클래스에 대한 객체 생성
		MyMouseListener listener = new MyMouseListener();
		//버튼 컴포넌트에 바로위에서 만든 이벤트를 처리할 이벤트리스너객체를 등록 하자 
		btn.addMouseListener(listener);
		
		//프레임창 사이즈 및 보이게 설정
		this.setSize(300, 150);
		this.setVisible(true);

	}
	
	public static void main(String[] args) {	
		new Frame1();//프레임창 역할을 하는 객체 생성
	}

	
}












