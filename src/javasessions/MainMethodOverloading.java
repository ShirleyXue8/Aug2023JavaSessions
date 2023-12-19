package javasessions;

public class MainMethodOverloading {

	public static void main(String[] naveen) {
		System.out.println("main method");
		
		MainMethodOverloading.main(10);
		
	}

	public static void main(String args) {
		System.out.println("main method 3");
	}

	public static void main(int a) {
		System.out.println("main method 1  "+a);
	}
	public static void main(int a,int b) {
		System.out.println("main method"+a+b);
	}
}
