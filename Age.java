public class Age{
	
	public static String ageDefinition(byte age)
	{
		if(age<=5 && age>0){
			String msg="childs";
			return msg;
		}
		else if (age>5 && age<13){
			String msg = "kid";
			return msg;
		}
		else if (age>=13&& age<=19){
			String msg = "Teen";
			return msg;
		}
		else if (age>19 && age<50){
			String msg = "Adult";
			return msg;
		}
		else if (age>50 && age<100){
			String msg = "Old";
			return msg;
		}
		return null;
	}
	
}