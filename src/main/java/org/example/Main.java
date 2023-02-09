package org.example;

public class Main {
    public static void main(String[] args) {

        Mage mage = new Mage("Mage");

/*
        mage.equip(new Armor("Leather Armor", 1, Slot.LEGS, ArmorType.CLOTH, new HeroAttribute(1, 1, 1)));

        mage.equip(new Weapon("Staff", 1, 1, WeaponType.STAFF));

        mage.equip(new Armor("Magisk rock", 1, Slot.HEAD, ArmorType.CLOTH, new HeroAttribute(2, 5, 3)));
*/

        mage.display();

    }
}