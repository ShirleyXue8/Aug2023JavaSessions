package javasessions;

public class Student {

	String name;
	int studentNumber;
	int age;

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.name = "Raymond";
		s1.age = 6;
		s1.studentNumber = 1;

		Student s2 = new Student();
		s2.name = "Ethan";
		s2.age = 3;
		s2.studentNumber = 2;

		Student s3 = new Student();
		s3.name = "Tom";
		s3.age = 4;
		s3.studentNumber = 3;

		Student s4 = new Student();
		s4.name = "Mary";
		s4.age = 6;
		s4.studentNumber = 4;

		System.out.println(s1.name + " " + s1.age + " " + s1.studentNumber);
		System.out.println(s2.name + " " + s2.age + " " + s2.studentNumber);
		System.out.println(s3.name + " " + s3.age + " " + s3.studentNumber);
		System.out.println(s4.name + " " + s4.age + " " + s4.studentNumber);
		System.out.println("-------------------------");

		s1 = s2;
		System.out.println(s1.name + " " + s1.age + " " + s1.studentNumber);
		System.out.println(s2.name + " " + s2.age + " " + s2.studentNumber);
		System.out.println(s3.name + " " + s3.age + " " + s3.studentNumber);
		System.out.println(s4.name + " " + s4.age + " " + s4.studentNumber);

		System.out.println("-------------------------");

		s2 = s3;
		
		System.out.println(s1.name + " " + s1.age + " " + s1.studentNumber);
		System.out.println(s2.name + " " + s2.age + " " + s2.studentNumber);
		System.out.println(s3.name + " " + s3.age + " " + s3.studentNumber);
		System.out.println(s4.name + " " + s4.age + " " + s4.studentNumber);
		
		System.out.println("-------------------------");

		s3 = s4;
		
		System.out.println(s1.name + " " + s1.age + " " + s1.studentNumber);
		System.out.println(s2.name + " " + s2.age + " " + s2.studentNumber);
		System.out.println(s3.name + " " + s3.age + " " + s3.studentNumber);
		System.out.println(s4.name + " " + s4.age + " " + s4.studentNumber);
		
		System.out.println("-------------------------");

		s4 = s1;
		System.out.println(s1.name + " " + s1.age + " " + s1.studentNumber);
		System.out.println(s2.name + " " + s2.age + " " + s2.studentNumber);
		System.out.println(s3.name + " " + s3.age + " " + s3.studentNumber);
		System.out.println(s4.name + " " + s4.age + " " + s4.studentNumber);
		
	}

}
