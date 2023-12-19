package DataConversion;

public class WrapperClassConcept {

	public static void main(String[] args) {
		
		
		String x="100";
		System.out.println(x+20);//10020
		
		//String to int-->Integer:
		int i=Integer.parseInt(x);//100
		System.out.println(i+20);
		
		//String to double:
		String y="12.33";
		System.out.println(y+20);
		double d=Double.parseDouble(y);
		System.out.println(d+20);
		
		//String to boolean:
		String remoteExcution="true";
		boolean flag=Boolean.parseBoolean(remoteExcution);
		if(flag) {
			System.out.println("run tcs on AWS clound");	
		}else {
			
			System.out.println("run tcs in loacal");
		}
		
		//int to String :
		int age=30;
		String ageVal=String.valueOf(age);//"30"
		System.out.println(ageVal+20);
		System.out.println(ageVal.length());
	
		double sal=12.33;
		String salVal=String.valueOf(sal);//"12.33"
		System.out.println(salVal.length());//5
		
		
//		String a="100A";
//	
//		//String to int-->Integer:
//		int b=Integer.parseInt(a);//NumberFormatException
//		System.out.println(b+20);
		
		
		String c="100Test";
		String e=c.substring(0, 3);
		System.out.println(e);
		System.out.println(e+20);
		int f=Integer.parseInt(e);
		System.out.println(f);
		System.out.println(f+20);
		
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		

	}

}
