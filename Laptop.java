public class Laptop
{
	public static void main(String[] args)
	{
		System.out.println("Keyboard Shortcuts");
		shortcuts();
	}
	public static void shortcuts()
	{
		char[] letters = {'A','Z','W','L','I','D','C','X','S','Y'};
		System.out.println("Control + " + letters[0] + " : Select All");
		System.out.println("Control + " + letters[1] + " : Undo");
		System.out.println("Control + " + letters[2] + " : Close");
		System.out.println("Windows + " + letters[3] + " : Lock your Computer");
		System.out.println("Windows + " + letters[4]+ " : Open Settings");
		System.out.println("Windows + Control + " + letters[5] + " : Add a new virtual Desktop");
		System.out.println("Control + " + letters[6] + " : Copy");
		System.out.println("Windows + " + letters[7] + " : Open the hidden menu");
		System.out.println("Control + " + letters[8] + " : Save");
		System.out.println("Control + " + letters[0] + " : Redo");
}
}