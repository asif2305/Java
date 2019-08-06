
// Java program to demonstrate that a static member 
// can be accessed before instantiating a class
public class StaticMethod {
	// static method
	static void customs() {
		System.out.println("This is static method");
		
	}
	// static variable
	 static int k;
	// instance variable 
	
	int c;
	//intstance method
	void getData()
	{
		System.out.println("Get output");
	}
	static void staticRules()
	{
		k=65;
		System.out.println(200);
		// cannot use a static referance to the non-static field b
		//c=58;//compilation-error
		      // Cannot make a static reference to the  
             // non-static method m2() from the type Test 
		//getData();    // compilation error 
		
		  //  Cannot use super in a static context 
       // System.out.println(super.k); // compiler error  
	}
	public static void main(String[] args)
	{
		// calling customs method without creating any object of class Test
		customs();
		System.out.println("value of a is :" +StaticBlock.a);
		System.out.println("value of b is : "+StaticBlock.b);
		
		
		
	}
	

}
