public class SmartPhoneFeatures
{
	public static void main(String[] args)
	{
		String model = args[0];
		String operatingSystem = args[1];
		SmartPhone.Features(model,operatingSystem);
		
		int camera = Integer.parseInt(args[2]);
		int ram = Integer.parseInt(args[3]);
		SmartPhone.Features(camera,ram);
		
		int memory = Integer.parseInt(args[4]);
		String processor = args[5];
		SmartPhone.Features(memory,processor);

	}
}