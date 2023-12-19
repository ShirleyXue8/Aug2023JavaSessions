package javasessions;

import java.util.Arrays;

public class ArraysConcept {

	public static void main(String[] args) {

		
		//Array: collection of similar types of data:
		//limitations:
		//1.size is fixed:static array:to overcome this,we use dynamic array(Arraylist)
		//2.can store only similar type of data
		
		
		//1. using new keyword:
		
		int i[] = new int[4];//0-3
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		
		System.out.println(i.length);//4
		//fetch/print all the values of array: use for loop:
		System.out.println(i[0]);
		System.out.println(i[3]);
		System.out.println(Arrays.toString(i));//quickly check how many values are there in this array without the loop
		
		
		//using for loop
		for(int k=0;k<=i.length-1;k++){
			System.out.println(i[k]);
			if(i[k]==20) {
				
				System.out.println("hi");
				
			}
			
		}
		
		
		//
		int pop[] = new int[5];
		pop[0] = 100;
		pop[1] = 200;
		pop[2] = 200;
		pop[4] = 500;
		
		System.out.println(Arrays.toString(pop));
		
		String lg[] = new String[3];
		System.out.println(lg[0]);
		
	}

}
