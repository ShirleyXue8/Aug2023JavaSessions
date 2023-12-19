package javasessions;

import java.util.Arrays;

public class LoopsConcept {

	public static void main(String[] args) {

		int i = 1;
		while (i <= 10) {

			System.out.println(i);
			i = i + 2;
		}
		System.out.println("---------------");

		int j = 1;
		while (j <= 50) {

			System.out.println(j);// 12345
			if (j % 5 == 0) {

				System.out.println("Hi");// Hi
				break;
			}
			j++;// 2 3 4 5

			// when to use while loop: use cases:
			// when number of iterations are not fixed;
			// waiting for the web element on the page
			// waiting for the page loading
			// linkedin/facebook/swiggy/zomatio: infinite scrollling
			// payment:waiting for the confirmation alert

		}

		// 2.for loop
		System.out.println("---------------");

		for (int k = 1; k <= 10; k++) {

			System.out.println(k);
		}

		System.out.println("---------------");
		//
		for (byte b = 1; b <= 5; b++) {

			System.out.println(b);
		}

		System.out.println("---------------");
		//
		for (float c = 1.1f; c <= 5.5; c++) {
			System.out.println(c);

		}

		System.out.println("---------------");
		// a-z

		for (char ch = 'a'; ch <= 'z'; ch++) {

			System.out.println(ch + "=" + (byte) ch);
		}
		System.out.println("---------------");

		//

		for (;;) {

			System.out.println("welcome to Hotel Taj");
			break;
		}

		System.out.println("---------------");

		for (int n = 1; n <= 50; n++) {

			System.out.println(n);
			{
				if (n % 5 == 0) {
					System.out.println("bye");
					break;
				}

			}

			// for loop use cases:
			// when number of interations are fixed:
			// Arrays:
			// drop down: month:12-->
			// menu items:
			// read excel sheet:10 rows : for loop

		}

		// Do-While:
		System.out.println("---------------");
		int s = 1;
		do {

			System.out.println(s);
			s++;

		} while (s <= 10);

		
		
		
		//
		//while(true) {
			
		//System.out.println("Welcome to NAL");
		//}
		
	//reverse a String: Selenium ---> 
		
		System.out.println("------");
		//
		boolean flag = false;
		while(flag) {
			System.out.println("Welcome to NAL");
		}
		
		
		do {
			System.out.println("Welcome to NAL");
		}
		while(false);
		
		
		//for each 
		//streams with lambda
				
//		String[] s = new String[5];
//		System.out.println(s);
//		System.out.println(Arrays.toString(s));
		
		char []c11 = new char[5];
		c11[0] = 'a';
		c11[1] = 'b';

		System.out.println(c11);
		System.out.println(Arrays.toString(c11));
		
	}
	}


