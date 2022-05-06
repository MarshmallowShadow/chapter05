package com.javaex.ex05;

public class Person {
	private String name;
	private String hp;
	private String bp;
	
	public Person() {}
	public Person(String name, String hp, String bp) {
		this.name = name;
		this.hp = hp;
		this.bp = bp;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHp() {
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	public String getBp() {
		return bp;
	}
	public void setBp(String bp) {
		this.bp = bp;
	}
	
	public void showInfo() {
		System.out.println("이름: " + name);
		System.out.println("핸드폰: " + hp);
		System.out.println("회사: " + bp);
		System.out.println();
	}
	
	@Override
	public String toString() {
		return name + "," + hp + "," + bp;
	}
}
