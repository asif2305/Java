
public class StaticBlock {
  // static variable
	static int a=20;
	static int b;
	
	// static block
	
	static {
		System.out.println("Static block initialized");
		b=a*5;
		
	}
	
}
