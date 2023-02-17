package org.rpg.heroes;

import java.util.ArrayList;
import java.util.Collections;

import org.rpg.items.ArmorType;
import org.rpg.items.WeaponType;

public class Warrior extends Hero {

    /*
     * the constructor adds the valid weapon and armor types to the lists and also sets the initial attributes for the class
     * */
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


}
