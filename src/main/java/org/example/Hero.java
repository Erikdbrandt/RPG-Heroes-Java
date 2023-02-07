package org.example;
import java.util.ArrayList;
import java.util.HashMap;


public abstract class Hero {

    private String name;
    private int Level = 1;

    private HashMap<String, Integer> levelAttributes = new HashMap<>(); // detta får nog ändras lite senare

    private ArrayList<String> equipment = new ArrayList<>();

    private ArrayList<String> validWeaponTypes = new ArrayList<>();

    private ArrayList<String> validArmorTypes = new ArrayList<>();


    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(int level) {
        Level = level;
    }

    public void setEquipment(String equipment) {
        this.equipment.add(equipment);
    }

    public void display () {
        System.out.println("Name: " + name);
        System.out.println("Level: " + Level);
        System.out.println("Attributes: " + levelAttributes);
        System.out.println("Equipment: " + equipment);
    }


}
