package 이벤트처리;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;

class Exercise13_1 extends JFrame {
	final int SIZE = 5; // 빙고판의 크기
	JButton[] btnArr = null;
	String[] birds = { // 버튼에 넣을 문자열들
			"참새", "두루미", "황새", "비둘기", "까오기", "오리", "타조", "부엉이", "올빼미", "뱁새", "꿩", "닭", "구관조", "잉꼬", "매", "거위", "독수리",
			"콘돌", "봉황", "공작", "까치", "까마귀", "앵무새", "꾀꼬리", "고니" };

	Exercise13_1() {
		this("Bingo Game");
	}

	Exercise13_1(String title) {
		super(title);
		setLayout(new GridLayout(SIZE, SIZE)); // Frame의 layout을 GridLayout으로
		MyEventHandler handler = new MyEventHandler();
		btnArr = new JButton[SIZE * SIZE]; // 5*5=25개의 버튼을 담을 객체배열을 만든다.
		// Frame에 버튼을 추가한다.
		for (int i = 0; i < SIZE * SIZE; i++) {
			btnArr[i] = new JButton(birds[i]);// 배열 birds의 값을 버튼의 Label로 한다.
			btnArr[i].addActionListener(handler); // 버튼에 이벤트리스너를 추가
			add(btnArr[i]); // 버튼을 Frame에 추가한다.
		}
		// Frame의 우측 상단의 x버튼(닫기버튼)을 누르면 프로그램을 종료한다.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Frame창 사이즈 및 보이게 설정
		setSize(500, 500);
		setVisible(true);
	}

	//이벤트 리스너 클래스 (내부클래스형식)
	class MyEventHandler implements ActionListener {
		public void actionPerformed(ActionEvent ae) {
			JButton btn = (JButton) ae.getSource();
			System.out.println(btn.getText()); // 눌러진 버튼의 Label을 콘솔에 출력
			btn.setBackground(Color.LIGHT_GRAY); // 백그라운드를 밝은 회색으로 변경
		}
	} // MyEventHandler

	public static void main(String args[]) {
		new Exercise13_1("Bingo Game");	
	}
}
