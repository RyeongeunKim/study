import java.io.*;
import java.util.*;

class Main {  
  public static void main(String args[]) throws IOException { 
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	  int n = Integer.parseInt(br.readLine());
	  StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	  int max = -1000000;
	  int min = 1000000;
	  StringBuilder sb = new StringBuilder();

	  for(int i=0; i<n; i++){
		  int a = Integer.parseInt(st.nextToken());
		  if(a>max){
			  max = a;
		  }
		  if(a<min){
			  min = a;
		  }
	  }
	  sb.append(min).append(" ").append(max);
	  System.out.println(sb);
  } 
}