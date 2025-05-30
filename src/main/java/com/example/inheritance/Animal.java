package com.example.inheritance;

public class Animal {
	String name;
	int age;
	String hungry = "꼬르륵";

	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("동물 생성: " + this.name + " (" + this.age + "살)");
	}

	public void eat() {
		System.out.println("배가 고픕니다: " + name);
		System.out.println("먹이를 먹습니다: " + name);
	}

	public void cry() {
		System.out.println("울음소리를 냅니다: " + name);
	}
}
