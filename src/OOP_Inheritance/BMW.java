package OOP_Inheritance;

public class BMW extends Car {

	int maxSpeed=200; //var in bmw class
	final int price=10000;
	static String color ="Red";
	
	// Method Overriding: Poly(many)+Morphism(forms): RunTime(Dynamic/Late binding)
	// when we have parent and child class:
	// 1. with the same method name
	// 2. with the same number of parameters/with the same sequence
	// 3. with the same return type

	@Override
	public void start() {
		System.out.println("BMW ---star");
	}
	@Override
	public void engine() {

		System.out.println("BMW--engine");
	}

	public void autoParking() {
		System.out.println("BMW --auto Parking");
	}

	public static void billing() {
		 
		System.out.println("BMW ----billing");
	}
	
	
	private void tyrePressure() {
		
		System.out.println("BMW ---tyre pressure");
	}
	
	@Override
	protected void selling() {
		
		System.out.println("BMW --selling");
	}
	
}
