//1.  differnce between compile time and run time?
/*compile time is when your java code(human readable)started to compile by jvm.
jvm only look for syntax during compile time.

run time is when your java code is converted itno byte code(class) by the jvm.
during run time jvm always looks for the main method. */

//compile time

public class Laptop{
	public static void specifications(){
		
	}
}

//run time
public class LaptopTester{
	public static void main(String[] args)
	Laptop.specifications();
}

//2 types of variables

/*local variables:that can be declared within a method
example*/
public static void main(String[] args){
	String institute ="XWORKZ";
	
}
/* class level variables or fields: this type of variables
can be declared in class level 
example*/

public class Mobile{
	public static String Brand="Samsung";
	public static void main(String[] args){
		
	}
}

/* final keyword : if we use final keyword while declaring a variable, 
then the value can not be modified
example*/ 
final String institute = "Xworkz"; 










/*4 method : methods are used to perform some logics or to perform some actions.
in java main method is an entry point of the program.
without maain method jvm will not execute the code.
example*/
public static void main(String[] args){
	
}
public static void keys(){
	
}
//we can call one method from another

/*parameter: parameters are type of variable 
that can declared into methods.
example*/
public static void main(String[] args){
	
}// here (String[] args are parameters)

/*when we call the method we need pass some data into the method, 
the data or a vlaue is called as arguements
example*/
//in the above example we can pass arguements that are string type

/*return type :returning a value from method
example*/

public static String Laptop(){
	return "dell";
	// here a jvm expecting a return value from method laptop
}


/*encapsulation: hiding a data 
by the use of private acces specifier we can make a data as a private 
so that no other class can access the data
by using getter and setter method we can read encapsulated data
example*/

public class laptop{
	private static String mobileNumber;
}



/*arrays: arrays is sequence of data, it may be any type
we access elements in an arrays by using index of an array
we can find the size if an arrays by using length property
example*/

String[] mobiles ={"samsung","nokia","moto","mi"};
int sizeOfArray=mobiles.length;



// array examples
public class Marvel{
	
public static void main(String[] args){

String[] avengersList = {"Ironman","Captain America","Thor","Spiderman","Hulk"};
for(byte msg=0;msg<=avengersList.length;msg++)
		{
		System.out.println("avenger at index"+msg);
		String avengerName=avengersList[msg];
		System.out.println(avengerName);
}
}


//method overloading

/*method overloading is when class have multiple method with same
method name and different parameters or different datatypes
example*/

public class Laptop{
	public static void laptopTester(String specs){
	/*
	some statements
		*/
	}
	public static void laptopTester(String brand,int ram){

	
}





//example

public static void mobile(String specs){
	/*
	some statements
		*/
}
	
}public static void mobile(String ram, int price){
	/*
	some statements
		*/
	}




//3 string to premitive converstion

String age ="10";
byte convertedAge=Byte.parseByte(age);

String salary = "25000";
short convertedSalary = Short.parseShort(salary);

String populatonOfHubli="1000000";
int convertedPopulatonOfIndia=Integer.parseInt(populatonOfIndia);

String mobileNumber="9972018356";
long convertedMobileNumber =Long.parseLong(convertedMobileNumber);






