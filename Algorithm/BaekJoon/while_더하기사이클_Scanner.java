import java.util.Scanner;

class Main {  
  public static void main(String args[]) { 
	  Scanner sc = new Scanner(System.in);

	  int n = sc.nextInt();
	  sc.close();

	  int cnt = 0;
	  int copy = n;

	  while(true){
		  n = ((n%10) * 10) + (((n/10) + (n%10)) % 10);
		  cnt++;

		  if(copy == n){
			  break;
		  }
	  }
	  System.out.println(cnt);
  } 
}