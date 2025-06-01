package com.example.abstraction;

abstract class Animal {
	String name;

	public Animal(String name) {
		this.name = name;
	}

	public abstract void cry();

	public void eat() {
		System.out.println("먹이를 먹습니다: " + name);
	}
}
