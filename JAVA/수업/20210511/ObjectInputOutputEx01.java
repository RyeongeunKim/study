import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
	[JAVA IO - 객체 직렬화]
	
	*직렬화 : 객체를 바이트단위로 나란히 한줄로 내보내는 방식
	*객체 직렬화 : 객체(메모리에 있는)를 다른곳(보조기억장치)으로 전송하려고 스트림통로를 이용하여
	             바이트 데이터로 변환시키는것.
	             
	            - 메모리에 있는 객체를 보조기억장치에 저장할수 있도록 바이트데이터로 변환하는것.
	            - 반대의 역할 -> 객체 역직렬화
	*직렬화를 하는 이유 : 객체가 생성되어 적재되는 메모리는 순간적이기 떄문에 영구적으로 보조기억장치에
					  저장 시켜 보관 하기위해 직렬화를 사용한다.
	
	*객체를 직렬화 하기 위한 두가지 방법
	 1) Serializable 인터페이스 구현
	 	- 이 인터페이스를 구현한 클래스를 작성하면 해당 클래스의 모든 멤버변수가 직렬화 대상이 된다.
	 	- 객체가 스트림통로를 통해 직렬화 될때는 객체에 있는 멤버변수에 저장된 데이터가 직렬화가 되는 것이다.
	 	- 객체의 멤버변수 중에 직렬화 대상에 제외 하고 싶다면 transient키워드를 사용하면 된다.
	 
	 2) Externalizable 인터페이스 구현 


	* 객체의 직렬화
	  - 객체를 직렬화 하고 다시 역직렬화 시킬수 있는 클래스가 ObjectInputStream과 ObjectOutputStream이다.
	  
	* ObjectInputStream클래스
	  - ObjectInput인터페이스를 구현한 자식클래스로서 객체를 파일에 기록 가능한 클래스이다.
	  - ObjectInput인터페이스는  writeObject(Object obj)메소드를 포함 하는데...
	    이메소드가 객체의 데이터를 직렬화 시켜주는 메소드(직렬화 메소드) 이다.
	    만약 매개변수obj로 전달 받는 객체가  Serializable인터페이스를 구현받지 않는 형태라면
	    NotSerializableException예외가 발생한다.
	    보통 직렬화된 데이터를 저장할 파일의 확장자는 "ser"로 정하는 것이 관례이다.
	
	* ObjectOutputStream클래스
	  - ObjectInput 인터페이스를 구현한 자식클래스로서 직렬화된 객체의 내용을 읽어들일수 있게 도와 주는 클래스이다.
	    ObjectInput 인터페이스는 readObject()메소드를 포함하는데....
	    이메소드는 객체의 데이터를 복원시켜주는 메소드(역 직렬화 메소드) 이다.
*/
public class ObjectInputOutputEx01 {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		
		//Emp객체생성
		Emp kim = new Emp(1, "김유신", "과장", 3001, 3.4);
		
		//Emp객체를 일단 파일에 저장시키기 위해 
		//(어느경로에 저장할것인지 정하기, 저장시 덮어쓰기 X 추가모드(true)로 지정)
		FileOutputStream fos = new FileOutputStream("D:\\object.txt", true);
		
		//위 생성한 Emp kim참조변수에 저장된 객체를 
		//objext.txt파일에 저장시키기 위한 ObjectOutputStream출력 스트림 통로 준비
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		//Emp객체를 직렬화 시키기 : Emp객체에 저장된 각변수값들을 바이트데이터로 변환하여 objext.txt파일에 출력
		oos.writeObject(kim);
		
		//자원해제
		oos.close();
		fos.close();
		
		//이클립스에서 테스트
		//순서1) 컴파일 한다.  실행한다.
		//순서2) D:\\object.txt파일을 열어 확인
		//ы sr Emp嗽G?뉨2 I deptI noD pointL 
		//jobt Ljava/lang/String;L nameq ~ xp  ?   @333333t 怨쇱옣t 	源?좎떊
		//이진 데이터 형식으로 저장되어 깨져 보인다.

		//현재 D:\\object.txt파일에 저장된 Emp객체의 정보를 읽어 들이기 위한 스트림 통로 준비
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\object.txt"));
		
		//현재 D:\\object.txt파일에 저장된 Emp객체의 정보를 역직렬화를 통해 읽어와 
		//Emp kim2참조변수에 저장
		Emp kim2 = (Emp)ois.readObject();
		
		System.out.println("사번\t이름\t직책\t부서\t점수");
		System.out.println("------------------------------");
		System.out.println(kim2.toString());
		
		
		
		
		
	}

}














