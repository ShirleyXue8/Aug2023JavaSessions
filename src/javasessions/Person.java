package javasessions;

public class Person {

	// Method Overloading: OOP :Poly (many)+Morphism
	// (forms):CompileTime(Static,early binding)
	// When in the same class,we have different methods:
	// 1.with the same name
	// 2.with different number of parameters
	// 3.with different type of parameters
	// 4.return type does not matter
	// 5.sequence of parameter should be different

	public void test() {// 0 param
		System.out.println("test method");
	}

	public void test(int a) {// 1 param
		System.out.println("test method:" + a);
	}

	public void test(String a) {// 1 param
		System.out.println("test method:" + a);
	}

	public void test(int a, int b) {// 2 params
		System.out.println("test method:" + a + b);
	}

	public void test(int b, String a) {// 2 params
		System.out.println("test method:" + a + b);
	}

	public void test(String a, int b) {// 2 params
		System.out.println("test method:" + a + b);
	}

	public void test(int c, float d) {// 2 params
		System.out.println("test method:" + c + d);
	}

	public void login(String un, String pwd, int otp) {

	}

	public void login(String un, String pwd, String ph) {

	}

	public void login(String emailId) {

	}

	// search:

	public void search() {

	}

	public void search(String productName) {

	}

	public void search(String productName, int price) {

	}

	public void search(String productName, int price, String seller) {

	}

	// payment:

	public void doPayment(String upi) {

	}

	public void doPayment(String cc, int cvv) {

	}

	public void doPayment(String paypalId, String pwd) {

	}

	// uber:booking():
	public void booking(String carType, String stPoint, String endPoint) {

	}

	public void booking(String carType, String stPoint, String endPoint, int pssngers) {

	}

	public static void main(String[] args) {

		Person p = new Person();
		p.test(10);
		p.test(10, 20);

	}

}
