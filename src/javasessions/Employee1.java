package javasessions;

public class Employee1 {
//class vars:attributes
	String name;
	int empId;
	String dept;
	boolean isPerm;
	double salary;
	
    
	public static void main(String[] args) {
		
		int i=10;// local variable
		
		//class: is a blueprint/template/category of the objects
		//Object/Instance: is a physical entity created from class template/category
		
		//new keyword
		
		Employee1 e1=new Employee1();
		//Empolyee : calss/type of e1
		//e1: object reference variable
		//new :keyword
		//new Empolyee():Object
		
		
		e1.name="Rahul";
		e1.empId=1;
		e1.dept="QA";
		e1.isPerm=true;
		e1.salary=23.44;
		
		System.out.println(e1.name);
		System.out.println(e1.empId);
		System.out.println(e1.dept);
		System.out.println(e1.isPerm);
		System.out.println(e1.salary);
		
		Employee1 e2=new Employee1();
		
		e2.name="Tom";
		e2.empId=2;
		e2.dept="HR";
		e2.salary=12.33;
		
		System.out.println(e2.name);
		System.out.println(e2.empId);
		System.out.println(e2.dept);
		System.out.println(e2.isPerm);
		System.out.println(e2.salary);
		
		
		//No ref object:
		new Employee1();
		
		//null ref object
		Employee1 e3=new Employee1();
		e3=null;
		e3.name="Naveen";//NPE
		
		System.gc();// no guarntee that GC will go to heap memory
		
		
		
		

	}

}
