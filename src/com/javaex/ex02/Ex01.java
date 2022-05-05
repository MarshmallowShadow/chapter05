package com.javaex.ex02;
import java.io.*;

public class Ex01 {
	public static void main(String[] args) throws IOException {
		Writer fw = new FileWriter("C:\\javastudy\\file\\youAndI.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("손 틈새로 비치는");
		bw.newLine();
		bw.write("내 맘 들킬까 두려워");
		bw.newLine();
		bw.write("가슴이 막 벅차 서러워");
		bw.newLine();
		bw.write("조금만 꼭 참고 날 기다려줘");
		bw.newLine();
		bw.write("너랑 나랑은 지금 안되지");
		bw.newLine();
		bw.write("시계를 더 보채고 싶지만");
		bw.newLine();
		bw.write("네가 있던 미래에서");
		bw.newLine();
		bw.write("내 이름을 불러줘");
		
		bw.close();
	}
}
