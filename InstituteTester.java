public class InstituteTester{


public static void main(String[] photos)
{

System.out.println("invoked main");

InstitueFinder.lowestAndBestUsingString("Xworkz");
	String instituteName=photos[0];
	Institute enumInstituteName=Institute.valueOf(instituteName);
InstitueFinder.lowestAndBestUsingEnum(enumInstituteName);

System.out.println("EXIT :: main");
}

}
