package com.javaex.ex02;
import java.io.*;

public class Ex02 {
	public static void main(String[] args) throws IOException {
		Reader fr = new FileReader("C:\\javaStudy\\file\\youAndI.txt");
		BufferedReader br = new BufferedReader(fr);
		
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
