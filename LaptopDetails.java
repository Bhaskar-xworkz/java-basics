public class LaptopDetails
{
	public static void main(String[] args)
	{
		String model = args[0];
		String operatingSystem = args[1];
		Laptop.laptopFeatures(model,operatingSystem);
		
		int systemType = Integer.parseInt(args[2]);
		int ram = Integer.parseInt(args[3]);
		Laptop.laptopFeatures(systemType,ram);
		
		int hardDisk = Integer.parseInt(args[4]);
		String processor = args[5];
		Laptop.laptopFeatures(hardDisk,processor);

	}
}