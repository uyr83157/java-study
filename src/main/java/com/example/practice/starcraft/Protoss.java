package com.example.practice.starcraft;

public class Protoss extends Unit{
    public Protoss(String name, int health, int attackPower, String description, int position) {
        super(name, health, attackPower, description, position);
    }

    @Override
    public void attack (Unit unit) {
        if (unit.health <= 0) {
            System.out.println(name + " 유닛이 이미 사망했으므로 공격 불가");
        }

        System.out.println(name + " 유닛이 공격함: " + unit.name);

        int currentAttackPower = attackPower;

        if(unit instanceof Zerg){
            currentAttackPower *= 2;
        }

        unit.takeDamage(currentAttackPower);

        if (unit.health <= 0) {
            System.out.println(unit.name + " 유닛 사망");
        } else {
            System.out.println(unit.name + " 남은 체력: " + unit.health);
        }
    }
}
