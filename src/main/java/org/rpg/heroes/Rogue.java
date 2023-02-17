package org.rpg.heroes;

import java.util.ArrayList;
import java.util.Collections;

import org.rpg.items.ArmorType;
import org.rpg.items.WeaponType;

public class Rogue extends Hero {

    /*
     * the constructor adds the valid weapon and armor types to the lists and also sets the initial attributes for the class
     * */
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
