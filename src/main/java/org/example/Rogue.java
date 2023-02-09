package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class Rogue extends Hero {

    private HeroAttribute heroAttribute;

    private final ArrayList<WeaponType> validWeaponTypes;

    private final ArrayList<ArmorType> validArmorTypes;


    public Rogue(String name) {
        super(name);
        heroAttribute = new HeroAttribute(2, 6, 1);
        Collections.addAll(validWeaponTypes = new ArrayList<>(), WeaponType.SWORD, WeaponType.DAGGER);
        Collections.addAll(validArmorTypes = new ArrayList<>(), ArmorType.LEATHER, ArmorType.MAIL);

    }

    public HeroAttribute getHeroAttribute() {
        return heroAttribute;
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
        heroAttribute.increaseAttributes(1, 4, 1);
    }

    @Override
    public void display() {
        super.display();
        System.out.println(heroAttribute);
    /*    System.out.println("Strength: " + heroAttribute.strength);
        System.out.println("Dexterity: " + heroAttribute.dexterity);
        System.out.println("Intelligence: " + heroAttribute.intelligence);*/
    }
}
