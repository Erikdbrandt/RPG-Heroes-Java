package org.example.heroes;

import java.util.ArrayList;
import java.util.Collections;

import org.example.items.ArmorType;
import org.example.items.WeaponType;

public class Rogue extends Hero {


    public Rogue(String name) {
        super(name);
        heroAttribute = new HeroAttribute(2, 6, 1);
        Collections.addAll(validWeaponTypes = new ArrayList<>(), WeaponType.SWORD, WeaponType.DAGGER);
        Collections.addAll(validArmorTypes = new ArrayList<>(), ArmorType.LEATHER, ArmorType.MAIL);
    }

    @Override
    public void levelUp() {
        super.levelUp();
        heroAttribute.increaseAttributes(1, 4, 1);
    }



}
