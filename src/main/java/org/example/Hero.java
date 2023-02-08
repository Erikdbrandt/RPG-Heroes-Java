package org.example;

import java.util.ArrayList;


public abstract class Hero {

    private String name;
    private int Level = 1;

    private ArrayList<WeaponType> validWeaponTypes;


    private ArrayList<Item> equipment = new ArrayList<>();



    public Hero(String name) {
        this.name = name;
    }


    public void levelUp() {
        Level++;
    }


    public void equip(Item item) {
        this.equipment.add(item);
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Level: " + Level);
        System.out.println("Equipment: " + equipment);
    }


}
