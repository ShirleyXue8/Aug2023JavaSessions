package javasessions;

public class TimeComplexityConcept {

	public static void main(String[] args) {

		//TC
		//time
		//data/input data
		
		//D--T
		//10--2
		//100--5
		//1000--10
		//10000--30
		//1M--100
		
		//Big O-->Oh
		
		
		int i=10;
		System.out.println(i);
		//constant time :O(1)
		
		String s="Naveen";//O(1)
		
		//20 sec---> 0.00000001
		for(int p=1;p<=10;p++) {
			System.out.println(p);
			
		}
		
		//1+n+n+n===>3n+1==>Linear Equation
		//3n+1==>O(n)
		
		
		
		int num[][]= {
				{1,2,3},
				{2,3,4},
				{4,5,6},
		};
		
		for(int row=0;row<num.length;row++) {
			
			for(int col=0;col<num[0].length;col++) {
				System.out.print(num[row][col]+" ");
			}
				System.out.println();
		}
		
		//(1+n+n+n)(1+n+n+n)==>(3n+1)(3n+1)==>9n^2+6n+2==>3n(3n+2)==>3n(3n)==>9n^2==>n^2==>O(n^2)
		
		
		System.out.println("----------");
		//
		for(int row=0;row<=5;row++) {
			for(int col=0;col<=5;col++) {
				
			}
				
		}
		
	}

}
