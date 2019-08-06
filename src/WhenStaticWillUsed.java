// A java program to demonstrate use of 
// static keyword with methods and variables 
public class WhenStaticWillUsed {
	
	String name;
	int rollNo;
	
	// static variable
	static String universityName;
	
	static int counter;
	
	//static block
	static {
		counter=0;
	}
	
	public WhenStaticWillUsed(String name) {
		this.name=name;
		this.rollNo=setRollNo();
	}
	 // getting unique rollNo 
    // through static variable(counter) 
	static int setRollNo() {
		counter++;
		return counter;
	}
    static void setUniversityName(String name)
    {
    	universityName=name; 
    	
    }
    // instance method
    void getData()
    {
    	    System.out.println("name : " + this.name); 
	        System.out.println("rollNo : " + this.rollNo); 
	          
	        // accessing static variable 
	        System.out.println("cllgName : " + universityName);
    }
	public static void main(String[] args) {
	       
		 // calling static method 
        // without instantiating Student class 
		WhenStaticWillUsed.setUniversityName("MIT"); 
      
		WhenStaticWillUsed s1 = new WhenStaticWillUsed("Asif"); 
		WhenStaticWillUsed s2 = new WhenStaticWillUsed("Ahmed"); 
          
        s1.getData(); 
        s2.getData(); 
	}

}
