package org.example;

import java.util.ArrayList;
import java.util.HashMap;


public abstract class Hero {

    private String name;
    private int level = 1;

    private ArrayList<WeaponType> validWeaponTypes;


    private HashMap<Slot,Item> equipment = new HashMap();



    public Hero(String name) {
        this.name = name;

        equipment.put(Slot.Head, null);
        equipment.put(Slot.Body, null);
        equipment.put(Slot.Legs, null);
        equipment.put(Slot.Weapon, null);

    }


    public void levelUp() {
        level++;
    }

    public ArrayList<WeaponType> getValidWeaponTypes() {
        return validWeaponTypes;
    }

    public  Boolean isEquippable(Item item) {
        if (item instanceof Weapon) {
            if (!getValidWeaponTypes().contains(((Weapon) item).getWeaponType())) {
                System.out.println("Invalid weapon type");
                return false;
            }
            if (item.getRequiredLevel() > level) {
                System.out.println("Item level too high");
                return false;
            }
            return true;
        } else {
            return false;
        }
    }


    public void equip(Item item) {
        if(isEquippable(item)) {
            equipment.put(item.getSlot(), item);
        }

    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Level: " + level);
        System.out.println("Equipment: " + equipment);
    }


}
