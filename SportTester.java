public class SportTester{
	public static void main(String[] args){
		System.out.println("JVM invoked main");
		
		Sport[] allSports = Sport.values();
		System.out.println("total sports :"+allSports.length);
		for(int sportIndex=0; sportIndex<allSports.length; sportIndex++){
			System.out.println("sport at index :" +sportIndex);
			System.out.println(allSports[sportIndex]);
		}
	}
}