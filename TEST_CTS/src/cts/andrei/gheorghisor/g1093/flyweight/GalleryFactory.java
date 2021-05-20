package cts.andrei.gheorghisor.g1093.flyweight;

import java.util.HashMap;

public class GalleryFactory {
		static HashMap<String, GalleryImageInterface> galleries = new HashMap<>();
		
		static {
			galleries.put(GalleryType.GRID_VIEW.toString(), new GalleryFlyweight("GridView"));
			galleries.put(GalleryType.LIST_VIEW.toString(), new GalleryFlyweight("ListView"));
		}
		
		public static GalleryImageInterface getGallery(GalleryType type) {
			return galleries.get(type.toString());
		}
}
