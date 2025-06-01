package com.example.abstraction;

public class Cat extends Animal {
	public Cat(String name) {
		super(name);
	}

	@Override
	public void cry() {
		System.out.println("야옹 울음소리를 냅니다: " + name);
	}
}
