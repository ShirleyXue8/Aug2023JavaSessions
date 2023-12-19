package javasessions;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListIterations {

	public static void main(String[] args) {

		ArrayList<Integer>numList=new ArrayList<Integer>();
		numList.add(100);
		numList.add(200);
		numList.add(300);
		numList.add(400);
		numList.add(500);
		
		System.out.println(numList);
		for(int i=0;i<numList.size();i++) {
			System.out.println(numList.get(i));//100 200 300 400 500
		}
		System.out.println("-------------");
		for(Integer n:numList) {
			System.out.println(n);
		}
		
		System.out.println("-------------");
		ArrayList<String> empNamesList = new ArrayList<String>();
		empNamesList.add("Tom");
		empNamesList.add("Peter");
		empNamesList.add("Kiran");
		empNamesList.add("Aman");
		empNamesList.add("Aman");
		empNamesList.add("Aman");
		empNamesList.add(null);
		empNamesList.add(null);
		
		for(String e:empNamesList) {
			
			System.out.println(e);
		}
		
		
		//
		
		ArrayList<String>studentList=new ArrayList<String>();
		studentList.add("Rahul");
		studentList.add("Aman");
		studentList.add("Pooja");
		
		studentList.add(0, "Naveen");
		
		System.out.println(studentList.get(0));
		System.out.println(studentList);
		
		studentList.remove(2);
		System.out.println(studentList);
		
		//1.ArrayList ar=new ArrayList();
		//2.ArrayList<>ar=new ArrayList<>();
		//3.asList:ArrayList Literals
		
		ArrayList<String>langList=new ArrayList<String>(Arrays.asList("Java","Python","C#"));//vc=10--->7
		System.out.println(langList.size());
		langList.add("Javascript");
		System.out.println(langList.size());
		
		//footer section: Contact Us,Privacy Policy,NewLetters
		//ActualList=Contact Us,Privacy Policy,NewLetters
		//ExpectedList=
		ArrayList<String>footerList=new ArrayList<String>(Arrays.asList("Contact Us","Privacy Policy","NewLetters"));//vc=10--->7
		
		
		
	}

}
