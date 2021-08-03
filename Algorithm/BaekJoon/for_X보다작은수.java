import java.io.*;
import java.util.StringTokenizer;

class Main {  
  public static void main(String args[]) throws IOException { 
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	  BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	  StringTokenizer st = new StringTokenizer(br.readLine());
	  
	  int n = Integer.parseInt(st.nextToken());
	  int x = Integer.parseInt(st.nextToken());

	  int[] arr = new int[n];

	  st = new StringTokenizer(br.readLine());

	  for(int i=0; i<n; i++){
		  arr[i] = Integer.parseInt(st.nextToken());

		  if(arr[i] < x){
			  bw.write(arr[i] + " ");
		  }
	  }

	  bw.flush();
	  bw.close();
	  br.close();
  } 
}