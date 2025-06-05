package com.example.generics;

public class Generics {
    public static void main(String[] args) {
        // String 타입 GenericBox
        GenericBox<String> stringGenericBox = new GenericBox<>();
        stringGenericBox.setContent("String Generic");
        String message = stringGenericBox.getContent();
        System.out.println("stringGenericBox: " + message);

        // Integer 타입 GenericBox
        GenericBox<Integer> integerGenericBox = new GenericBox<>();
        integerGenericBox.setContent(123);
        Integer number = integerGenericBox.getContent();
        System.out.println("integerGenericBox: " + number);

        // Double 타입 GenericBox
        GenericBox<Double> doubleGenericBox = new GenericBox<>();
        doubleGenericBox.setContent(3.14);
        Double pi = doubleGenericBox.getContent();
        System.out.println("doubleGenericBox: " + pi);
    }
}
