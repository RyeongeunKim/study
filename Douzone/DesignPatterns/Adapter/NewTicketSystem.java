package Pack;

public class NewTicketSystem implements TicketG {

	@Override
	public void choice(int token) {
		System.out.println("선택된 식권 타입은 " + token + "입니다");
	}

	@Override
	public void print() {
		System.out.println("식권을 출력합니다");
	}

	@Override
	public void buyOnOffline() {
		System.out.println("식권을 구매합니다");
	}

	@Override
	public void buyOnOnline() {
		throw new UnsupportedOperationException("지원되지 않는 기능");
	}

	@Override
	public String getMenu() {
		throw new UnsupportedOperationException("지원되지 않는 기능");
	}
	
}
