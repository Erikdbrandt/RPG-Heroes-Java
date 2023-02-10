package org.example.heroes;

import java.util.ArrayList;
import java.util.Collections;

import org.example.items.ArmorType;
import org.example.items.WeaponType;

public class Warrior extends Hero {


    public Warrior(String name) {
        super(name);
        heroAttribute = new HeroAttribute(5, 2, 1);
        Collections.addAll(validWeaponTypes = new ArrayList<>(), WeaponType.SWORD, WeaponType.AXE, WeaponType.HAMMER);
        Collections.addAll(validArmorTypes = new ArrayList<>(), ArmorType.PLATE, ArmorType.MAIL);
    }

    @Override
    public void levelUp() {
        super.levelUp();
        heroAttribute.increaseAttributes(3, 2, 1);
    }

    @Override
    public void totalDamage() {

    }


}
