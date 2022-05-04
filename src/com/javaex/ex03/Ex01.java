package com.javaex.ex03;
import java.io.*;

public class Ex01 {
	public static void main(String[] args) throws IOException {
		InputStream in = new FileInputStream("C:\\javaStudy\\file\\PhoneDB.txt");
		InputStreamReader sr = new InputStreamReader(in, "UTF-8");
		BufferedReader br = new BufferedReader(sr);
		
		while(true) {
			String data = br.readLine();
			
			if(data == null) {
				break;
			}
			
			String[] info = data.split(",");
			System.out.println("이름: " + info[0]);
            System.out.println("핸드폰: " + info[1]);
            System.out.println("회사: " + info[2]);
            System.out.println("");
		}
		
		br.close();
	}
}
