package com.javaex.ex03;
import java.io.*;
import java.util.*;

public class FriendApp {
	public static void main(String[] args) throws IOException {
		InputStream in = new FileInputStream("C:\\javaStudy\\file\\PhoneDB.txt");
		InputStreamReader sr = new InputStreamReader(in);
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
		
		OutputStream out = new FileOutputStream("C:\\javaStudy\\file\\PhoneDB.txt");
		OutputStreamWriter sw = new OutputStreamWriter(out);
		BufferedWriter bw = new BufferedWriter(sw);
		
		fArray.add(new Friend("마슈", "010-2074-8889", "없음"));
		
		Iterator<Friend> it = fArray.iterator();
		
		while(it.hasNext()) {
			bw.write(it.next().writeString());
			bw.newLine();
		}
		
		bw.close();
		br.close();
	}
}
