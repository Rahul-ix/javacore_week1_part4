package data_type_casting;

/*
 * wrapper class : wrap the values inside an object and store
 * Auto boxing: storing primitive values inside wrapper class object
 * unboxing: reading the values from wrapper class object
 */
public class E {

	public static void main(String[] args) {
		//primitive values
		int x=10;
		Integer i =x;
		System.out.println(i);
		
		float y=10.3f;
		Float f =y;
		System.out.println(f);
		
		//String values
		String s="100";
		Integer i1=Integer.parseInt(s);
		System.out.println(i1);
		
		//note you cannot do other that number eg: below
		String s1="abc";
		Integer i2=Integer.parseInt(s1);
		System.out.println(i2);//error --java.lang.NumberFormatException
		
	}
}
