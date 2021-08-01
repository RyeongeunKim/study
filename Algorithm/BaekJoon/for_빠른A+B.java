import java.io.*;
import java.util.StringTokenizer;

class Main {  
  public static void main(String args[]) throws IOException { 
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	  BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	  
	  int t = Integer.parseInt(br.readLine());

	  // 입력받을 때 한줄로 받기 때문에 사용
	  // split처럼 사용함
	  StringTokenizer st;
	  
	  for(int i=0; i<t; i++){
		  st = new StringTokenizer(br.readLine(), " ");
		  int a = Integer.parseInt(st.nextToken());
		  int b = Integer.parseInt(st.nextToken());

		  //개행 문자열 사용 시 자동으로 String으로 바뀐다.
		  bw.write(a+b+"\n");
	  }

	  // flush 사용하여 한꺼번에 쏟아내기
	  bw.flush();
	  
	  bw.close();
	  br.close();
	  
  } 
}