

//지난 Test59.java파일에 작성한 과일장수 이야기  
//생성자 이용하는 방법으로 업그레이드 시키기

/*
	FriutSeller(과일장수) 클래스 내부 수정
	1. 사과 한개당 가격 을 저장할 APPLE_PRICE변수에 final을 붙이자.
	2. 추가한 initMembers메소드 삭제.
	3. 판매수익, 사과보유개수, 사과 한개당 가격을 변수에 저장시킬 생성자 추가.

*/


//(2단계) 클래스 설계도 만들기

//과일장수(과일판매자) FriutSeller클래스 만들기 
class FriutSeller{
	
//변수
	//사과한개당 가격
	final int APPLE_PRICE; 
	
	//보유하고 있는 사과 개수 
	int numOfApple;
	
	//판매수익
	int myMoney;

	//개발자가 생성자 한개 이상을 만들어 놓으면 
	//JVM은 기본생성자를 만들어 놓지 않기 떄문에..
	//직접 개발자가 기본생성자를 만들어 놓아야 합니다.
//	public FriutSeller() {
//		this.APPLE_PRICE = 0;
//	}
	
//생성자
	//new 객체 생성 하는 동시에.. 호출되는 생성자 만들기
	//생성자의 역할 : 판매수익, 사과보유개수, 사과 한개당 가격을 각 변수에 저장
	public FriutSeller(int apple_price, int numApple, int myMoneys) {	
		APPLE_PRICE = apple_price; //사과 한개당 가격을 상수에 저장
		numOfApple = numApple; //사과 보유 개수 변수에 저장
		myMoney = myMoneys;//과일장수가 현재 소유 하고 있는 돈을  변수에 저장
	}
	//메소드
	//사과판매 행동의 메소드
	int saleApple(int money) { //사과 구매자로 부터 받은 돈을 매개변수로 얻는다.
		
		//판 사과 개수 구하기  =  사과 구매자로부터 받은 금액 / 사과 한개당 가격
		int num = money / APPLE_PRICE;
		
		//사과 판매후 사과판매자가 보유하고 있는 사과수 차감
		numOfApple -= num;//판매한 사과수 차감
		
		//판매 수익 누적
		myMoney += money;
		
		//실제 판매(구매)가 발생한 사과 개수를 반환(리턴)
		return num;
	}
	//사과 판매후 남은사과개수, 판매수익(과일판매자의 잔고)을 출력하는 기능의 메소드 
	void showSaleResult() {
		System.out.println("남은 사과 개수 : " + numOfApple);
		System.out.println("판매 수익 : " + myMoney);
	}
	
}

/*
	FruitBuyer(과일구매자) 클래스 내부 수정
	1. 현재 소유하고 있는 현금  0원,  현재 소유하고 있는 사과수 0개 로 저장
	2. 객체 생성시..구매자의 현재 소유하고 있는 현금, 사과 보유 개수 를  저장할 생성자 추가 
*/


//과일구매자 FruitBuyer클래스 만들기
class FruitBuyer{
	//현재 소유 금액 
	int myMoney;
	//현재 소유 하고 있는 사과 개수 
	int numOfApple;
	
//생성자 -> 단축키 :  alt + shift + s   o
	//new FruitBuyer(10000); 객체생성시..
	//또는
	//new FruitBuyer(20000); 객체생성시..
	//현재 소유금액을 생성자의 매개변수로 전달 해  위 int myMoney변수에 저장할 생성자 추가
	public FruitBuyer(int myMoney, int numOfApple) {
		this.myMoney = myMoney;
		this.numOfApple = numOfApple;
	}

	//과일구매 기능의 메소드
	//매개변수 : 과일을 구매하기 위한 판매자 대상 객체를 전달 받은 변수 
	//         과일 구매시 지불할 금액을 전달받을 변수 
	public void buyApple(FriutSeller seller, int money) {
		
		//과일 판매자 객체(seller참조변수활용)에게 과일을 구매 하기 위해
		//과일 판매자 객체의 saleApple(int money)메소드 호출시.. 돈을 매개변수로 전달 함.
		//그리고 과일 판매자가 판매한(과일 구매자가 구매한) 사과 개수를 반환 받아옴.
		//과일 구매자객체 관점에서 구매한 사과 개수를 자신의 현재 소유하고 있는 사과개수에 누적
		numOfApple += seller.saleApple(money);
		
		//과일 구매자객체 관점에서 과일 구매후 돈을 지불 했기 때문에
		//지갑에서 돈이 차감되어야 한다
		myMoney -= money;
	}
	
	//과일 구매후 과일 구매자의 현재 남은 돈과  현재 가지고 있는 사과 개수 출력
	void showBuyResult() {
		System.out.println("현재 남은 돈 : " + myMoney);
		System.out.println("현재 가지고 있는 사과 개수  : " + numOfApple);
	}	
}



public class Test64 {
	public static void main(String[] args) {
			
		//과일 판매자(과일 장수)1 객체 생성
		//new 객체 생성시.. 판매수익 0, 보유하고 있는 사과수 30, 개당 가격 1500을 
		//객체변수에 초기화할 생성자 호출
		FriutSeller seller1 = new FriutSeller(1500, 30, 0);
		
		//과일 판매자(과일 장수)2 객체 생성
		//new 객체 생성시.. 판매수익 0, 보유하고 있는 사과수 20, 개당 가격 1000을
		//객체 변수에 저장시킬 생성자 호출
		FriutSeller seller2 = new FriutSeller(1000, 20, 0);
		
		//과일 구매자 객체 생성과 동시에..객체변수의 값을 초기화할 생성자 호출
		//생성자 호출~~ 과일 구매자의 현재 소유하고 있는 현금 셋팅을위해 10000원 전달
		FruitBuyer buyer1 = new FruitBuyer(10000, 0);
		
		//과일 구매자 객체는  과일장수1객체에게.. 4500원어치~ 사과 구매하기 
		buyer1.buyApple(seller1, 4500);
		
		//과일 구매자 객체는 과일장수2객체에게.. 2000원어치~ 사과 구매하기
		buyer1.buyApple(seller2, 2000);
		
		//과일 판매자1의 현재 상황 (잔고, 팔고 남은 과일 수 ) 출력
		System.out.println("-----과일 판매자1의 현재 상황----");
		seller1.showSaleResult();
		
		//과일 판매자2의 현재 상황 (잔고, 팔고 남은 과일 수 ) 출력
		System.out.println("-----과일 판매자2의 현재 상황----");
		seller2.showSaleResult();
		
		//과일 구매자의 현재 상황(잔고, 구매 후 보유하고 있는 과일수 )출력
		System.out.println("------과일 구매자의 현재 상황----");
		buyer1.showBuyResult();	
	}
}






