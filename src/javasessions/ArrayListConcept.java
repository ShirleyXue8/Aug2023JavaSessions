package javasessions;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		// Dynamic Array:size is not fixed
		// ArrayList----default class
		// methods
		// internal implemnation of AL
		// VC,load factor -LF
		// index based

		ArrayList ar = new ArrayList();
		System.out.println(ar.size());
		System.out.println(ar);
		ar.add(100);// 0
		ar.add(200);// 1
		System.out.println(ar);
		System.out.println(ar.size());

		ar.add(300);// 2
		ar.add(400);// 3
		ar.add(500);// 4

		System.out.println(ar.size());

		ar.add(600);// 5
		ar.add(700);// 6

		System.out.println(ar.size());

		ar.add(12.33);// 7
		ar.add(true);// 8
		ar.add("selenium");// 9

		System.out.println(ar.size());
		System.out.println(ar.get(0));
		System.out.println(ar.get(9));

		ar.add(1000);// 10
		System.out.println(ar.get(10));
		ar.add("selenium");// 11
		ar.add(null);// 12

		System.out.println(ar.size());
		System.out.println(ar);

		//
		ArrayList ar1 = new ArrayList();// vc=10,pc=0
		System.out.println(ar1.size());// 0
		ar1.add(10);
		System.out.println(ar1.size());// pc=1,vc=9

		//
		ArrayList ar2 = new ArrayList(20);// pc=0,vc=20[0-19]----->19th----added---->pc/2=20/2=10
		ArrayList ar3 = new ArrayList(7);// pc=0,vc=7---->7/2=3

		// numbers in the list:
		// generics
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		numberList.add(100);

		ArrayList<Double> li = new ArrayList<Double>();
		li.add(12.33);
		li.add(100.0);

		ArrayList<String> empNamesList = new ArrayList<String>();
		empNamesList.add("Tom");// 0
		empNamesList.add("Peter");// 1
		// 2-9:VCs
		System.out.println(empNamesList);

		//

		ArrayList<Object> infoList = new ArrayList<Object>();
		infoList.add("Selenium");
		infoList.add(4.12);
		infoList.add(true);
		infoList.add(2007);
		infoList.add('A');

		// pc=5 vc=5

		System.out.println(infoList);

	}

}
