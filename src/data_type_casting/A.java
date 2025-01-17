package data_type_casting;

public class A {
	/*
	 * data type casting: convert perticular data type to required data type
	 */
	public static void main(String[] args) {
	
		// upcasting(widening)
		//copy data from smaller memory size to bigger memory size
		//ensure no data loss has happened
		
		byte x=10;
		int y=x;
		System.out.println(y);
		
		int p=10;
		long q=p;
		System.out.println(q);
		
		long m=10;
		double n=m;
		System.out.println(n);
		
		float f=10.3f;
		double i= f;
		System.out.println(i);//no data loss happened
		
		
	}

}
