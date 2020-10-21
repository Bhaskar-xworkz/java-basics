public class School
{
	public static void main(String[] args)
	{
		System.out.println("Students percentage and grades :");
		arrayOfPercentage();
	}
	public static void arrayOfPercentage()
	{
		String[] studentsName = {"Virat","Dhoni","Rohit","Rahul","Mayank"};
		float[] studentsPercentage = {93.5f,85.5f,70.2f,89.5f,90.2f};
		char[] grades = {'A','B','C','D','E'};
		System.out.println(studentsName[0] + " : " + studentsPercentage[0] + " : " + grades[0]);
		System.out.println(studentsName[1] + " : " + studentsPercentage[1] + " : " + grades[1]);
		System.out.println(studentsName[2] + " : " + studentsPercentage[2] + " : " + grades[3]);
		System.out.println(studentsName[3] + " : " + studentsPercentage[3] + " : " + grades[1]);
		System.out.println(studentsName[4] + " : " + studentsPercentage[4] + " : " + grades[0]);
	}
}
	