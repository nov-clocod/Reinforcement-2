package com.pluralsight;

import java.sql.Array;

public class Main {
    public static void main(String[] args) {
        Character commonOne = new Character("Helix");

    }

    public static void battle(Character character, Enemy[] enemies) {
        for (Enemy enemy: enemies) {
            System.out.println();
            System.out.println("--------");
            System.out.println(character.getName());
            System.out.println("vs");
            System.out.println(enemy.getName());
            System.out.println("---------");

            while (character.getHealth() > 0 && enemy.getHealth() > 0) {
                character.attack(enemy);
                enemy.setHealth(enemy.getHealth() - character.getStrength());
                System.out.println(enemy.getName() + " have " + enemy.getHealth() + " HP");

                if (enemy.getHealth() <= 0) {
                    System.out.println(enemy.getName() + "is XoX");
                    break;
                }

                enemy.attack(character);
                character.getHealthStatus();

                if (character.getHealth() <= 0) {
                    System.out.println(character.getName() + "has fallen to the swarm of enemies");
                    break;
                }
            }
        }
    }
}
