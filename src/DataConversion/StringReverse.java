package DataConversion;

public class StringReverse {

	// WAF: name: reverseString
	// param: String :str
	// return String :reversed string

	// null check
	public static String reverseString(String str) {

		if (str == null) {
			System.out.println("String is null,can not reverse,plz pass the right value");
			return "String is null";
		}

		// string is space:
		if (str.isBlank()) {
			System.out.println("Hiiiiii");
			return str;
		}

		int len = str.length();
		// length check==1
		if (len == 1 || len == 0) {
			return str;
		}

		String rev = "";
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);// muineleS
		}

		return rev;

	}

	public static String reString(String rev) {

		String sig[] = rev.split(" ");

		int len1 = sig[0].length();
		String rev1 = "";
		for (int i = len1 - 1; i >= 0; i--) {
			rev1 = rev1 + sig[0].charAt(i);
		}

		int len2 = sig[1].length();
		String rev2 = "";
		for (int i = len2 - 1; i >= 0; i--) {
			rev2 = rev2 + sig[1].charAt(i);
		}

		int len3 = sig[2].length();
		String rev3 = "";
		for (int i = len3 - 1; i >= 0; i--) {
			rev3 = rev3 + sig[2].charAt(i);
		}

		return (rev1 + " " + rev2 + " " + rev3);

	}

       public static String getXpath(String empName) {
		
		String xpath="//input[@name='"+empName+"']";
		return xpath;
	
}

	public static void main(String[] args) {
		// tcs
		System.out.println(reverseString("Selenium"));
		System.out.println(reverseString("123"));
		System.out.println(reverseString("Selenium Automation"));
		System.out.println(reverseString("T"));
		System.out.println(reverseString(null));
		System.out.println(reverseString(""));
		System.out.println(reverseString(" "));
		System.out.println(reverseString("        "));
		System.out.println(reString("Selenium is good"));

//		String str = "Selenium";
//
//		StringBuilder sb = new StringBuilder(str);
//		System.out.println(sb.reverse());
		
		String domain="test.automation.python.java";
		String dm[]=domain.split("\\.");
		System.out.println(dm[0]);
		
		String data="test|automation|python|java";
		String d[]=data.split("\\|");
		System.out.println(d[0]);
		
		String foo="I love java coding";// I love "java" coding
		System.out.println(foo);
		System.out.println("I love \"java\" coding");
		System.out.println("I love 'selennium'");
		
		//output:"I love java coding"
		
		System.out.println("\"I love java coding\"");
			
			
	String x1=getXpath("pooja");
	System.out.println(x1);
		
		
	
		

	}

}
