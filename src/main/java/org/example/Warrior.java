package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class Warrior extends Hero {


    private HeroAttribute heroAttribute;
    private ArrayList<WeaponType> validWeaponTypes;

    public Warrior(String name) {
        super(name);
        heroAttribute = new HeroAttribute(5, 2, 1);
        Collections.addAll(this.validWeaponTypes, WeaponType.SWORD, WeaponType.AXE, WeaponType.HAMMER);

    }

    @Override
    public void levelUp() {
        super.levelUp();
        heroAttribute.strength += 3;
        heroAttribute.dexterity += 2;
        heroAttribute.intelligence += 1;


    }

    @Override
    public void display() {
        super.display();
        System.out.println("Strength: " + heroAttribute.strength);
        System.out.println("Dexterity: " + heroAttribute.dexterity);
        System.out.println("Intelligence: " + heroAttribute.intelligence);
    }

}
