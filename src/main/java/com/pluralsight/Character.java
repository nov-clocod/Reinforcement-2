package com.pluralsight;

public class Character {
    private String name;
    private int health;
    private String strength;
    private String agility;

    public Character(String name, String strength, String agility) {
        this.health = 100;
    }

    public Character(String name) {
        this.health = 100;
        this.strength = "";
        this.agility = "";
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

    public String getStrength() {
        return this.strength;
    }

    public void setStrength(String strength) {
        this.strength = strength;
    }

    public String getAgility() {
        return this.agility;
    }

    public void setAgility(String agility) {
        this.agility = agility;
    }

    public String getDescription(String name) {
        return name.substring(0,1).toUpperCase() + name.substring(1);
    }

    public String getHealthStatus() {
        return this.health + " HP";
    }

    public String getFullStatus() {
        StringBuilder statuses = new StringBuilder();

        statuses.append("Name: \n");
        statuses.append("Health: \n");
        statuses.append("Strength: \n");
        statuses.append("Agility: \n");

        return statuses.toString();
    }
}
