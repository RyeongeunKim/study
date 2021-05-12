import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/*
	배치관리자 종류중... FlowLayout배치관리자 클래스 실습
*/

public class FlowLayoutEx extends JFrame{

	public FlowLayoutEx() {
		//프레임창의 창제목 -> "FlowLayout Sample" 
		this.setTitle("FlowLayout Sample");
		//프레임창내부에 있는 ContentPane도화지에 new FlowLayout();배치관리자 객체 설정
		this.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));
		//프레임창 내부에 있는 ContentPane도화지에 버튼 컴포넌트들을 생성하여 추가
		this.add(new JButton("add"));
		this.add(new JButton("sub"));
		this.add(new JButton("mul"));
		this.add(new JButton("div"));
		this.add(new JButton("Calculate"));		
		//프레임창 너비 높이 사이즈 설정 
		this.setSize(300,250);
		//프레임창 보이게 설정
		this.setVisible(true);
	}	
	public static void main(String[] args) {		
		new FlowLayoutEx();//프레임창 객체 생성
	}
}




