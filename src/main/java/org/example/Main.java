package org.example;

public class Main {
    public static void main(String[] args) {



        Warrior warrior = new Warrior("Conan");

        warrior.levelUp();
        warrior.levelUp();

        warrior.equip(new Weapon("Sword", 1, Slot.Weapon, 10, WeaponType.SWORD));

        warrior.equip(new Weapon("Axe", 2, Slot.Weapon, 10, WeaponType.AXE));


        warrior.display();

    }
}