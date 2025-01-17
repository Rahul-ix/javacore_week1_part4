package fileHandling;

import java.io.File;

public class Files {
	/*
	 *  File
	 *  FileReader
	 *  FileWriter
	 *  BuffereReader
	 *  BuffereWriter
	 *  FileInputStream
	 *  FileOutputStream
	 */
	public static void main(String[] args) {
		
		//File file is a class
		/*
		 * exists()--it will chaeck whether file is present  --------true
		 * 									file is not present------false	
		 */
		
//		File f = new File("D://File//A.txt");
//		boolean val=f.exists();
//		System.out.println(val);
		
	//   delete()-->it will delete the file of given path if it is deleted return--true else ---false
//		
//		File f1=new File("D://File\\A.txt");
//		boolean val1=f1.delete();
//		System.out.println(val1);
		
		//mkdir --make directory(creates folder) if it's creates return true else false
		//once you create folder you cannot create again folder with same name
		//you can delete folder by using delete()
//		File f2 =new File("D://File2");
////		boolean val2=f2.mkdir();
////		System.out.println(val2);
//
//		boolean val3=f2.delete();
//		System.out.println(val3);
		
		
		//compile time exception(checked exception)
		
//		try {
//			File c= new File("D://Files//B.txt");
//			boolean val4=c.createNewFile();
//			System.out.println(val4);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		//length() it will count the number of charecters in given file
		
//		File f1 = new File("D://File//A.txt");
//		long count =f1.length();
//		System.out.println(count);
		
		//it will gives the list of all files/folder in a given paths
		
		//files
//		File f2=new File("D://File//");
//		String[] list = f2.list();
//		
//		for(String data:list) {
//			System.out.println(data);
//		}
//		
//		//folders
//		File f3=new File("D://");
//		String[] lists = f3.list();
//		
//		for(String datas:lists) {
//			System.out.println(datas);
//		}
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
}
