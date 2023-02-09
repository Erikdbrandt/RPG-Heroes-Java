package org.example;

public class Main {
    public static void main(String[] args) {

        Ranger ranger = new Ranger("legolas");

        ranger.equip(new Weapon("bow", 1,  10, WeaponType.BOW));

        ranger.equip(new Armor("leather", 1, Slot.BODY, ArmorType.LEATHER, new HeroAttribute(1, 1, 1)));

        ranger.display();
    }
}