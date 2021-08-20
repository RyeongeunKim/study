import java.util.Scanner;
//문제1 (파일공유)
/*두정수의 나눗셈에서 ArithmeticException을 처리하도록 수정하기 연습*/
//try-catch 문을 이용하여 정수를 0으로 나누려고 할떄 "0으로 나눌수 없습니다"
//라는 경고 메세지를 출력하도록 프로그램을 작성하라.
//100,0을 각각 입력하면 catch블럭에서 예외처리하기.

public class Test1 {
	public static void main(String[] args) {
//키보드로부터 입력받을  Scanner객체생성,
//참조변수 rd //생성자에 System클래스의 in객체 전달

//나뉨수 저장변수	정수형(4) divisor 0으로 초기화

//나눌수 저장변수	정수형(4) dividend 0으로 초기화

//"나뉨수를 입력하시오:"//나뉨수 정수형으로 입력받아  divisor저장

//"나눌수를 입력하시오 :" //나눌수 정수형으로 입력받기 dividend 저장

System.out.println(dividend + "를" + divisor + "로 나누면 몫은" + dividend/divisor + "입니다.");
		
//출력결과
//나뉨수를 입력하시오:100
//나눌수를 입력하시오 :0
//0으로 나눌 수 없습니다.
	
		
	}

}
