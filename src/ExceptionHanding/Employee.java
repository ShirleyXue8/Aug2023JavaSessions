package ExceptionHanding;

public class Employee {

	
	String name;
	
	
	public static void main(String[] args) {

		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		
		try {
			
			Employee obj=new Employee();
			obj=null;
			obj.name="Tome";
			
			int i=9/0;//AE
			System.out.println("Hello");
		
		}
		catch(ArithmeticException e) {
			System.out.println("AE is coming....");
			e.printStackTrace();
		}
	
		catch(NullPointerException e) {
			System.out.println("AE is coming....");
			e.printStackTrace();
		}
		
		System.out.println("Bye");
		System.out.println("Bye");
		System.out.println("Bye");
		
		
		
	}

	//error:
	//Error class
	//System(HW/OS) error: memory issue,leakage,stackover error
	
	
	
}
