public class SmartPhone
{
	public static void Features(String model, String operatingSystem){
			System.out.println("Model : " + model);
			System.out.println("operating System : " + operatingSystem);
			
	}
	public static void Features(int camera, int ram ){
			System.out.println("camera : " + camera +" Mp");
			System.out.println("RAM :"+ram + " GB");
	}
	public static void Features(int internalMemory,String processor){
			System.out.println("internalMemory : " + internalMemory + " GB");
			System.out.println("processor : " + processor);
	}
}