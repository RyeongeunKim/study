//클래스, 객체 생성, 생성자 만들기  연습

//MyDate라는 이름의 클래스 정의

class MyDate{

	//정수값을 저장할 year, month, day 변수 정의
	
	int year, month, day;

	//기본 생성자 정의
		//year 2014 저장
		//month 1 저장
		//day  1 저장
	
	MyDate(){
		year = 2014;
		month = 1;
		day = 1;
	}
	
	//생성자 정의
	//년도 값을 n_year매개변수로 전달 받아
		//year  n_year 저장
		//month  1 저장
		//day   1 저장
	
	MyDate(int n_year){
		year = n_year;
		month = 1;
		day = 1;
	}	
	
	
	//생성자 정의
	//년도, 월값을 n_year,n_month매개변수로 전달 받아
		//year    n_year 저장
		//month   n_month 저장
		//day  1 저장
	MyDate(int n_year, int n_month){
		year = n_year;
		month = n_month;
		day = 1;
	}
	//생성자 정의
	//년도, 월, 일 값을 n_year, n_month, n_day매개변수로 전달 받아
		//year   n_year 저장
		//month  n_month 저장
		//day   n_day 저장
	MyDate(int n_year, int n_month, int n_day){
		year = n_year;
		month = n_month;
		day = n_day;
	}	
	//매개변수 n_year로 전달 받은 값을  year변수에 저장시킬 메소드 정의
	
	void setYear(int n_year) {
		year = n_year;
	}

	//매개변수 n_month로 전달 받은 값을  month변수에 저장시킬 메소드 정의
	
	void setMonth(int n_month) {
		month = n_month;
	}
	
	//매개변수 n_day로 전달 받은 값을  day변수에 저장시킬 메소드 정의
	
	void setDay(int n_day) {
		day = n_day;
	}

	//year변수에 저장되어 있는 값을 반환할 목적의  getYear메소드 정의
	
	int getYear() {
		return(year);
	}

	//month변수에 저장되어 있는 값을 반환할 목적의  getMonth메소드 정의
	
	int getMonth() {
		return(month);
	}

	//day변수에 저장되어 있는 값을 반환할 목적의  getDay메소드 정의
	
	int getDay() {
		return(day);
	}

	//prn메소드 정의 : year-month-day 출력 
	void prn() {
		System.out.println(year + "-" + month + "-" + day);
	}
	
}	
	

public class Test63 {

	public static void main(String[] args) {
		
		//MyDate클래스를 이용해 객체 생성시 기본생성자 호출!
		//참조변수 이름 m
		MyDate m =  new MyDate();

		//출력
		//2014
		//1
		//1
		 
		System.out.println(m.getYear());
		System.out.println(m.getMonth());
		System.out.println(m.getDay());
		
		//set으로 시작하는 메소드들 호출해서 값 저장
		//2014
		//8
		//6
		m.setYear(2014);
		m.setMonth(8);
		m.setDay(6);

		
		//get으로 시작하는 메소드들 호출해서 출력
		//출력
		//2014
		//8
		//6
		System.out.println(m.getYear());
		System.out.println(m.getMonth());
		System.out.println(m.getDay());
		
		//-----------------
		
		//MyDate클래스를 이용해 객체 생성시 년도 값을 전달 받는 생성자 호출! 
		//호출시 전달할 값 2015
		//참조변수 m2
		MyDate m2 = new MyDate(2015);
		
		//출력
		//2015-1-1
		m2.prn();
		
		
		//MyDate클래스를 이용해 객체 생성시 년도,월 값을 전달 받는 생성자 호출!
		//호출시 전달할 값 2016, 5
		MyDate m3 = new MyDate(2016, 5);
		//출력
		//2016-5-1
		m3.prn();
		
		//MyDate클래스를 이용해 객체 생성시 년도,월,일 값을 전달 받는 생성자 호출!
		//호출시 전달할 값 2017, 7, 7
		MyDate m4 = new MyDate(2017, 7, 7);
		m4.prn();
		
		//출력
		//2017-7-7	
		
		
	}

}
