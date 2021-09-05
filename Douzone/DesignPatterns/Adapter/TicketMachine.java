package Pack;

public class TicketMachine {

	public static void main(String[] args) {
		TicketA ticketA = new TicketSystemA();
		ticketA.choice(1);
		ticketA.buy();
		ticketA.print();
		System.out.println("-------------------------");
		
		TicketG ticketG = new TicketSystemG();
		ticketG.choice(1);
		ticketG.buyOnOffline();
		ticketG.buyOnOnline();
		ticketG.print();
		System.out.println(ticketG.getMenu());
		System.out.println("-------------------------");
		
		TicketG ticketG2 = new TicketAdapter(new TicketSystemA());
		
		ticketG2.choice(1);
		ticketG2.buyOnOffline();
		ticketG2.print();
		try {
			System.out.println(ticketG2.getMenu());
		} catch (UnsupportedOperationException e) {
			System.out.println("이 서비스는 G사의 다른 시스템에서 제공되는 기능입니다");
		}
		
	}

}
