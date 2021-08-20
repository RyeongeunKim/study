import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

//주제 : JFrame창 내부에 있는 ContentPane을 얻어 배경색을 오렌지 색으로 설정 하고,
//      이곳에 OK, Cancel, Ignore의  버튼들을 부착한 스윙 프로그램 작성.

//참고 : ContentPane 배경색을 변경하는 메소드  -> setBackground(Color.ORANGE);

//방법2. JFrame클래스를 상속받은 사용자 정의 프레임 클래스 만들기 
public class ContentPaneTest  extends JFrame { // 창 하나 만들기 
	
	//기본 생성자
	public ContentPaneTest() {
			
		//main메소드 내부에서 생성한 new ContentPaneTest() 프레임창의 창제목 저장
		this.setTitle("ContentPane과 JFrame");
	
		//프레임창에 부착되어 있는 ContentPane도화지를 얻자
		Container contentPane = this.getContentPane();
		
		//ContentPane도화지의 배경색을 오렌지색으로 변경
		contentPane.setBackground(Color.ORANGE);
		
		//배치관리자(배치메니저)란?
		//ContentPane도화지에 컴포넌트들을(버튼,텍스트필드,체크박스) 배치할 위치, 크기를 관리하는 클래스 
		
		//배치관리자 종류 -> FlowLayOut 배치관리자 클래스 
					   // 1. ContentPane도화지에 컴포넌트들을 추가 하는 순서대로 왼쪽에서 오른쪽으로 순서대로 배치
					   // 2. ContentPane도화지 전체화면에서 오른쪽에 더이상 배치될 공간이 없으면
		               //    아래로 내려와서 다시 왼쪽에서 오른쪽 순으로 배치
		
		//ContentPane도화지에  FlowLayout 배치관리자 설정
		contentPane.setLayout( new FlowLayout() );
		
		//OK ,Cancel, Ignore 버튼 컴포넌트들을 생성하여  순서대로  ContentPane도화지에 배치 !
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore"));
		
		//프레임창의  X 버튼을 클릭했을때  프레임창 닫으면서  자바프로그램 완전히 종료 하기 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//프레임창 크기  350 * 150 설정
		this.setSize(350, 150);
		//프레임창 윈도우 화면에 보이게 설정
		this.setVisible(true);
	}//생성자 끝

	public static void main(String[] args) {
		
		 new ContentPaneTest(); //JFrame클래스를 상속받아 만든 ContentPaneTest프레임창클래스에 대한 객체 생성

	}

}




