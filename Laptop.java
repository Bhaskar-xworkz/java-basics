public class Laptop
{
	public static void laptopFeatures(String model, String operatingSystem){
			System.out.println("Model : " + model);
			System.out.println("operating System is : " + operatingSystem);
			
	}
	public static void laptopFeatures(int systemType, int ram ){
			System.out.println("systemType : " + systemType +" bit");
			System.out.println("RAM :"+ram + " GB");
	}
	public static void laptopFeatures(int harddisk,String processor){
			System.out.println("harddisk : " + harddisk + " GB");
			System.out.println("processor : " + processor);
	}
}