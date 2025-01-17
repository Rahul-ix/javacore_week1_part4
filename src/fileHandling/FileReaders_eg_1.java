package fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Iterator;

public class FileReaders_eg_1 {
public static void main(String[] args)  {
	//FileReader you can read the text file :example 1
	
	File f =new File("D://File//A.txt");

	try {
		
		FileReader	fr = new FileReader(f);
////		System.out.println((char)fr.read());//97
//		for(int i=0;i<f.length();i++) {
//			System.out.print((char)fr.read());
//		}
//		
//		char[] ch=new char[5];
//		fr.read(ch);
//		
//		for(char c: ch) {
//			System.out.print(c);
//		}
		
//		char[] chr=new char[(int) f.length()];
//		fr.read(chr);
//		for(char v: chr) {
//			System.out.print(v);
//		}
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	
}
}
