package com.javaex.ex03;

import java.io.*;
import java.util.*;

public class Ex02 {
	public static void main(String[] args) throws IOException {
		InputStream in = new FileInputStream("C:\\javaStudy\\file\\PhoneDB.txt");
		InputStreamReader sr = new InputStreamReader(in, "UTF-8");
		BufferedReader br = new BufferedReader(sr);
		
		ArrayList<Friend> fArray = new ArrayList<>();
		
		while(true) {
			String data = br.readLine();
			
			if(data == null) {
				break;
			}
			
			String[] info = data.split(",");
			
			fArray.add(new Friend(info[0], info[1], info[2]));
		}
		
		for(Friend i:fArray) {
			i.showInfo();
		}
		
		br.close();
	}
}
