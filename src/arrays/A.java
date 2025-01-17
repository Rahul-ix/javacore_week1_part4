package arrays;

import java.util.Iterator;

public class A {

	public static void main(String[] args) {
		/*
		 * array : is collection of values
		 * it stores address in continues order
		 * it starts index of 0
		 */
		
//		String [] arr=new String[3];
//		arr[0]="India";
//		arr[1]="China";
//		arr[2]="France";
//		arr[3]="Usa"; java.lang.ArrayIndexOutOfBoundsException--->(runtime exception/unchecked exception)
//		for(int i=0;i<=arr.length-1;i++) {
//			System.out.println(arr[i]);
//		}
		//output:
	/*	India
		China
		France
		*/
		
		//or
		
//		for(String val :arr) {
//			System.out.println(val);
//		}
		
		//output:
	/*	India
		China
		France
		*/
		
		//it takes default values if you not supplie values
//		int i[]=new int[5];
//		for(int d:i) {
//			System.out.print(d);//00000
//		}
//		
		//adding and removing is difficulty
		
		String[] countiry=new String[4];
		countiry[0]="India";
		countiry[1]="France";
		countiry[2]="Usa";
		countiry[3]="India";
		for(String c:countiry) {
			System.out.println(c);
		}
		
		//adding
//		countiry[2]="uk";
//		for(String c:countiry) {
//			System.out.println(c);
//		}
		//removing
		
//		countiry[2]="";
//		for(String c:countiry) {
//			System.out.println(c);
//		}
		//updat
		String[] updateCountiry =new String[4];
		updateCountiry[0]=countiry[0];
		updateCountiry[1]=countiry[1];
		updateCountiry[2]="Uk";
		updateCountiry[3]=countiry[3];
		
		for(String s:updateCountiry) {
			System.out.println(s);
		}
		
		//count how many india is preseent
		int count=0;
		for(String d:updateCountiry) {
			if(d.contentEquals("India")) {
				count++;
			}
		}
		System.out.println(count);//2
		
	}
}
