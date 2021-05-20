package cts.andrei.gheorghisor.g1093.flyweight;
import java.util.ArrayList;

public class GalleryFlyweight implements GalleryImageInterface{
	
	String name;
	ArrayList<Integer> image = new ArrayList<>();
	
	GalleryFlyweight(String name) {
		super();
		this.name = name;
	}



	@Override
	public void display(GalleryImage gallery) {
			System.out.println(String.format("Displaying images: ", name, gallery.bitmapName, gallery.pixels));
	}

}
