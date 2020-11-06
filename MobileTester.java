public class MobileTester{
	public static void main(String[] values){
		System.out.println("JVM invoked main");
		Mobile.getUnlock();
		String unlockMode = values[0];
		Mobile.setUnlock(unlockMode);
		System.out.println("exit main");
		
	}
}