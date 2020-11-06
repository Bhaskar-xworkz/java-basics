public class Tata{
	private static double budget = 150.64;
	
	//getter method to read budget from another class
	
	public static double getBudget(){
		System.out.println("this budget is only readable can't modify ");
		return budget;
		
	}
}