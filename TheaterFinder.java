public class TheaterFinder {

public static void theatreFinderUsingEnum(Theater theatreName)
{

System.out.println("Theatres in Hubli");
	switch(theatreName){
		case PVR:
				System.out.println("Name of the Theatre : " +theatreName);
				System.out.println("capacity is 150");
				System.out.println("customer ratings: BEST");
				break;
		case CINEPOLIS:
				System.out.println("Name of the Theatre" +theatreName);
				System.out.println("capacity is 170");
				System.out.println("customer ratings: GOOD");
				break;
		case APSARA:
				System.out.println("Name of the Theatre" +theatreName);
				System.out.println("capacity is 300");
				System.out.println("customer ratings: BEST");
				break; 
		default :
				System.out.println(theatreName + ": Low rated Theatre");
	}

}

}
