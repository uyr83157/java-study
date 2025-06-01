package com.example.abstraction;

public class Dog extends Animal {

	public Dog(String name) {
		super(name);
	}

	@Override
	public void cry() {
		System.out.println("멍멍 울음소리를 냅니다: " + name);
	}

}
