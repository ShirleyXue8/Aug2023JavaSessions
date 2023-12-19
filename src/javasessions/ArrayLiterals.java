package javasessions;

import java.util.Arrays;

public class ArrayLiterals {

	public static void main(String[] args) {
		// with new keyword
		// when you are not sure about the values
		int i[] = new int[10];

		// array literals:when you are already having the values
		// int array:
		
		int num[] = { 1, 2, 3, 4, 5, 6 };
		System.out.println(num[2]);
		System.out.println(num[5]);
		System.out.println(num.length);
		System.out.println(num);
		System.out.println(Arrays.toString(num));
		for (int e : num) {
			System.out.println(e);
		}

		String stNames[] = { "Sudheer", "RAvi", "Naveen", "Tom" };
		System.out.println(Arrays.toString(stNames));

		for (int j = 0; j < stNames.length; j++) {
			System.out.println(stNames[j]);
		}
		System.out.println("--------------------------");
		for (String e : stNames) {
			System.out.println(e);
		}

		Object empInfo[] = { "Neha", 25, 34.55, true, 'f' };
		System.out.println(Arrays.toString(empInfo));

		for (int j = 0; j < empInfo.length; j++) {

			System.out.println(empInfo[j]);
		}
		System.out.println("--------------------------");
		for (Object e : empInfo) {
			System.out.println(e);
		}

		//
		System.out.println("--------------------------");
		int number[] = { 6, 7, 3, 4, 5, 5, 7, 8, 9, 10 };

		for (int r = number.length - 1; r >= 0; r--) {

			System.out.println(number[r]);
		}

		
		System.out.println("--------------------------");
       
		 int count=number.length-1;
		for (int e : number) {
              e=count;
             
			 System.out.println(number[e]);
			 count--;
        }
		 
		//
		//ArrayList ar=new ArrayList();
		//
		
		
		
		
          }
          
       
           
		}
		

		
	


