package constructorconcept;

public class Rectangle {
	
	double length;
	double width;
	
	
	
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	
	
	public static void main(String[] args) {
		
		Rectangle R=new Rectangle(4.55, 6.22);
		System.out.println(R.length+ " " +R.width);
		
	}

}
