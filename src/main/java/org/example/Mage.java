package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class Mage extends Hero {

    private HeroAttribute heroAttribute;
    private final ArrayList<WeaponType> validWeaponTypes;

    private final ArrayList<ArmorType> validArmorTypes;


    public Mage(String name) {
        super(name);
        heroAttribute = new HeroAttribute(1, 1, 8);
        Collections.addAll(validWeaponTypes = new ArrayList<>(), WeaponType.STAFF, WeaponType.WAND);
        Collections.addAll(validArmorTypes = new ArrayList<>(), ArmorType.CLOTH);

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
    public HeroAttribute getHeroAttribute() {
        return heroAttribute;
    }

    @Override
    public void levelUp() {
        super.levelUp();

        heroAttribute.increaseAttributes(1, 1, 8);

    }



    @Override
    public void display() {
        super.display();
   /*     System.out.println("Strength: " + heroAttribute.strength);
        System.out.println("Dexterity: " + heroAttribute.dexterity);
        System.out.println("Intelligence: " + heroAttribute.intelligence);*/
    }
}
