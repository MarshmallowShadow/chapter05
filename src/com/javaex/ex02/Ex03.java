package com.javaex.ex02;
import java.io.*;

public class Ex03 {
	public static void main(String[] args) throws IOException {
		InputStream in = new FileInputStream("C:\\javaStudy\\file\\MS949.txt");
		InputStreamReader isr = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(isr);
		
		while(true) {
			String str = br.readLine();
			
			if(str == null) {
				break;
			}
			
			System.out.println(str);
		}
		
		br.close();
	}
}
