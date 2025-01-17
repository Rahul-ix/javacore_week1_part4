package fileHandling;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaders {
/*
 * it will improves reading performane
 * it containd readLine() method--which will read the entire line
 */
	public static void main(String[] args) {
		
		try {
			
			FileReader fr =new FileReader("D://File//A.txt");
			BufferedReader br =new BufferedReader(fr);
			System.out.println(br.readLine());
			System.out.println(br.readLine());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
