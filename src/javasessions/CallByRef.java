package javasessions;

public class CallByRef {

	public static void sendMail(CallByRef ref) {
		System.out.println("send mail");
		ref.readMail();
	}
	
	
	public  void readMail() {
		System.out.println("readmail");
	
		
	
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		CallByRef obj=new CallByRef();
		CallByRef .sendMail(obj);
	

	}

}
