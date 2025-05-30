package com.example.inheritance;

public class InheritanceMain {
	public static void main(String[] args) {
		Animal animal = new Animal("Animal", 1);
		Cat cat = new Cat("Cat", 2);
		Dog dog = new Dog("Dog", 3);

		System.out.println("--------------------");

		animal.eat();
		animal.cry();

		System.out.println("--------------------");

		cat.eat();
		cat.cry();
		cat.play();

		System.out.println("--------------------");

		dog.eat();
		dog.cry();
		System.out.println(dog.hungry);

	}
}
