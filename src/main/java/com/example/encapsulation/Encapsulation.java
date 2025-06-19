package com.example.encapsulation;

public class Encapsulation {
    public static void main(String[] args) {
        Person person = new Person("홍길동", "950101-1234567");

        person.displayInfo();

        System.out.println("--------------------");

        person.setAge(30);
        System.out.println("30살로 변경 후 나이: " + person.getAge());

        person.setAge(-10);
        System.out.println("음수로 변경 시도 후 나이: " + person.getAge());

        System.out.println("--------------------");

        String currentName = person.getName();
        System.out.println("현재 이름: " + currentName);

        System.out.println("--------------------");

        person.displayInfo();
    }
}
