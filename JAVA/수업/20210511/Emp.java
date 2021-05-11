import java.io.Serializable;

/*
	Serializable 객체 직렬화를 위한 인터페이스
	메소드 구현이 필요없는 인터페이스 구현을 내부적으로 자바가 해준다.
*/

//사원객체를 직렬화하겠다.
//사원클래스
public class Emp implements Serializable {

	// 사번
	private int no;
	// 이름
	private String name;
	// 직책
	private String job;
	// 부서번호
	private int dept;
	// 인사고가점수
	private double point;

	// 생성자 alt + shift + s o
	public Emp(int no, String name, String job, int dept, double point) {
		super();
		this.no = no;
		this.name = name;
		this.job = job;
		this.dept = dept;
		this.point = point;
	}
	
	// 사원번호, 이름, 직책, 부서번호, 인사고가점수를 모두 하나의 문자열로 만들어서 반환할 toString()메소드
	// Object클래스의 toString()메소드 오버라이딩 alt + shift + s v

	@Override
	public String toString() {
		
		return no + "\t" + name + "\t" + job + "\t" + dept + "\t" + point;
	}



}
