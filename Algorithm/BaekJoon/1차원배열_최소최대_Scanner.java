import java.util.*;

class Main {  
  public static void main(String args[]) { 
	  Scanner sc = new Scanner(System.in);
	  int n = sc.nextInt();
	  int[] data = new int[n];

	  for(int i=0; i<n; i++){
		  data[i] = sc.nextInt();
	  }

	  int min = data[0]; //가장 큰수
	  int max = data[0];

	  for(int i=0; i<n; i++){
		  if(min > data[i]){
			  min = data[i];
		  }
	  } //최소값

	  for(int i=0; i<n; i++){
		  if(max < data[i]){
			  max = data[i];
		  }
	  }

	  System.out.println(min +" "+ max);
  } 
}