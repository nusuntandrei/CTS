package cts.andrei.gheorghisor.g1093.factory;

public class ConcertTicket extends OnlineBooking {

	public ConcertTicket(String eventName, int price) {
		super(eventName, price);
	}

	@Override
	public String getType() {
		return eventName;
	}

}
