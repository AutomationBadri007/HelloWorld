package oopConceptpart1;

public class StaticandNonstaticconcept {

	/*global variables : The scope of global variables will be available across all the functions/methods with some conditions depending on static or 
	non static variables
	*/
	String name = "Tom";//Non static global variable
	static int age = 25;//static global  variable
	
	public static void main(String[] args) 
	
	{//how to call static methods and variables
		
		
		//1.direct calling of method/variable
		
		sum();
		System.out.println(age);
		
		
		//2. calling by class name
		
		StaticandNonstaticconcept.sum();
		System.out.println(StaticandNonstaticconcept.age);
		
		
		//how to call non static methods and variables
		
		StaticandNonstaticconcept obj = new StaticandNonstaticconcept();
		obj.sendMail();
		System.out.println(obj.name);
		
/*can I access static methods by using object reference? yes we can access static methods using object reference, but one warning will be given
"The static method sum() from the type StaticandNonstaticconcept should be accessed in a static way".
So, better to access static methods using direct calling of the method or by class name
*/		
		obj.sum();
		
	}

	public void sendMail()
	{
		System.out.println("send mail method");
		
	}
	
	public static void sum()
	{
		System.out.println("Sum method");
	}
	
	
}
