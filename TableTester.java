public class TableTester{
	public static void main(String[] args)
	{
		System.out.println("JVM invoked Main ");
		Table.holding("Books");
		Table.holding("pens","papers");
		Table.holding("pens",10);
		System.out.println("Exit main ");
	}
}	