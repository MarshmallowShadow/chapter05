package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class test {

   public static void main(String[] args)throws IOException {
   
      
      List<Friend> pList = new ArrayList<Friend>();
      
      InputStream in = new FileInputStream("C:\\javaStudy\\file\\PhoneDB_원본.txt");//파일불러옴
      InputStreamReader isr = new InputStreamReader(in, "UTF-8");//번역돌림
      BufferedReader br = new BufferedReader(isr);// 소음기장착 (권총에) 프로그램에 넣음

      OutputStream out = new FileOutputStream("C:\\javaStudy\\file\\PhoneDB_원본01.txt");//파일 복사
      OutputStreamWriter osw = new OutputStreamWriter(out, "UTF-8");
      BufferedWriter bw = new BufferedWriter(osw);
      

      while(true) {
         String str = br.readLine(); 
         if(str == null) {
            break;
         }
         String[] sArray = str.split(",");
         pList.add(new Friend(sArray[0], sArray[1], sArray[2]));

      }
         pList.add(new Friend("황일영", "010-2221-2222", "02-333-3333"));
         //bw.write(pList);
         bw.newLine();
      
      for(int i = 0; i < pList.size(); i++) {
         pList.get(i).showInfo();
      }
      
      bw.close();
      br.close();
      
   }

}