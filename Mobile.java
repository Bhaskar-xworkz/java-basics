public class Mobile{
	private static String unlock = "pin";
	
	//getter
	public static String getUnlock(){
		System.out.println("invoked getUnlock ");
		return unlock;
	}
	
	public static void setUnlock(String newUnlock){
		if (newUnlock.equals("fingerprint") || newUnlock.equals("pattern") || newUnlock.equals("face")){
			System.out.println("new unlock is " + newUnlock);
			unlock = newUnlock;
		}
		else{
			System.out.println("you can not change the unlock");
		}
	}
}