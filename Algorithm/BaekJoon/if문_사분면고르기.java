import java.util.*;
class Main {  
  public static void main(String args[]) { 
	  Scanner sc = new Scanner(System.in);

	  int x = sc.nextInt();
	  int y = sc.nextInt();

	  // 내가 푼거(if문 사용)
	  if(x > 0 && y > 0){
		  System.out.println(1);
	  } else if(x < 0 && y > 0){
		  System.out.println(2);
	  } else if(x < 0 && y < 0){
		  System.out.println(3);
	  } else {
		  System.out.println(4);
	  }  
	  
	 // 숏코딩 참고(삼항연산자를 사용하면 if문에 비해 코드 길이 수가 훨씬 짧음)

	 System.out.print(x>0?y>0?"1":"4":y>0?"2":"3");
  } 
}