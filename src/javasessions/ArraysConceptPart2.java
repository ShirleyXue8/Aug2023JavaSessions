package javasessions;

import java.util.Arrays;

public class ArraysConceptPart2 {

	public static void main(String[] args) {

		byte b[] = new byte[3];
		
		b[0]=2;
		b[1]=30;
		b[2]=88;
		System.out.println(Arrays.toString(b));
		
		for(byte i=0;i<b.length;i++) {
			System.out.println(i+"="+b[i]);
		}
		
		
		short sh[] = new short[4];
		sh[0]=40;
		sh[1]=80;
		sh[2]=100;
		sh[3]=150;
		for(short k=0;k<sh.length;k++)
		System.out.println(k+"="+sh[k]);
		
		
		double d[] = new double[3];
		d[0]=40.22;
		d[1]=80.55;
		d[2]=100.88;
	
		for(int k=0;k<d.length;k++)
		System.out.println(k+"="+d[k]);
		
		
		
		float marks[] = new float[3];
		marks[0] = 12.33f;
		marks[1] = 23.44f;
		marks[2] = 100;

		System.out.println(Arrays.toString(marks));

		String empNames[] = new String[3];

		empNames[0] = "Mahesh";
		empNames[1] = "Rahul";
		empNames[2] = "Kiran";

		System.out.println(Arrays.toString(empNames));

		System.out.println(empNames.length);

		for (int i = 0; i < empNames.length; i++) {

			System.out.println(empNames[i]);
			if (empNames[i].equals("Rahul")) {

				System.out.println("promote this emp to SDET2");
				break;
			}
		}
		System.out.println("------------------------");

		// for each loop:enhanced for loop:
		for (String e : empNames) {

			System.out.println(e);
			if (e.equals("Rahul")) {

				System.out.println("promote this emp to SDET2");
				break;
			}
		}

		System.out.println("------------------------");

		//
		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;

		System.out.println(i.length);
		System.out.println(Arrays.toString(i));
		for (int e : i) {
			System.out.println(e);
		}

		//
		float numbers[] = new float[3];
		numbers[0] = 12.33f;
		numbers[1] = 23.44f;
		numbers[2] = 100.22f;
		
		for(float e:numbers) {
			System.out.println(e);
		}
		
		//char:
		char ch[]= new char[4];
		System.out.println((int)ch[0]);    
		
		ch[0]='a';
		ch[1]='A';
		ch[2]='9';
		ch[3]='$';
		System.out.println(ch);//no garbage value :concatenabed values of char array
		System.out.println(Arrays.toString(ch));
		for(char e:ch) {
			System.out.println(e);
			
			}
		
		
		
		//Emp info: name(string),age(int),salary(double),dob(String),isActive(boolean),gender(char)
		//Object Array:
		
		Object empInfo[]=new Object[6];
		System.out.println(Arrays.toString(empInfo));
		
		empInfo[0]="Karishma";
		empInfo[1]=30;
		empInfo[2]=35.55;
		empInfo[3]="01-01-1990";
		empInfo[4]=true;
		empInfo[5]='f';
		System.out.println(Arrays.toString(empInfo));
		
		//index loop:
		
		for(int e=0;e<empInfo.length;e++) {
			
			System.out.println(e+"="+empInfo[e]);
		}
		System.out.println("------------------------");
		
		int count=0;
     for(Object e:empInfo) {
    	 
    	System.out.println(count+"="+e);
    	count++;
     }
	}

}
