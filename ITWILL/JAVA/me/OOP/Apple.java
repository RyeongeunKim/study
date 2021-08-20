package oop;

//과일장수(과일판매자) fruitSeller클래스 만들기
class fruitSeller{

//변수선언
	//개당 사과 가격(final 키워드를 붙여 상수로 만들기) APPLE_PRICE
	final int APPLE_PRICE;
	
	//사과 보유 개수 numOfApple
	int numOfApple;
	
	//판매수익 myMoney
	int myMoney;
	
//생성자 만들기 : 매개변수로 받은 개당 사과 가격, 사과 보유 개수, 판매수익(현재 소유하고 있는 돈)을 변수에 저장
	 		//(apple_price,  numApple,   myMoneys)
	
	public fruitSeller(int apple_price, int numApple, int myMoneys) {
		APPLE_PRICE = apple_price;
		numOfApple = numApple;
		myMoney = myMoneys; 
	}

//사과 판매(saleApple) 메소드
	//매개변수: 구매자에게 받은 돈(money)
	
	int saleApple(int money) { 
		
		//판매한 사과수 구하기(num)
		int num = money / APPLE_PRICE;
		
		//사과 판매 후 보유한 사과수 차감
		numOfApple -= num;
		
		//판매 수익 누적
		myMoney += money;
		
		//실제 판매(구매)가 발생한 사과 개수를 리턴
		return num;
	}
	//사과 판매 후 남은 사과 개수와 판매수익을 출력하는 기능의 메소드
	void showSaleResult() {
		System.out.println("남은 사과 개수 : "+numOfApple);
		System.out.println("판매 수익 : "+myMoney);
	}
}

//과일구매자 fruitBuyer클래스 만들기

class fruitBuyer{
	//잔액
	int myMoney;
	//소유한 사과 개수
	int numOfApple;
	
	//생성자 만들기 : 매개변수로 받은 잔액과 사과 개수를 변수에 저장
	public fruitBuyer(int myMoney, int numOfApple) {
		this.myMoney = myMoney;
		this.numOfApple = numOfApple;
	}

//과일 구매(buyApple) 메소드
	//매개변수 : 판매자 객체, 지불할 금액
	public void buyApple(fruitSeller seller, int money) {
		
		//saleApple(int money)메소드 호출(돈을 매개변수로 전달) 
		// -> 구매한 사과 개수를 반환받음 
		// -> 구매한 사과를 현재 소유한 사과 개수에 누적
		numOfApple += seller.saleApple(money);
		
		//과일을 구매했기에 잔액에서 구매한 만큼 차감
		myMoney -= money;
	}
	
	//과일 구매 후 구매자의 잔액과 사과 개수 출력 메소드
	
	void showBuyResult() {
		System.out.println("현재 남은 돈 : " + myMoney);
		System.out.println("현재 사과 개수 : " + numOfApple);
	}

}

public class Apple {
	public static void main(String[] args) {
		
		//과일 판매자1 객체 생성하고
		//판매수익 0, 사과수 30, 가격 1500 으로 초기화할 생성자 호출
		fruitSeller seller1 = new fruitSeller(1500, 30, 0);
		
		//과일 판매자2 객체 생성하고
		//판매수익 0, 사과수 20, 가격 1000 으로 초기화할 생성자 호출
		fruitSeller seller2 = new fruitSeller(1000, 20, 0);
		
		//과일 구매자 객체 생성하고 잔액 10000, 사과수 0 으로 초기화할 생성자 호출
		fruitBuyer buyer = new fruitBuyer(10000, 0); 
		
		//과일 구매자 객체는 과일장수1 객체에게 4500원어치 사과 구매하기
		buyer.buyApple(seller1, 4500);
		
		//과일 구매자 객체는 과일장수2 객체에게 2000원어치 사과 구매하기
		buyer.buyApple(seller2, 2000);
		
		// 과일 판매자1의 현재 상황(잔고, 팔고 남은 사과 수) 출력
		System.out.println("-----과일 판매자1의 현재 상황-----");
		seller1.showSaleResult();
		
		//과일 판매자2의 현재 상황(잔고, 팔고 남은 사과 수) 출력
		System.out.println("-----과일 판매자2의 현재 상황-----");
		
		//과일 구매자의 현재 상황(잔고, 구매 후 보유하고 있는 사과수) 출력
		System.out.println("-----과일 구매자의 현재 상황-----");
		buyer.showBuyResult();
		
			
		
	}
}






