package com.example.practice.starcraft;

public class Zerg extends Unit{
    public Zerg(String name, int health, int attackPower, String description, int position) {
        super(name, health, attackPower, description, position);
    }

    @Override
    public void move(String direction) {
        if (direction.equals("left")) {
            position -= 2;
            System.out.println(name + " 왼쪽으로 2배 이동: " + position);
        } else if (direction.equals("right")) {
            position += 2;
            System.out.println(name + " 오른쪽으로 2배 이동: " + position);
        }
    }
}
