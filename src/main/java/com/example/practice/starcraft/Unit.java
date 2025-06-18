package com.example.practice.starcraft;

import lombok.AllArgsConstructor;
import lombok.Builder;

@AllArgsConstructor
@Builder
public class Unit {
    protected String name;
    protected int health;
    protected int attackPower;
    protected String description;
    protected int position;

    public void printUnitInfo() {
        System.out.println(name + " | 체력: " + health + " | 공격력: " + attackPower + " | 설명: " + description);
    }

    public void printCurrentPosition() {
        System.out.println(name + "의 현재 위치: " + position);
    }

    public void move(String direction) {
        if (direction.equals("left")) {
            position--;
            System.out.println(name + " 왼쪽으로 이동: " + position);
        } else if (direction.equals("right")) {
            position++;
            System.out.println(name + " 오른쪽으로 이동: " + position);
        }
    }

    public void attack(Unit unit) {
        if (unit.health <= 0) {
            System.out.println(name + " 유닛이 이미 사망했으므로 공격 불가");
        }

        System.out.println(name + " 유닛이 공격함: " + unit.name);

        unit.takeDamage(attackPower);

        if (unit.health <= 0) {
            System.out.println(unit.name + " 유닛 사망");
        } else {
            System.out.println(unit.name + " 남은 체력: " + unit.health);
        }
    }

    public void takeDamage(int damage) {
        health -= damage;
    }

}
