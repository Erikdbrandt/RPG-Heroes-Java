package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ranger extends Hero {

    private HeroAttribute heroAttribute;

    private final ArrayList<WeaponType> validWeaponTypes = new ArrayList<>(List.of(WeaponType.BOW));

    public Ranger(String name) {
        super(name);
        heroAttribute = new HeroAttribute(1, 7, 1);
    }

    @Override
    public void levelUp() {
        super.levelUp();
        heroAttribute.strength += 1;
        heroAttribute.dexterity += 5;
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

