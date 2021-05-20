package cts.andrei.gheorghisor.g1093.factory;

public class TicketFactory {
	public static OnlineBooking getType(TicketType type, int price) {
		OnlineBooking ticket = null;
		switch(type) {
		case CONCERT:
			ticket = new ConcertTicket("Avicii", 100);
			break;
		case EVENT:
			ticket = new EventTicket("ASEOpening", 200);
			break;
		case MUSEUM:
			ticket = new MuseumTicket("Antipa", 300);
			break;
		default:
			throw new UnsupportedOperationException();
		}
		
		return ticket;
		
	}
}
