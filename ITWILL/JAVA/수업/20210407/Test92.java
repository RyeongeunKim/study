import java.net.NoRouteToHostException;

//연습3
/*
수업시간에 클래스의 생성자 정의 및 호출방식에 대해 설명 드렸습니다.
이내용을 바탕으로 다음 클래스에 적절한 ***생성자***를 삽입해보자. 
그리고 이의 확인을 위한 main메소드도 적절히 정의해보자.

Car 클래스는 가솔린으로 동작하는 자동차를 표현한 것이고,
HybridCar 클래스는 가솔린과 전기로 동작하는 자동차를 표현한것이다. 
그리고 마지막으로 HybridWaterCar 클래스는 가솔린과 전기뿐만아니라..
물도 동시에 연료로 사용할 수 있는, 가상의 자동차를 표현 했습니다. 
그러나 이문제는 위의 클래스들이 의미하는 바를 몰라도 해결이 가능합니다. 
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

밑의 소스 를 수정하여 생성자 삽입하기.
*/
//기본연료자동차 = 가솔린
class Car {

	int gasolineGauge; // 잔여 가솔린량
	
	public Car(int oil) {
		this.gasolineGauge = oil;
	}
}
// 하이브리드 자동차 =  전기 + 가솔린
class HybridCar extends Car {
	
	int electricGauge;// 잔여 전기량	
	
	public HybridCar(int oil, int ele) {
		super(oil);
		this.electricGauge = ele;
	}	
}
// 하이브리드 워터카 = 워터 + 전기 + 가솔린
class HybridWaterCar extends HybridCar {
	
	int waterGauge; // 잔여 워터량
	
	public HybridWaterCar(int oil, int ele, int wat) {
		super(oil,ele);
		this.waterGauge = wat;
	}

	public void showCurrentGauge() {
		System.out.println("잔여 가솔린량 : " + gasolineGauge);
		System.out.println("잔여 전기량 : " + electricGauge);
		System.out.println("잔여 워터량 : " + waterGauge);

	}

}

public class Test92 {
	public static void main(String[] args) {
		
		HybridWaterCar hwCar1 = new HybridWaterCar(4, 2, 3);
		System.out.println("하이브리드 워터카1");
		hwCar1.showCurrentGauge();
		
		HybridWaterCar hwCar2 = new HybridWaterCar(9, 5, 7);
		System.out.println("하이브리드 워터카2");
		hwCar2.showCurrentGauge();
		
		// 출력 결과
/*		
		하이브리드 워터카1
		잔여 가솔린량 : 4
		잔여 전기량 : 2
		잔여 워터량 : 3
		-------------------
		하이브리드 워터카2
		잔여 가솔린량 : 9
		잔여 전기량 : 5
		잔여 워터량 : 7

	*/
	}
}

