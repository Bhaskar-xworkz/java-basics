public class StringConvertor{
	public static void main(String[] args)
	{
		String rollNo = "41";
		byte convertedRollno = Byte.parseByte(rollNo);
		System.out.println("convertedRollno into Byte : " +convertedRollno);
		
		String mobileNo = "9972018356";
		long convertedMobileNo = Long.parseLong(mobileNo);
		System.out.println("convertedMobileNo into Long : " +convertedMobileNo);
		
		String percentage = "41";
		float convertedPercentage = Float.parseFloat(percentage);
		System.out.println("convertedPercentage into Float : " +convertedPercentage);
		
		String usn = "401";
		int convertedUsn = Integer.parseInt(usn);
		System.out.println("convertedUsn into Integer : " +convertedUsn);
		
	}

}
