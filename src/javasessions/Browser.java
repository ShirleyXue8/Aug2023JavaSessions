package javasessions;

public class Browser {

	//WAF: to launch the browser
	//name:launchBrowser:chrome/ff/safari/edge
	//param:browserName(String)
	//return:boolean
	
	
	public boolean launchBrowser(String browserName) {
		
		System.out.println("the browser name is: "+browserName);
		boolean flag=true;
		
		if(browserName.equals("chrome")) {
			System.out.println("chrome is launched");
			
		}else if(browserName.equals("firefox")) {
			System.out.println("firefox is launched");
			
		}else if(browserName.equals("edge")) {
			System.out.println("edge is launched");
			
		}else if (browserName.equals("safari")) {
			System.out.println("safari is launched");
		}else {
			
			System.out.println("plz pass the right browser:"+browserName);
			flag=false;
		}
		
		return flag;
	
	}
	
	
	//WAF:to return the student marks
	//function name:getStudentMarks(String stName)
	//return: marks(int):0-100
	
	public int getStudentMarks(String studentName) {
		System.out.println("getting marks for student:"+studentName);
		int marks=-1;
		if(studentName.equals("sarika")) {
			marks=90;
			
		}
		else if (studentName.equals("rahul")) {
			marks=95;
			
		}
		else if (studentName.equals("shubhra")) {
			marks=100;
			
		}
		else if(studentName.equals("naveen")) {
			marks=0;
			
		}else {
			
			System.out.println("plz pass the right student name..."+studentName);
			marks=-1;
		}
		
		return marks;
	}
	
	
	
	
	
	public static void main(String[] args) {

		//caller method//user
		
		Browser br=new Browser();
		boolean flag=br.launchBrowser("safari");
		if(flag) {
			
			System.out.println("enter the url");
		}else {
			
			System.out.println("error---no browser is there");
		}
		
		
		int stMarks=br.getStudentMarks("tom");
			
			if (stMarks>=0){
				
				System.out.println("print the mark sheet");
			}
		}
	
	}


