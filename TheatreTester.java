public class TheatreTester{


public static void main(String[] names)
{

System.out.println("invoked main");

String theatrename=names[0];
Theater enumTheatreName=Theater.valueOf(theatrename);
TheaterFinder.theatreFinderUsingEnum(enumTheatreName);

System.out.println("EXIT :: main");
}

}
