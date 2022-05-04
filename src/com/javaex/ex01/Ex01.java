package com.javaex.ex01;
import java.io.*;


public class Ex01 {
	public static void main(String[] args) throws IOException {
		
		InputStream in = new FileInputStream("C:\\javastudy\\file\\img.jpg");
		OutputStream out = new FileOutputStream("C:\\javastudy\\file\\byteimg.jpg");
		
		while(true) {
			int data = in.read();
			
			
			if(data == -1) {
				System.out.println("복사 끝");
				break;
			}
			
			out.write(data);
		}
		
		out.close();
		in.close();
	}
}
