public class PlaceFinder{
	
	public static String place(int kms)
	{
		if(kms<30 && kms>0){
			String msg="Dharwad";
			return msg;
		}
		else if (kms>35 && kms<60){
			String msg = "Lakshmeshwar";
			return msg;
		}
		else if (kms>=60&& kms<75){
			String msg = "Gadag";
			return msg;
		}
		else if (kms>=75 && kms<=100){
			String msg = "Belgaum";
			return msg;
		}
		else if (kms>100 && kms<=150){
			String msg = "Haveri";
			return msg;
		}
		else if (kms>150 && kms<=200){
			String msg = "Davangeri";
			return msg;
		}
		else if (kms>200 && kms<=300){
			String msg = "mangalore";
			return msg;
		}
		else if (kms>300 && kms<=400){
			String msg = "Tumkur";
			return msg;
		}
		else if (kms>400 && kms<=500){
			String msg = "Bangalore";
			return msg;
		}
		else if (kms>500 && kms<=1000){
			String msg = "pune";
			return msg;
		}
		else if (kms>1000 && kms<=2000){
			String msg = "Dehli";
			return msg;
		}
		else if (kms>2000 && kms<=5000){
			String msg = "jammu";
			return msg;
		}
		else if (kms>5000 && kms<=10000){
			String msg = "Bangladesh";
			return msg;
		}
		return null;
	}
	
}