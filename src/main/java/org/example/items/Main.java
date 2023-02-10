package org.example.items;

import org.example.heroes.HeroAttribute;
import org.example.heroes.Mage;
import org.example.heroes.Ranger;

public class Main {
    public static void main(String[] args) {

 /*       Mage mage = new Mage("Mage");


        mage.equip(new Armor("Leather Armor", 1, Slot.LEGS, ArmorType.MAIL, new HeroAttribute(1, 1, 1)));

        mage.equip(new Weapon("Staff", 1, 1, WeaponType.SWORD));

        mage.equip(new Armor("Magisk rock", 1, Slot.HEAD, ArmorType.CLOTH, new HeroAttribute(2, 5, 3)));


        mage.display();*/


        Ranger ranger = new Ranger("Ranger");

        ranger.equip(new Armor("Leather Armor", 1, Slot.LEGS, ArmorType.MAIL, new HeroAttribute(1, 1, 1)));

        ranger.display();

    }
}