package javasessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayArraylistAssignment {

	public static void main(String[] args) {
// WAP to delete a specific number from the given array.

//		int p[] = {1,4,5,2,3,22,31, 2}; 

//--Need to remove 22 from the p[] array.

//--output should be: [1, 4, 5, 2, 3, 31, 2]
		int p[] = { 1, 4, 5, 2, 3, 22, 31, 2 };
		int a[] = new int[p.length - 1];

		int j = 0;
		for (int i = 0; i < p.length; i++) {
			if (p[i] != 22) {
				a[j] = p[i];
				j++;
			}
		}

		System.out.println(Arrays.toString(a));

		// Q2: Write a program to create a static Array, having following cricket data:

		//                         --name, age, team name, DOB, gender, Strike Rate

		//                         --Try to create multiple Object Arrays for different
		// players 

		//                         --Try to print all the values of each player on the
		// console

		Object k[] = new Object[6];
		k[0] = "Tom";
		k[1] = 35;
		k[2] = "Yankee";
		k[3] = "03-10-1988";
		k[4] = 'm';
		k[5] = 9;

		System.out.println(Arrays.toString(k));

//	  1. Write a Java program to create a new array list, which contains all color names.

//                 --add some colors (string) 

//                ---and print out the colorslist using loops.    

		ArrayList<String> colors = new ArrayList<String>();
		colors.add("red");
		colors.add("green");
		colors.add("yellow");
		colors.add("black");
		colors.add("orange");
		colors.add("blue");
		colors.add("purple");
		colors.add("chocolate");
		colors.add("cream");
		colors.add("navy");
		
		System.out.println(colors);
       int count=0;
		for (String c : colors) {
//			System.out.println(count+"="+c);
			
			if(count%2==0) {
				System.out.println(count+"="+c);
				
			}
			count++;
		}

//	    2. Write a Java program to retrieve an element at a specified index from a given array list.  

		ArrayList<Integer> number = new ArrayList<Integer>();
		number.add(2);
		number.add(4);
		number.add(100);
		number.add(200);
		number.add(1000);
		System.out.println(number.get(2));

//	    3. Write a Java program to update specific array element by given element.    
		ArrayList<String> names = new ArrayList<String>();
		names.add("Raymond");
		names.add("Helen");
		names.add("Ethan");
		names.add("Shirley");

		names.set(1, "Eric");
		System.out.println(names);

//	4. Write a Java program to remove the third element from an array list. 

		ArrayList<String> days = new ArrayList<String>();
		days.add("Monday");
		days.add("Tuesday");
		days.add("Wednesday");
		days.add("Thursday");

		days.remove(2);
		System.out.println(days);
//	 5. Write a Java program to search an element in an array list using for loop. Once we find that element, break the loop.      

		ArrayList<String> months = new ArrayList<String>();

		months.add("Jan");
		months.add("Feb");
		months.add("Mar");
		months.add("Api");
		months.add("May");
		months.add("June");
		months.add("July");
		String searchMonth = "May";
		for (String m : months) {

			if (m.equals(searchMonth)) {
				System.out.println("found the month " + searchMonth);
				break;
			}
		}
//	6. Reverse this array List:

			ArrayList<String> studentNames = new ArrayList<String>();

			studentNames.add("Varun");

			studentNames.add("Reena");

			studentNames.add("Naveen");

			studentNames.add("Robin");
			studentNames.add("Peter");
			
		
		  for(int i=studentNames.size()-1;i>=0;i--) {
			  System.out.println(studentNames.get(i));
		  }
		   
		  System.out.println(studentNames);
		Collections.reverse(studentNames);
		System.out.println(studentNames);
		Collections.swap(studentNames, 2, 3);
		System.out.println(studentNames);
		Collections.sort(studentNames);
		System.out.println(studentNames);
		List<String>newList=Collections.EMPTY_LIST;
		System.out.println(newList.size());
		
		List<Integer>markList=Collections.emptyList();//Immutable list
		System.out.println(markList);
		
		
		int x=0;
		while(true) {
			System.out.println("Hello World"+"="+x);
			x++;
			if(x==10) {
				break;
			}
		}
			  
		int y=0;
		do {
			System.out.println("Hello World");
			y++;
		}while(y<=9);
		
		  }
	}


