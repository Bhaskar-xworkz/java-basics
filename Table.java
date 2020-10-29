public class Table{
	public static void holding(String thing){
		System.out.println("invoked holding : passing one args ");
		System.out.println("args 1 : " + thing);
	
	}
	public static void holding(String thing,String something){
		System.out.println("invoked holding : passing two args ");
		System.out.println("args 1 : " + thing);
		System.out.println("args 2 : " + something);
	
	}
	public static void holding(String thing,int noOfBooks){
		System.out.println("invoked holding : passing one args ");
		System.out.println("args 1 : " + thing);
		System.out.println("args 2 : " + noOfBooks);
	
	}
	
	
}