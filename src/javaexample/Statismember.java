package javaexample;

import java.util.Scanner;

public class Statismember {
	
	//static variables
	static String name;
	static String DOB;
	static String fathername;
	static String mothername;
	static String place;
	static String description;
	static int pwd;
	
	//static method
	public static void signin() {
		
		Scanner s = new Scanner(System.in);
		System.out.println("set the password");
				pwd=s.nextInt();
		
	}
	//static block
	static {
		
		signin();
	}
	
	public static void login(int pin) {
		
		if (pwd==pin) {
			
			System.out.println("Login is successful");
			details();
		}
		else {
			
			System.out.println("incorrect pwd login failed!!!!!!!");
		}
		
	
		}
	
	public static void details() {
		
		System.out.println("name: "+ name);
		System.out.println("DOB: "+ DOB);
		System.out.println("fathername: "+ fathername);
		System.out.println("mothername: "+ mothername);
		System.out.println("place: "+ place);
		System.out.println("description: "+ description);
		
	}
	//main method(static)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		name="javidh";
		DOB="march";
		fathername="bilal";
		mothername="rabiya";
		place="erode";
		description="all the best";
		
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter the password");
		login(sr.nextInt());
		
		
		
				
		
		

	}
	

	

}
