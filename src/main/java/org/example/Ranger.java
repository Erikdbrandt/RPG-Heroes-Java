package org.example;

import java.util.ArrayList;
import java.util.Collections;


public class Ranger extends Hero {

    private final HeroAttribute heroAttribute;

    private final ArrayList<WeaponType> validWeaponTypes;
    private final ArrayList<ArmorType> validArmorTypes;

    public Ranger(String name) {
        super(name);
        heroAttribute = new HeroAttribute(1, 7, 1);
        Collections.addAll(validWeaponTypes = new ArrayList<>(), WeaponType.BOW);
        Collections.addAll(validArmorTypes = new ArrayList<>(), ArmorType.LEATHER, ArmorType.MAIL);

    }

    @Override
    public ArrayList<WeaponType> getValidWeaponTypes() {
        return validWeaponTypes;
    }

    @Override
    public ArrayList<ArmorType> getValidArmorTypes() {
        return validArmorTypes;
    }

    @Override
    public void levelUp() {
        super.levelUp();

        heroAttribute.increaseAttributes(1, 5, 1);

    }

    @Override
    public void display() {
        super.display();

        System.out.println(heroAttribute);
    }
}

