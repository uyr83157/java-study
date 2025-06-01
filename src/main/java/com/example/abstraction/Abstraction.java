package com.example.abstraction;

public class Abstraction {
	public static void main(String[] args) {
		Animal dog = new Dog("Dog");
		Animal cat = new Cat("Cat");

		System.out.println("--------------------");

		dog.cry();
		dog.eat();

		System.out.println("--------------------");

		cat.cry();
		cat.eat();
	}
}
