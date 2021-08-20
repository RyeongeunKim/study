
/*
	인터페이스를 이용한 다형성	
	- 부모인터페이스 타입의 참조변수에 자식객체 저장(업캐스팅)
	- 부모인터페이스 타입의 참조변수에 저장된 자식객체의 주소를 이용하여
	  자식객체메모리의 멤버들을 참조 할수 있다.(업캐스팅)
	- 인터페이스 타입으로의 형변환도 가능하다.
*/
interface X{
	public abstract void print();
}
class A implements X{
	@Override
	public void print() {
		System.out.println("난 A다");
	}
}
class B implements X {
	@Override
	public void print() {
		System.out.println("난 B다");
	}
}

//인터페이스
interface Parseable{
	//구문분석을 수행하는 기능을 구현할 목적으로 추상메소드 parse(String fileName)정의
	public abstract void parse(String fileName);
}
//파일의 확장자가 XML이라는 것을 출력해주는 기능의 클래스 
class XMLParser implements Parseable{
	@Override
	public void parse(String fileName) {//document.xml
		//구문 분석작업을 수행하는 코드를 적는다.
		System.out.println(fileName + "- XML parsing completed.");
	}
}

class HTMLParser implements Parseable{
	@Override
	public void parse(String fileName) { 
		//구문 분석작업을 수행하는 코드를 적는다
		System.out.println(fileName + "- HTML parsing completed.");
	}
	
}

//파일확장자를 분석하여 그 해당 파일객체를 반환 하는일.
class PerserManager{
	
	//파일형식을 확인후! 그형식에 해당하는 객체를 반환함
	public static Parseable getParser(String type) {	
		//만약 파일확장자가 "XML"파일 이라면
		if(type.equals("XML")) {
			//XMLPerser자식객체를 생성하여 메소드를 호출한곳으로 리턴!
			return new XMLParser();
		}else {//"XML"확장자가 아니라면		
			//업캐스팅
			Parseable p = new HTMLParser();
			return p;
			//위두줄을  한줄로 간단하게 나타내면  return new HTMLParser();
		}		
	}
	
}

public class Test111 {
	public static void main(String[] args) {
	
		//X부모인터페이스 타입의 참조변수에 자식객체 저장 (업캐스팅)
		X x = (X)new A();
		  x = new B();
		//----------------------------------------

		//업캐스팅 
		//부모 인터페이스 타입(Parseable) 참조변수parser에 자식객체 저장
		Parseable parser = PerserManager.getParser("XML"); //new XMLParser();
		  		  //new XMlParser().parse("document.xml");
		 		  parser.parse("document.xml"); 
		 		  
		//업캐스팅
		 		  parser = PerserManager.getParser("HTML");//new HTMLParser();
		 		  //new HTMLParser().parse("document2.html");
		 		  parser.parse("document2.html");
		 		  
		 		  
		 		  
	}

}







