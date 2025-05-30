package com.example.inheritance;

public class Dog extends Animal {

	public Dog(String name, int age) {
		super(name, age);
	}

	@Override
	public void cry() {
		System.out.println("멍멍 울음소리를 냅니다: " + name);
	}
}
