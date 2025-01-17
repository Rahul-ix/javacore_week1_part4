package fileHandling;

import java.io.File;
import java.io.FileReader;

public class FileReaders_eg_2 {

	public static void main(String[] args) {

		try {
			File f =new File("D://File//A.txt");
			FileReader fr =new FileReader(f);
//			System.out.println(fr.read());
//			for(int i=0;i<f.length();i++) {
//				System.out.print((char)fr.read());
//			}
//			char[] ch = new char[5];
//			fr.read(ch);
//			for(char v: ch) {
//				System.out.print(v);
//			}
			
			
//			char[] d=new char[(int)f.length()];
//			fr.read(d);
//			for(char l:d) {
//				System.out.print(l);
//			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
