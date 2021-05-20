package cts.andrei.gheorghisor.g1093.flyweight;

public class TestFlyweight {

	public static void main(String[] args) {
		GalleryImage galleryGrid1 = new GalleryImage("Orient Hotel");
		GalleryImage galleryGrid2 = new GalleryImage("Intercontinental Hotel");
		
		GalleryImage galleryList1 = new GalleryImage("Traian Hotel");
		GalleryImage galleryList2 = new GalleryImage("Hilton Hotel");
		
		GalleryImageInterface galleryModel = GalleryFactory.getGallery(GalleryType.GRID_VIEW);
		galleryModel.display(galleryGrid1);
		galleryModel.display(galleryGrid2);
		
		GalleryFactory.getGallery(GalleryType.LIST_VIEW).display(galleryList1);
		GalleryFactory.getGallery(GalleryType.LIST_VIEW).display(galleryList2);

	}

}
