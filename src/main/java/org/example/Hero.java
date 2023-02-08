package org.example;

import java.util.ArrayList;
import java.util.HashMap;


public abstract class Hero {

    private String name;
    private int Level = 1;


    private ArrayList<String> equipment = new ArrayList<>();

    private ArrayList<String> validWeaponTypes = new ArrayList<>();

    private ArrayList<String> validArmorTypes = new ArrayList<>();


    public Hero(String name) {
        this.name = name;
    }


    public void levelUp() {
        Level++;
    }


    public void setEquipment(String equipment) {
        this.equipment.add(equipment);
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Level: " + Level);
        System.out.println("Equipment: " + equipment);
    }


}
