package data_type_casting;

public class B {
/*
 * downcasting(narrowing) : converting bigger size memory to smaller size memory
 */
	public static void main(String[] args) {
		
		double x=10.9909;
		int y=(int)x;
		System.out.println(y);//down casting
		
		long p=20;
		byte q=(byte)p;
		System.out.println(q);//down casting
		
		double f=10.354;
		int i=(int) f;
		System.out.println(i);//data loss happened 354
	}
}
