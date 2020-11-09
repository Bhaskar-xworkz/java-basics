public class CarTester{
	public static void main(String[] args){
		System.out.println("JVM invoked main");
		
		CarBrand[] allCars = CarBrand.values();
		System.out.println("total cars :"+allCars.length);
		for(int carIndex=0; carIndex<allCars.length; carIndex++){
			System.out.println("sport at index :" +carIndex);
			System.out.println(allCars[carIndex]);
		}
	}
}