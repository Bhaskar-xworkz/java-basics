public class Football
{
	public static void main(String[] args)
	{
		System.out.println("Some Great Footballers of All Time");
		greatest();
	}
	public static void greatest()
	{
		String[] listOfFootballers = {"Lionel Messi","Cristiano Ronaldo","Diego Maradona","Pele","Johan Cruyff"};
		int players = listOfFootballers.length;
		System.out.println("Number of players :" +players);
		System.out.println(listOfFootballers[0] +" and "+ listOfFootballers[4]+" from FC Barcelona");
		System.out.println(listOfFootballers[1] + " from Juventus");
		System.out.println(listOfFootballers[2] + " from Napoli FC");
		System.out.println(listOfFootballers[3] + " from Santos FC");
		

	}
}