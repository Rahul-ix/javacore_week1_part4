package logical_example;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		//remove 3 un-successfull attempt of password
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter you password");
		for(int i=0;i<=3;i++) {
			
			int password =s.nextInt();
			if(password==123) {
				System.out.println("welcome");
				
			}
			else {
				System.out.println("wrong password re enter");
				
				
			}
			
		}
	}
}
