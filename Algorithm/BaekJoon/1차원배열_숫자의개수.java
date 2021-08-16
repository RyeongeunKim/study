import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {  
  public static void main(String args[]) throws IOException{ 
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	  int a = Integer.parseInt(br.readLine());
	  int b = Integer.parseInt(br.readLine());
	  int c = Integer.parseInt(br.readLine());

	  int n = a * b * c;

	  int[] count = new int[10];
	  for(int i=0; i<10; i++) {count[i] = 0;}

	  while(n!=0){
		  count[n%10]++;
		  n /= 10;
	  }

	  for(int num : count){
		  System.out.println(num);
	  }

	  br.close();
  } 
}