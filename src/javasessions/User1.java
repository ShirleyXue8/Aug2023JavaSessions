package javasessions;

public class User1 {
	
	String name;
	int age;
	String city;
	
	
	

	public static void main(String[] args) {
		
		
		User1 u1=new User1();
		u1.name="Rahul";
		u1.age=25;
		u1.city="Pune";
		
		User1 u2=new User1();
		u2.name="Pooja";
		u2.age=35;
		u2.city="LA";
		
		
		User1 u3=new User1();
		u3.name="Satish";
		u3.age=30;
		u3.city="Bangalore";
		
		
		System.out.println(u1.name+" "+u1.age+ " "+u1.city);
		System.out.println(u2.name+" "+u2.age+ " "+u2.city);
		System.out.println(u3.name+" "+u3.age+ " "+u3.city);
		
		System.out.println("-----------");
		
		u1=u2;
		
		
		System.out.println(u1.name+" "+u1.age+ " "+u1.city);
		System.out.println(u2.name+" "+u2.age+ " "+u2.city);
		System.out.println(u3.name+" "+u3.age+ " "+u3.city);
		System.out.println("-----------");
		u2=u3;
		
		System.out.println(u1.name+" "+u1.age+ " "+u1.city);
		System.out.println(u2.name+" "+u2.age+ " "+u2.city);
		System.out.println(u3.name+" "+u3.age+ " "+u3.city);
		
		System.out.println("-----------");
		u3=u1;
		
		System.out.println(u1.name+" "+u1.age+ " "+u1.city);
		System.out.println(u2.name+" "+u2.age+ " "+u2.city);
		System.out.println(u3.name+" "+u3.age+ " "+u3.city);
		
	}

}
