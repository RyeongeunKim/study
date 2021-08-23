import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Main {  
  public static void main(String args[]){ 
	  try{
		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		  BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		  int count = Integer.parseInt(br.readLine());

		  // 외부 for문
		  for(int i=0; i<count; i++){
			  StringTokenizer st = new StringTokenizer(br.readLine());
			  int innerCount = Integer.parseInt(st.nextToken());
			  int[] group = new int[innerCount];
			  int sum = 0;
			  // 내부 for문 
			  for(int j=0; j<innerCount; j++){
				  group[j] = Integer.parseInt(st.nextToken());
				  sum += group[j];
			  }
			  int avg = sum/innerCount;
			  int check = 0;
			  for(int k : group){
				  if(Integer.compare(k, avg) > 0){
					  check += 1;
				  }
			  } // 내부 for문 end
			  bw.write(String.format("%.3f",check*100.000/innerCount)+"%\n");
		  } // 외부 for문 end
		  bw.flush();
		  bw.close();
	  } catch (Exception e){
		  e.printStackTrace();
	  }
  } 
}