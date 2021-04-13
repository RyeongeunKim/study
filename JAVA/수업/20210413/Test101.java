

// 업캐스팅을 하는 이유는 다형성 특징을 이용하기 위해서 이다. 연습

class 해장국{ //<-부모클래스 역할을 함
	
	public void 간맞추기() {
		System.out.println("소금치기");
	}
}

class 뼈다귀해장국 extends 해장국{//<-자식클래스 역할을 함
	
	@Override
	public void 간맞추기() {
		System.out.println("뼈다귀해장국에는 들깨가루 넣기");
	}

	public void 뼈추가하기() {
		System.out.println("뼈추가!");
	}
	
}

class 콩나물해장국 extends 해장국{ //<- 자식클래스 역할을 함
	
	@Override
	public void 간맞추기() {
		System.out.println("콩나물해장국에 고추가루 넣기");
	}

	public void 콩나물넣기() {
		System.out.println("콩나물!!");
	}
	
}


class 취객{							//new 콩나물해장국()
									//new 뼈다귀해장국()
	public void 해장국간맞추기(해장국 무슨해장국) {
		
		무슨해장국.간맞추기();
	}
//	
//	public void 뼈다귀해장국간맞추기(뼈다귀해장국   뼈다귀해장국1) {
//		뼈다귀해장국1.간맞추기();
//	}
//	
//	public void 콩나물해장국간맞추기(콩나물해장국  콩나물해장국1) {
//		콩나물해장국1.간맞추기();
//	}
//		
}


public class Test101 {
	public static void main(String[] args) {
		
//		취객 취객1 = new 취객();
//		
//		뼈다귀해장국 뼈 = new 뼈다귀해장국();
//		취객1.뼈다귀해장국간맞추기(뼈);
//		
//		콩나물해장국 콩 = new 콩나물해장국();
//		취객1.콩나물해장국간맞추기(콩);

		취객 취객2 = new 취객();
		
		취객2.해장국간맞추기(new 뼈다귀해장국());
		취객2.해장국간맞추기(new 콩나물해장국());
		
		//업캐스팅
		//부모클래스타입의 참조변수에 자식객체 생성 해서 저장
//		해장국 해장국한그릇 = new 뼈다귀해장국();
//		취객2.해장국간맞추기(해장국한그릇);
//		
//			 해장국한그릇 = new 콩나물해장국();
//		취객2.해장국간맞추기(해장국한그릇);
		
		
		
		
	}

}






