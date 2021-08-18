import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {  
  public static void main(String args[]) throws Exception { 
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	  final int total = Integer.parseInt(br.readLine());
	  final String[] input = br.readLine().split(" ");
	  int score = 0;
	  int sum = 0;
	  int max = 0;
	  int i = 0;
	  for(i=0; i<input.length; i++){
		  score = Integer.parseInt(input[i]);
		  sum += score;
		  max = score > max ? score : max;
	  }
	  System.out.println(Math.round(sum * 10000.0 / max / total) / 100.0);
  } 
}