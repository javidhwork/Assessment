package javaexample;

import java.util.ArrayList;

public class Arraylistexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("javidh");
		a.add("kobe");
		a.add("lebron");
		System.out.println(a.get(2));
		
		System.out.println("**************************************");
		
		for(String val:a) {
			
			System.out.println(val);
		}
		
		System.out.println("**********************************************");
		
		for(int i=0 ; i<a.size();i++) {
			
			System.out.println(a.get(i));
		}
		

	}

}
