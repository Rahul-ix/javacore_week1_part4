package data_type_casting;

//sub-class
public class D extends C{
	/*
	 * upcasting object: sub-class objects to super class object
	 *                     smaller to hihger
	 */
	public void test1() {
		System.out.println("child class method");
	}
public static void main(String[] args) {
	
	D d= new D();
	C c=d; //upcasting
	c.test1();
	
	C c1=new D();
	D d1=(D) c1;//downcasting   
	d1.test1();
	
}
}
