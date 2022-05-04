package com.javaex.ex01;

import java.io.*;

public class Ex02 {
	public static void main(String[] args) throws IOException {
		InputStream in = new FileInputStream("C:\\javastudy\\file\\img.jpg");
		OutputStream out = new FileOutputStream("C:\\javastudy\\file\\byteBuffImg.jpg");
		
		byte[] buff = new byte[1024];
		
		while(true) {
			int data = in.read(buff);
			if(data == -1) {
				System.out.println("복사 끝");
				break;
			}
			out.write(buff);
		}
		
		in.close();
		out.close();
	}
}
