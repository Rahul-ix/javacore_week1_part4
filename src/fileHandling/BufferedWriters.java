package fileHandling;

import java.io.*;


public class BufferedWriters {
/*
 * It is improve the performance of file writing
 * it has newLine() method which writes new line
 */
	public static void main(String[] args) {
		
		FileWriter fw;
		try {
			fw = new FileWriter("D://File//A.txt",true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("hello");
			bw.newLine();
			char[] ch= {'h','e'};
			bw.write(ch);
			bw.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
