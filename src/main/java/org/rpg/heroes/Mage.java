package org.rpg.heroes;

import java.util.ArrayList;
import java.util.Collections;

import org.rpg.items.ArmorType;

import org.rpg.items.WeaponType;

public class Mage extends Hero {

    /*
    * the constructor adds the valid weapon and armor types to the lists and also sets the initial attributes for the class
    * */
    public Mage(String name) {
        super(name);
        heroAttribute = new HeroAttribute(1, 1, 8);
        Collections.addAll(validWeaponTypes = new ArrayList<>(), WeaponType.STAFF, WeaponType.WAND);
        Collections.addAll(validArmorTypes = new ArrayList<>(), ArmorType.CLOTH);

    }

    @Override
    public void levelUp() {
        super.levelUp();

        heroAttribute.increaseAttributes(1, 1, 5);

    }

}
