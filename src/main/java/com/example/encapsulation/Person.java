package com.example.encapsulation;

import lombok.Getter;

@Getter
public class Person {
    private String name;
    private int age;
    private String socialSecurityNumber;

    public Person(String name, String socialSecurityNumber) {
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        this.age = 0;
    }

    // Setter 유효성 검사
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("유효하지 않은 이름");
        }
    }


    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("나이 오류: " + age);
        }
    }

    public String getSocialSecurityNumber() {
        String frontPart = this.socialSecurityNumber.substring(0, 8);
        return frontPart + "******";
    }

    public void displayInfo() {
        System.out.println("이름: " + this.name);
        System.out.println("나이: " + this.age);
        System.out.println("주민등록번호: " + getSocialSecurityNumber());
    }
}
