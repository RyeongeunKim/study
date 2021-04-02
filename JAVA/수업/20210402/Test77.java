


class Product2{
	//생성된 객체(인스턴스)의 갯수를? 저장하기 위한 클래스변수 count선언
	static int count = 0; //1위 
	//객체(인스턴스)의 고유 번호를 저장하기 위한 인스턴스변수  serialNo선언
	int serialNo; //3위
	//객체(인스턴스) 변수의 값을 저장시키는 
	//인스턴스 초기화블럭 사용
	//사용용도 : new Product2()객체가 생성될떄 마다  
			 //위 count변수의 값을 1씩 증가시켜서 seralNo변수에 저장
	{
		++ count;
		serialNo = count;
	}//4위
	//기본 생성자
	public Product2() { //5위 
	
	}	
}
public class Test77 {
	public static void main(String[] args) {//2위 	
		//6위 : p1참조변수에 객체의 주소값 저장 
		Product2 p1 = new Product2();
		Product2 p2 = new Product2();
		Product2 p3 = new Product2();	
		//7위
		System.out.println("p1참조변수에 저장된 제품객체의(serialNo)는 " + p1.serialNo);
		System.out.println("p2참조변수에 저장된 제품객체의(serialNo)는 " + p2.serialNo);
		System.out.println("p3참조변수에 저장된 제품객체의(serialNo)는 " + p3.serialNo);
		System.out.println("생산된 제품 개수는 모두 " + Product2.count + "개 입니다.");

	}

}





