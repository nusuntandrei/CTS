package cts.andrei.gheorghisor.g1093.factory;

public class MuseumTicket extends OnlineBooking {

	public MuseumTicket(String eventName, int price) {
		super(eventName, price);
	}

	@Override
	public String getType() {
		return eventName;
	}

}
