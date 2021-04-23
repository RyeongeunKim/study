
//박싱, 언박싱 연습하기
public class Test126 {

	public static void main(String[] args) {
		
		//Integer클래스에 대한 객체를 생성하여 정수10 박싱하기(저장하기)
		//참조변수이름 i
		Integer i = new Integer(10);
		
		//Double클래스에 대한 객체를 생성하여 실수3.14 박싱하기(저장하기)
		//참조변수이름 d
		Double d = new Double(3.14);

		//출력
		//10
		//3.14
		System.out.println(i);
		System.out.println(d);
		
		//위의 Integer객체에 저장되어 있는 10 언박싱하기(얻어오기)
		//얻어와서 int i2변수에 저장
		int i2 = i.intValue();
		
		//int i2변수에 저장된 10 출력
		System.out.println(i2);
		
		//위의 Double객체에 저장되어 있는 실수값 3.14 언박싱하기(얻어오기)
		//얻어온 값에 1.2를 더하여 새로운 Double객체의 인스턴스변수에 박싱하기(저장하기)
		//박싱후 d참조변수에 저장
		d = new Double(d.doubleValue() + 1.2);
		
		//d참조변수에 저장된 Double객체의 정보를 toString()메소드를 호출하여 출력
		//출력
		//10
		//4.34
		System.out.println(d.toString());

	}

}
