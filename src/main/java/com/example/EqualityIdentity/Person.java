package com.example.EqualityIdentity;

import lombok.Getter;

import java.util.Objects;

@Getter
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        // 동일성 체크
        if (this == o) return true;

        // null, 클래스 타입 체크
        if (o == null || getClass() != o.getClass()) return false;

        // 필드값 비교
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
