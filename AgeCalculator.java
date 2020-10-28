public class AgeCalculator{
    public static void main(String[] args)
	{
		byte age = Byte.parseByte(args[0]);
		System.out.println("Entered Age :"+ age);
		String childAge = Age.ageDefinition(age);
		System.out.println(childAge);
	}
}
