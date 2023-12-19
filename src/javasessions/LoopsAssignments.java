package javasessions;

public class LoopsAssignments {

	public static void main(String[] args) {
		// 1. WAP to print following output:

		for (int i = 1; i <= 5; i++) {

			System.out.println("I am Batman");
		}

		// 2. WAP to print following output:

		System.out.println("------------");

		for (int j = 1; j <= 9; j++) {

			System.out.println("I am Batman" + j);
		}

		// 3.WAP to print 10 to 1 using for,while and do-while loop

		System.out.println("------------");

		for (int k = 10; k >= 1; k--) {

			System.out.println(k);
		}
		System.out.println("------------");

		int a = 10;
		while (a >= 1) {
			System.out.println(a);
			a--;

		}

		System.out.println("------------");
		// 4. Write a program in Java to print "Hello World" ten times using while loop

		int b = 1;
		while (b <= 10) {

			System.out.println("Hellow World");
			b++;
		}

		// 5. Write a program in Java to print all the multiplication of 5 from 1 to 100
		// using while /for/do-while loop

		System.out.println("------------");
		int c = 1;
		while (c <= 100) {

			if (c % 5 == 0) {
				System.out.println(c);
			}

			c++;
		}

		System.out.println("------------");
		for (int d = 1; d <= 100; d++) {

			if (d % 5 == 0) {
				System.out.println(d);
			}

			d++;
		}

		// 6. Print all odd and even numbers between 1 to 100
		System.out.println("------------");
		for (int f = 1; f <= 100;) {

			System.out.println(f);
			f = f + 2;
		}

		System.out.println("------------");
		for (int g = 2; g <= 100;) {

			System.out.println(g);
			g = g + 2;
		}

		// 7. What will be the output of this program:

//		int i = 1;

//		while (i <= 1) {

//			System.out.println("Hi Java");//infiniate loop

//		}
    //8. Print A-Z , a-z, 0-9 with  the respective ASCII numbers the console one using while and for loop.
		
		System.out.println("------------");
		for(char ch='A';ch<='Z';ch++) {
			
			System.out.println(ch+"="+(byte)ch);
			
			
		}
		System.out.println("------------");
		char ch='A';
		while(ch<='Z') {
			System.out.println(ch+"="+(byte)ch);
			ch++;
		}
		
		
		System.out.println("------------");
		for(char CH='a';CH<='z';CH++) {
			
			System.out.println(CH+"="+(byte)CH);
			
			
		}
		
		System.out.println("------------");
		char CH='a';
		while(CH<='z') {
			System.out.println(CH+"="+(byte)CH);
			CH++;
		
		}
		//9. Print the following series: 

        //1.0 2.0 3.0  ...... 10.0 

       //0 9 18 27 36 …99
		
		System.out.println("------------");
		for(double i=1.0;i<=10.0;i++) {
			
			System.out.println(i);
		}
		System.out.println("------------");
		for(int i=0;i<=100;i++) {
			
			if(i%9==0) {
				System.out.println(i);
			}
			
			
			//Print only vowels (aeiou) using for and while loop. Start the loop from ‘a‘ to ‘z‘.
			
			for(char cha='a';cha<='z';cha++) {
				
				
			}
		}
		
	}

}
