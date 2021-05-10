import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

//주제 : 키보드로 부터 입력받은 내용을 문자스트림방식으로 읽어 들여 문자스트림 방식으로 파일에 쓰기(저장)
public class CharstreamEx02 {
	public static void main(String[] args) throws IOException {
		
		//실제 존재하는 파일에 접근하여 그 파일에 데이터를 쓰기위해 제공되는 FileWriter객체를 저장할 변수
		FileWriter fw = null;
		
		//키보드로 부터 입력받은 전체데이터를 1바이트 단위로 읽어들일 스트림 통로만들기
		//System.in
		//문자 스트림 방식(2바이트 단위로)읽어 들일 스트림 통로로 업그레이드 하여 만들기
		//new InputStreamReader(System.in);
		//문자열 스트림 방식으로 데이터를 읽어 들이기 위해 스트림 통로 업그레이드 하여 만들기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		fw = new FileWriter("D:\\FileWriterTest.txt");
		
		//키보드로 부터 파일에 쓸 내용을 입력받기
		System.out.println("문장을 입력하시오.(stop을 입력하면 종료) : ");
		
		//한줄의 문자열씩 입력받아 읽어들인 데이터를 저장할 변수
		String str;
		
		do {
			//매 첫줄 마다 : <-- 출력
			System.out.print(":");
			//키보드로 부터 입력받은 데이터를 한줄씩 읽어 들이기
			str = br.readLine();
			
			if(str.equals("stop")) {
				break;
			}
			//그렇지 않으면 키보드로 부터 입력한 데이터를 한줄단위로 읽어 들여 저장(쓰기)
			str = str + "\r\n";
			//파일에 저장
			fw.write(str);
			
		//"stop"이라는 문자열이 입력되지 않을 동안 반복
		} while ( !(str.equals("stop")) );
		
		//FileWriter객체 자원해제
		fw.close();
		//BufferedReader객체 자원해제
		br.close();
	}

}
