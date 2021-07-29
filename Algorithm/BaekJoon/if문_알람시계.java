import java.util.*;
class Main {  
  public static void main(String args[]) { 
	  Scanner sc = new Scanner(System.in);

	  int h = sc.nextInt();
	  int m = sc.nextInt();

	  // 내가 푼거(if문)
	  if(m >= 45){
		  System.out.print(h + " " + (m-45));
	  } else {
		  int n = 45 - m;
		  if(h == 0){
			  System.out.print(23 + " " + (60-n));
		  } else {
			  System.out.print((h-1) + " " + (60-n));
		  }
	  }
	  
	 // 숏코딩 참고(삼항연산자)
	  if(m < 0){
		  m += 60;
		  h = (h<1)?23:h-1;}
	  System.out.print(h + " " + m);
  } 
}