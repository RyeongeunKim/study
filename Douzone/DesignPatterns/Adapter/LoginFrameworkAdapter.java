package Pack;

public class LoginFrameworkAdapter implements ILoginFramework {
	// 확장 클래스 멤버변수 선언
	private LoginFramework login;
	private String loginType;
	
	// 생성자에서 생성
	public LoginFrameworkAdapter() {
		login = new LoginFramework();
		loginType = "패턴";
	}
	
	// 기존 기능 수정하여 사용
	@Override
		public void login() {
			System.out.print(loginType + " 방식으로 "); 
		}

	// 기존 기능 그대로 사용
	@Override
	public void logout() {
		login.logout();
	}

	// 새로운 기능 생성
	@Override
	public void setType(String type) {
		loginType = type;
		System.out.println(type + "으로 로그인 타입이 변경되었습니다");
	}
}
