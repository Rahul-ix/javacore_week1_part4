package fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class FileWriters {

	public static void main(String[] args) {
		//filewriter write the content in file
		//true : means not delete the existing text
		//false or default: delete the existing text and add new text
		File f = new File("D://File//A.txt");
		try {
			FileWriter  fw=new FileWriter(f);
//			fw.write(187);
//			fw.write("Hello world");
//			char[] c= {'a','b','c','d','e','f','g','h'};
//			fw.write(c);
//			String[] arr= {"Hello","My","name","is","Raj"};
//			for (String data : arr) {
//				System.out.println(data);
//				fw.write(data);
//			}
//			
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
