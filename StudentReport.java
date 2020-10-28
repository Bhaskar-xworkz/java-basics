public class StudentReport{
	
	public static String report(double percentage)
	{
		if(percentage<35 && percentage>0){
			String msg="Fail";
			return msg;
		}
		else if (percentage>35 && percentage<60){
			String msg = "Second Class";
			return msg;
		}
		else if (percentage>=60&& percentage<75){
			String msg = "First class";
			return msg;
		}
		else if (percentage>=75 && percentage<=100){
			String msg = "First class with Distinction";
			return msg;
		}
		return null;
	}
	
}