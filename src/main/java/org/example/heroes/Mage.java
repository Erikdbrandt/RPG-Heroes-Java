package org.example.heroes;

import java.util.ArrayList;
import java.util.Collections;

import org.example.items.ArmorType;

import org.example.items.WeaponType;

public class Mage extends Hero {

    public Mage(String name) {
        super(name);
        heroAttribute = new HeroAttribute(1, 1, 8);
        Collections.addAll(validWeaponTypes = new ArrayList<>(), WeaponType.STAFF, WeaponType.WAND);
        Collections.addAll(validArmorTypes = new ArrayList<>(), ArmorType.CLOTH);

    }

    @Override
    public void levelUp() {
        super.levelUp();

        heroAttribute.increaseAttributes(1, 1, 8);

    }



}
