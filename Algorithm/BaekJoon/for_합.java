import java.util.*;
class Main {  
  public static void main(String args[]) { 
	  Scanner sc = new Scanner(System.in);
	  int n = sc.nextInt();
	  int hap = 0;
	  for(int i=1; i<=n; i++){
		  hap += i;
	  }
	  System.out.print(hap);
  } 
}