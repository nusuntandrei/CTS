package cts.andrei.gheorghisor.g1093.builder;

public class TestBuilder {

	public static void main(String[] args) {
		Booking booking1 = new Booking.BookingBuilder("Grand Hotel", 1).build();
		
		Booking booking2 =
				new Booking.BookingBuilder("International", 2)
				.smookingRoom()
				.build();
		
		Booking booking3 = new Booking.BookingBuilder("Orient", 3)
				.seaSideView()
				.singleRoom(null)
				.secondFloor(null)
				.build();
	}

}
