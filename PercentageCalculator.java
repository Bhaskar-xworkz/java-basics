public class PercentageCalculator
{
    public static void main(String[] args)
	{
		double percentage = 60;
		System.out.println("Entered percentage :"+ percentage);
		String grade = StudentReport.report(percentage);
		System.out.println(grade);
	}
}
