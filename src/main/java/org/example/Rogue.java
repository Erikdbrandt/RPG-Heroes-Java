package org.example;

import java.util.ArrayList;
import java.util.List;

public class Rogue extends Hero {

    private HeroAttribute heroAttribute;

    private final ArrayList<WeaponType> validWeaponTypes = new ArrayList<>(List.of(WeaponType.SWORD, WeaponType.DAGGER));


    public Rogue(String name) {
        super(name);
        heroAttribute = new HeroAttribute(2, 6, 1);
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
