public class PlaceFinderTester
{
    public static void main(String[] args)
	{
		int distance = Integer.parseInt(args[0]);
		System.out.println("Entered Distance :"+ distance);
		String kms = PlaceFinder.place(distance);
		System.out.println(kms);
	}
}
