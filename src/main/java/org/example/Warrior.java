package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class Warrior extends Hero {


    private HeroAttribute heroAttribute;
    private final ArrayList<WeaponType> validWeaponTypes;

    private final ArrayList<ArmorType> validArmorTypes;

    public Warrior(String name) {
        super(name);
        heroAttribute = new HeroAttribute(5, 2, 1);
        Collections.addAll(validWeaponTypes = new ArrayList<>(), WeaponType.SWORD, WeaponType.AXE, WeaponType.HAMMER);
        Collections.addAll(validArmorTypes = new ArrayList<>(), ArmorType.PLATE, ArmorType.MAIL);

    }

    @Override
    public ArrayList<ArmorType> getValidArmorTypes() {
        return validArmorTypes;
    }

    @Override
    public ArrayList<WeaponType> getValidWeaponTypes() {
        return validWeaponTypes;
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
