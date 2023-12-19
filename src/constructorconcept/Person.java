package constructorconcept;

public class Person {
	
	String name;
	int age;
	char gender;
	double height;
	
	
	public Person(String name, int age, char gender, double height) {
		
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.height = height;
	}
	
	
	
	
	public Person(String name, double height) {
		this.name = name;
		this.height = height;
	}




	public static void main(String[] args) {
		
		Person p=new Person("Shirley",1.60);
		System.out.println(p.name+" "+p.height);
		
		
	}
	

}
