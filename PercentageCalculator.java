public class PercentageCalculator
{
    public static void main(String[] args)
	{
		double percentage = Double.parseDouble(args[0]);
		System.out.println("Entered percentage :"+ percentage);
		String grade = StudentReport.report(percentage);
		System.out.println(grade);
	}
}
