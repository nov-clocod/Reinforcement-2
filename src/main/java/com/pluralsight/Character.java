package com.pluralsight;

public class Character {
    private String name;
    private int health;
    private int strength;
    private int agility;

    public Character(String name, int strength, int agility) {
        this.name = name;
        this.health = 100;
        this.strength = strength;
        this.agility = agility;

    }

    public Character(String name) {
        this.name = name;
        this.health = 100;
        this.strength = 20;
        this.agility = 20;
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

    public int getStrength() {
        return this.strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getAgility() {
        return this.agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public String getDescription() {
        return name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
    }

    public String getHealthStatus() {
        return this.health + " HP";
    }

    public String getFullStatus() {
        StringBuilder statuses = new StringBuilder();

        statuses.append("Name: ").append(getDescription()).append("\n");
        statuses.append("Health: ").append(getHealthStatus()).append("\n");
        statuses.append("Strength: ").append(this.strength).append("\n");
        statuses.append("Agility: ").append(this.agility);

        return statuses.toString();
    }

    public void attack(Enemy enemy) {
         enemy.setHealth(enemy.getHealth() - this.strength);
    }

    public void attack(Enemy enemy, int weaponMultiplier) {
        enemy.setHealth(enemy.getHealth() - this.strength * weaponMultiplier);
    }
}
