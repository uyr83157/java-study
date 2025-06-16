package com.example.EqualityIdentity;

public class EqualityIdentity {
    public static void main(String[] args) {
        System.out.println("String 객체 비교");
        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println("str1 == str2 (동일성 비교): " + (str1 == str2));
        System.out.println("str1.equals(str2) (동등성 비교): " + str1.equals(str2));

        System.out.println("--------------------");

        System.out.println("String 리터럴 비교");
        String literal1 = "hello";
        String literal2 = "hello";
        System.out.println("literal1 == literal2 (동일성 비교): " + (literal1 == literal2));
        System.out.println("literal1.equals(literal2) (동등성 비교): " + literal1.equals(literal2));
        System.out.println("str1 == literal1 (동일성 비교): " + (str1 == literal1));

        System.out.println("--------------------");

        System.out.println("사용자 정의 객체(Person) 비교");
        Person person1 = new Person("홍길동", 25);
        Person person2 = new Person("홍길동", 25);
        Person person3 = person1;
        System.out.println("person1 == person2 (동일성 비교): " + (person1 == person2));
        System.out.println("person1.equals(person2) (동등성 비교): " + person1.equals(person2));
        System.out.println("person1 == person3 (동일성 비교): " + (person1 == person3));
        System.out.println("person1.hashCode(): " + person1.hashCode());
        System.out.println("person2.hashCode(): " + person2.hashCode());
    }
}
