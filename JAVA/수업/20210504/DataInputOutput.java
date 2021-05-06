import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//이진수를 입출력 하는 방법 보기 
//예)
//    10  -> 4바이트
//    3.14 -> 8바이트
//    true 등등 여러개의 바이트 크기가 정해져 있는 기본데이터형식들을 1바이트씩 입출력 하는게 아니라...
//    좀더 편하게 여러바이트를 묶어서 하나의 기본데이터형식으로 입출력할수 있게 하는
//    DataInputStream클래스와 DataOutputStream클래스를 제공

public class DataInputOutput {
	public static void main(String[] args) throws IOException {
	
		//저장할 데이터 준비
		int iValue = 100;
		double dValue = 3.14;
		char cValue = '가';
		boolean bValue = true;
		
		//위 준비된 기본데이터들을  c:\\testData.txt파일에 저장
		//파일에 1바이트씩 1바이트씩 데이터를 저장(쓰기,저장)하기 위한 
		//FileOutputStream출력스트림 통로객체생성
			//new FileOutputStream("c:\\testData.txt");
		
		//1바이트씩 testData.txt파일에 저장(쓰기)하는 것아니라..
		//파일에 기본데이터타입의 크기로 묶어서 저장할수 있게 하기 위해..DataOutputStream객체의 생성자쪽으로
		//new FileOutputStream("c:\\testData.txt")객체를 전달하여 저장 시킨다
		DataOutputStream dout=new DataOutputStream(new FileOutputStream("c:\\testData.txt"));
		
		//실제로 testData.txt파일에  정수데이터를 저장(쓰기)
		dout.writeInt(iValue);
		dout.writeDouble(dValue);
		dout.writeChar(cValue);
		dout.writeBoolean(bValue);
		
		//DataOutputStream출력스트림 통로 사용후 객체메모리 자원 없애기
		dout.close();
		
		//c:\\testData.txt파일 내부에 이진수로 저장되어 있는 데이터를 읽어 들여서 이클립스에 출력
		
		//파일의 내용을 한바이트씩 읽어들이기위한 스트림 통로 객체 생성
		FileInputStream f = new FileInputStream("c:\\testData.txt");
		
		//파일에 저장된 내용을 기본자료형의 크기에 맞게 읽어들이기 위해 DataInputStream객체 생성시
		//위의 FileInputStream객체를 생성자로 전달해 저장
		DataInputStream din = new DataInputStream(f);
		
		//파일의 내용을 읽어 올떄 반드시 저장한 순서대로 읽어와야 한다.
		System.out.println(din.readInt());
		System.out.println(din.readDouble());
		System.out.println(din.readChar());
		System.out.println(din.readBoolean());
		

	}

}







