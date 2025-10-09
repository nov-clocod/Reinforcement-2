package com.pluralsight;

public class Enemy {
    private String name;
    private int health;
    private int damage;

    public Enemy(String name, int damage) {
        this.name = name;
        this.health = 100;
        this.damage = damage;
    }

    public Enemy(String name) {
        this.name = name;
        this.health = 100;
        this.damage = 15;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        if (health >= 0) {
            this.health = health;
        }
    }

    public int getDamage() {
        return this.damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void attack(Character character) {
        character.setHealth(character.getHealth() - this.damage);
        System.out.println("Your enemy: " + this.name + " dealt " + this.damage + " to " + character.getName());
    }

    public void attack(Character character, int specialAbilityMultiplier) {
        int multiplierDamage = (int) this.damage * specialAbilityMultiplier;
        character.setHealth(character.getHealth() - multiplierDamage);
        System.out.println(this.name + " used cast a special attack it has dealt " + multiplierDamage + "x multiplier to " + character.getName());
    }
}
