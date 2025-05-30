package com.example.inheritance;

public class InheritanceMain {
	public static void main(String[] args) {
		Animal animal = new Animal("Animal", 1);
		Cat cat = new Cat("Cat", 2);
		Dog dog = new Dog("Dog", 3);

		animal.eat();
		animal.cry();

		cat.eat();
		cat.cry();
		cat.play();

		dog.eat();
		dog.cry();

	}
}
