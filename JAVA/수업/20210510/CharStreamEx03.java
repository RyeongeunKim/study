import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//주제 : 문자스트림 방식을 이용해서 파일에 저장된 데이터를 한줄단위로 읽어 들여
//		이클립스의 console탭에 출력

public class CharStreamEx03 {

	public static void main(String[] args) throws IOException {
		
		//문자스트림 방식으로 파일로 부터 데이터를 읽어 들이기 위한 스트림 통로 준비
		FileReader fReader = new FileReader("D:\\FileWriterTest.txt");
		//한줄 단위로 데이터를 읽어 들이기 위해 스트림 통로 업그레이드 하여 준비
		BufferedReader br = new BufferedReader(fReader);
		//한줄 단위로 읽어 들인 데이터 저장할 변수
		String s;
		//반복문을 이용하여 한줄단위로 데이터를 읽어 들이자
		while((s = br.readLine()) != null ) {
			//한줄 단위로 읽어들인 s변수에 저장된 값 이클립스에 출력
			System.out.println(s);
		}
		//자원해제
		br.close();
		fReader.close();

	}

}
