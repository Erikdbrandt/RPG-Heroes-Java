package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Rogue extends Hero {

    private HeroAttribute heroAttribute;

    private final ArrayList<WeaponType> validWeaponTypes;



    public Rogue(String name) {
        super(name);
        heroAttribute = new HeroAttribute(2, 6, 1);
        Collections.addAll(validWeaponTypes = new ArrayList<>(), WeaponType.SWORD, WeaponType.DAGGER);

    }

    @Override
    public ArrayList<WeaponType> getValidWeaponTypes() {
        return validWeaponTypes;
    }

    @Override
    public void levelUp() {
        super.levelUp();
        heroAttribute.strength += 1;
        heroAttribute.dexterity += 4;
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
