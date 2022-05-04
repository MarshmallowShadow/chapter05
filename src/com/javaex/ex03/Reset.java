package com.javaex.ex03;

import java.io.*;

public class Reset {
	public static void main(String[] args) throws IOException {
		OutputStream out = new FileOutputStream("C:\\javaStudy\\file\\PhoneDB.txt");
		OutputStreamWriter sw = new OutputStreamWriter(out, "UTF-8");
		BufferedWriter bw = new BufferedWriter(sw);
		
		bw.write("이효리,010-2222-3333,031-2323-4441");
		bw.newLine();
		bw.write("정우성,010-2323-2323,02-5555-5555");
		bw.newLine();
		bw.write("이정재,010-9999-9999,02-8888-8888");
		
		bw.close();
	}
}
