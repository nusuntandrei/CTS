package cts.andrei.gheorghisor.g1093.builder;

public class Booking {
	private String hotelName;
	private int streetNr;
	
	private boolean smookingRoom;
	private boolean seaSideView;
	
	private RoomTypeInterface singleRoom;
	private RoomTypeInterface doubleRoom;
	
	private FloorLevelInterface firstFloor;
	private FloorLevelInterface secondFloor;
	
	Booking() {
		
	}

	private Booking(String hotelName, int streetNr, boolean smookingRoom, boolean seaSideView, RoomTypeInterface singleRoom,
			RoomTypeInterface doubleRoom, FloorLevelInterface firstFloor, FloorLevelInterface secondFloor) {
		super();
		this.hotelName = hotelName;
		this.streetNr = streetNr;
		this.smookingRoom = smookingRoom;
		this.seaSideView = seaSideView;
		this.singleRoom = singleRoom;
		this.doubleRoom = doubleRoom;
		this.firstFloor = firstFloor;
		this.secondFloor = secondFloor;
	}
	
	public static class BookingBuilder {
		Booking booking;
		
		public BookingBuilder(String hotelName, int streetNr) {
			this.booking = new Booking();
			this.booking.hotelName = hotelName;
			this.booking.streetNr = streetNr;
		}
		
		public BookingBuilder smookingRoom() {
			this.booking.smookingRoom = true;
			return this;
		}
		
		public BookingBuilder seaSideView() {
			this.booking.seaSideView = true;
			return this;
		}
		
		public BookingBuilder singleRoom(RoomTypeInterface room) {
			this.booking.singleRoom = room;
			return this;
		}
		
		public BookingBuilder doubleRoom(RoomTypeInterface room) {
			this.booking.doubleRoom = room;
			return this;
		}
		
		public BookingBuilder firstFloor(FloorLevelInterface floor) {
			this.booking.firstFloor = floor;
			return this;
		}
		
		public BookingBuilder secondFloor(FloorLevelInterface floor) {
			this.booking.secondFloor = floor;
			return this;
		}
		
		public Booking build() {
			return this.booking;
		}
	}
	
}	
	


