package javasessions;

public class IfElseSwitch {

	public static void main(String[] args) {
	int a=25,b=78,c=87,d=97;
	
	if(a>b&&a>c&&a>d) {
		System.out.println("The greatest: "+a);
		
		}else if(b>a&&b>c&b>d) {
			System.out.println("The greatest: "+b);
		}else if(c>a&&c>b&&c>d) {
			System.out.println("The greatest: "+c);
		}else {
			
			System.out.println("The greatest: "+d);
		}
	}

}
