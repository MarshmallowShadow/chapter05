package com.javaex.ex05;
import java.io.*;
import java.util.*;

public class PhoneBookApp {
	public static void main(String[] args) throws IOException {
		InputStream in = new FileInputStream("C:\\javaStudy\\file\\PhoneDB.txt");
		InputStreamReader sr = new InputStreamReader(in, "UTF-8");
		BufferedReader br = new BufferedReader(sr);
		
		ArrayList<Person> fArray = new ArrayList<>();
		
		while(true) {
			String data = br.readLine();
			
			if(data == null) {
				break;
			}
			
			String[] info = data.split(",");
			
			fArray.add(new Person(info[0], info[1], info[2]));
		}
		
		OutputStream out = new FileOutputStream("C:\\javaStudy\\file\\PhoneDB.txt");
		OutputStreamWriter sw = new OutputStreamWriter(out, "UTF-8");
		BufferedWriter bw = new BufferedWriter(sw);
		
		fArray.add(new Person("마슈", "010-2074-8889", "없음"));
		
		Iterator<Person> it = fArray.iterator();
		
		while(it.hasNext()) {
			bw.write(it.next().toString());
			bw.newLine();
		}
		
		bw.close();
		br.close();
	}
}
