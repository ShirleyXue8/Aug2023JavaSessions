package OOP_Interface;

public interface USCollege {
	
	int max_score=150;
	
	public void math();
	public void english();
	public void science();
	
	
	public static void exam() {
		System.out.println("US---exam");
	}
	
	
	default void midExam() {
		System.out.println("US---midExam");
	}
	

}
