public class Avengers
{
	public static void main(String[] args)
	{
		System.out.println("SuperHeroes");
		String[] avengersList = {"Ironman","Captain America","Thor","Spiderman","Hulk"};
		marvelStudio(avengersList);
		marvelStudio(null);
		
		
	}
	public static void marvelStudio(String[] superheroes)
	{
		System.out.println(superheroes);
		System.out.println("Tony Stark :" + superheroes[0]);
		System.out.println("Steve Rogers :" + superheroes[1]);
		System.out.println("God of Thunder :" + superheroes[2]);
		System.out.println("Peter Parker :" + superheroes[3]);
		System.out.println("Bruce Banner :" + superheroes[4]);
	}
}

