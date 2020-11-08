public class Gallery{


public static void main(String[] photos)
{
	
	System.out.println("JVM invoked main");
	
	
	String storeIn=photos[0];
	System.out.println("photos storage mode : "+storeIn);
	switch(storeIn){
		case "Private":
			System.out.println("store images in private folder");
			break;
		case "Public":
			System.out.println("store images in public folder");
			break;
		case "Cloud":
			System.out.println("store images in cloud");
		   break;
		default:
			System.out.println("alert :: cannot store photos in " + storeIn + " formatt");
		
	}
			
	
	System.out.println("EXIT:: main");
	
}

}