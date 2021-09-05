package Pack;

public class LoginFramework {
	private boolean isLogin = false;

	public void login() {
		if(isLogin == false) {
			System.out.println("서비스에 로그인 하셨습니다");
			isLogin = true;
		} else {
			System.out.println("이미 로그인 중입니다");
		}
	}
	public void logout() {
		System.out.println("로그아웃 되었습니다");
		isLogin = false;
	}
}
