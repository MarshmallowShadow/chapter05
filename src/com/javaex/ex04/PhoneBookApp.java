package com.javaex.ex04;

import java.io.*;
import java.util.*;

public class PhoneBookApp {
	public static void main(String[] args) throws IOException {
		Reader in = new FileReader("C:\\javaStudy\\file\\PhoneDB.txt");
		BufferedReader br = new BufferedReader(in);
		
		ArrayList<Person> pArray = new ArrayList<>();
		
		while(true) {
			String data = br.readLine();
			
			if(data == null) {
				break;
			}
			
			String[] info = data.split(",");
			
			pArray.add(new Person(info[0], info[1], info[2]));
		}
		
		for(Person i:pArray) {
			i.showInfo();
		}
		
		br.close();
	}
}
