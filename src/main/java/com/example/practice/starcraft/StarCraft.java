package com.example.practice.starcraft;

import java.util.Random;

public class StarCraft {
    public static void main(String[] args) {
        System.out.println("1. 유닛 정보 출력");

        Unit marine = new Terran("마린", 20, 6, "Terran Unit", 0);
        Unit zealot = new Protoss("질럿", 30, 8, "Protoss Unit", 0);
        Unit zergling = new Zerg("저글링", 15, 5, "Zerg Unit", 0);

        marine.printUnitInfo();
        zealot.printUnitInfo();
        zergling.printUnitInfo();

        System.out.println("--------------------");

        System.out.println("2. 유닛 이동");
        Random random = new Random();
        int moveCount = random.nextInt(5) + 1;
        String[] directions = {"left", "right"};

        System.out.println("랜덤 이동 횟수: " + moveCount);
        zergling.printCurrentPosition();

        for (int i = 0; i < moveCount; i++) {
            String randomDirection = directions[random.nextInt(2)];
            zergling.move(randomDirection);
        }
        zergling.printCurrentPosition();

        System.out.println("--------------------");

        System.out.println("3. 유닛 공격");

        marine.attack(zealot);
        zealot.attack(zergling);
        zergling.attack(marine);
        zealot.attack(zergling);
        marine.attack(zergling);
    }
}
