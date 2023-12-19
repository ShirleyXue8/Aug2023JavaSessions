package OOP_Encapsulation;

public class EmpTest {

	public static void main(String[] args) {
		
		
//		e.setName("Naheed");
//		e.setId(1);
//		e.setCity("Bangalore");
//		e.setPerm(true);
		
		//
//
//		System.out.println(e.getName());
//		System.out.println(e.getId());
//		System.out.println(e.getCity());
//		System.out.println(e.isPerm());
//		
		
		//CRUD:
		
		//user registration :setter and const... CREATE : POST API
		
		Employee e=new Employee("Naheed",1,"Bangalore",true);
		//display info on user profile: Retrieve: GET API
		System.out.println(e.getName());
		System.out.println(e.getId());
		System.out.println(e.getCity());
		System.out.println(e.isPerm());
		
		
		//user wants to update city and name:setter :Update:PUT/Patch API
		e.setName("Naheed Automation");
		e.setCity("Pune");
		
		//display info on user profile :getter :Retrieve:GET API
		System.out.println(e.getName());
		System.out.println(e.getId());
		System.out.println(e.getCity());
		System.out.println(e.isPerm());
		
		
		
		
		
	}

}
