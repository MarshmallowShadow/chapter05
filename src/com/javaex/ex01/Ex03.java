package com.javaex.ex01;
import java.io.*;

public class Ex03 {

   public static void main(String[] args)throws IOException {
	  
      InputStream in = new FileInputStream("C:\\javaStudy\\file\\img.jpg");
      BufferedInputStream bin = new BufferedInputStream(in);
      
      OutputStream out = new FileOutputStream("C:\\javaStudy\\file\\bufferedImg.jpg");
      BufferedOutputStream bout = new BufferedOutputStream(out);
      
      System.out.println("복사 시작");
      
      while(true) {
         int data = bin.read();
      
         if(data == -1) {
            break;
         }
         System.out.println("복사 끝");
         bout.write(data);
      }
      
      
      
      
      
      
      bout.close();
      bin.close();
      in.close();
   }

}
