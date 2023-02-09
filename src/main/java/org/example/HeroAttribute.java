package org.example;

import java.util.ArrayList;

public class HeroAttribute {

    private int strength;
    private int dexterity;
    private int intelligence;

    public HeroAttribute(int strength, int dexterity, int intelligence) {
        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
    }

    public void increaseAttributes(int strength, int dexterity, int intelligence) {
        this.strength += strength;
        this.dexterity += dexterity;
        this.intelligence += intelligence;
    }

    public int getStrength() {
        return strength;
    }
    public int getDexterity() {
        return dexterity;
    }
    public int getIntelligence() {
        return intelligence;
    }

    @Override
    public String toString() {
        return "HeroAttribute{" +
                "strength=" + strength +
                ", dexterity=" + dexterity +
                ", intelligence=" + intelligence +
                '}';
    }


}
