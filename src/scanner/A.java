package scanner;

import java.util.Scanner;

/*
 * Scanner: it is a inbuilt class which implements Lexer
 * Scanner s = new Scanner(Sytem.in);-----you cannot change this line
 * next()--this method you can use only one word
 * nextLine() ---you can use multiple word
 */
public class A {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter your name");
		String name=s.next(); //only one word
		System.out.println(name);
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter full name");
		String fname=s1.nextLine();//entire line
		System.out.println(fname);
		s.close();
		
		//nextInt , nextFloat ,  nextDouble etc
	
	}

}
