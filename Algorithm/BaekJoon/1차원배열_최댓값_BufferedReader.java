import java.io.*;

class Main {  
  public static void main(String args[]) throws IOException { 
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	  int[] num = new int[9];
	  int count = 0;
	  int max = 0;
	  for(int i=0; i<num.length; i++){
		  num[i] = Integer.valueOf(br.readLine());
		  if(num[i] > 99)
			  System.exit(0);
	  }

	  for(int i=0; i<num.length; i++){
		  if(num[i] > max){
			  max = num[i];
			  count = i+1;
		  }
	  }

	  System.out.println(max);
	  System.out.println(count);
  } 
}