package org.example.heroes;

import java.util.ArrayList;
import java.util.Collections;

import org.example.items.ArmorType;
import org.example.items.WeaponType;


public class Ranger extends Hero {

    public Ranger(String name) {
        super(name);
        heroAttribute = new HeroAttribute(1, 7, 1);
        Collections.addAll(validWeaponTypes = new ArrayList<>(), WeaponType.BOW);
        Collections.addAll(validArmorTypes = new ArrayList<>(), ArmorType.LEATHER, ArmorType.MAIL);
    }

    @Override
    public void levelUp() {
        super.levelUp();

        heroAttribute.increaseAttributes(1, 5, 1);

    }

    @Override
    public void totalDamage() {

    }

}

