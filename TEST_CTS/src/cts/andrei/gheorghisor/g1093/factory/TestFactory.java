package cts.andrei.gheorghisor.g1093.factory;

public class TestFactory {

	public static void main(String[] args) {
		OnlineBooking ticket = TicketFactory.getType(TicketType.CONCERT, 100);
		
		ticket = TicketFactory.getType(TicketType.EVENT, 200);
		ticket = TicketFactory.getType(TicketType.MUSEUM, 300);

	}

}
