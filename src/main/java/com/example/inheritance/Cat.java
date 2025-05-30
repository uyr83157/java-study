package com.example.inheritance;

public class Cat extends Animal {

	public Cat(String name, int age) {
		super(name, age);
	}

	@Override
	public void eat() {
		super.eat();
		System.out.println(super.hungry);
		System.out.println("생선을 먹습니다: " + name);
	}

	public void play() {
		System.out.println("털실을 가지고 놉니다: "+name);
	}

}
