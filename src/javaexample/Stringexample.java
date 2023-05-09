package javaexample;

public class Stringexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="javidh is johnwick";
		
		String s3= new String("lebron");
		
		String[] splittedstring =s.split("is");
		System.out.println(splittedstring[0]);
		System.out.println(splittedstring[1]);
		//System.out.println(splittedstring[2]);
		System.out.println(splittedstring[1].trim());
		
		for(int i=0; i<s.length();i++) {
			
			System.out.println(s.charAt(i));
			
		}
		
		for(int j=s.length()-1;j>=0;j--) {
			
			System.out.println(s.charAt(j));
		}
		
		
		
		
		

	}

}
