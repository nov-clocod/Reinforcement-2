package com.pluralsight;

public class Enemy {
    private String name;
    private int health;
    private int damage;

    public Enemy(String name, int damage) {
        this.health = 100;
    }

    public Enemy(String name) {
        this.health = 100;
        this.damage = 0;
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
        if (health > 0) {
            this.health = health;
        } else {
            System.out.println("You are dead!");
        }
    }

    public int getDamage() {
        return this.damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
