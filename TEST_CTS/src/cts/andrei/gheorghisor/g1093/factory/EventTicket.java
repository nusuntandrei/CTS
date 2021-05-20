package cts.andrei.gheorghisor.g1093.factory;

public class EventTicket extends OnlineBooking {

	public EventTicket(String eventName, int price) {
		super(eventName, price);
	}

	@Override
	public String getType() {
		return eventName;
	}

}
