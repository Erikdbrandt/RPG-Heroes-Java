package org.example;

import java.util.ArrayList;
import java.util.HashMap;


public abstract class Hero {

    private final String name;
    private int level = 1;

    private ArrayList<WeaponType> validWeaponTypes;

    private ArrayList<ArmorType> validArmorTypes; //göra denna abstract i framtiden sen kanske?

    private HashMap<Slot, Item> equipment = new HashMap<>();

    private HeroAttribute heroAttribute;


    // the constructor initializes the valid weapon and armor types
    public Hero(String name) {
        this.name = name;

        equipment.put(Slot.HEAD, null);
        equipment.put(Slot.BODY, null);
        equipment.put(Slot.LEGS, null);
        equipment.put(Slot.WEAPON, null);

    }


    public void levelUp() {
        level++;
    }

    public ArrayList<WeaponType> getValidWeaponTypes() {
        return validWeaponTypes;
    }

    public ArrayList<ArmorType> getValidArmorTypes() {
        return validArmorTypes;
    }

    public Boolean canEquip(Item item) {
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
        } else if (item instanceof Armor) {
            if (!getValidArmorTypes().contains(((Armor) item).getArmorType())) {
                System.out.println("Invalid Armor type");
                return false;
            }
            if (item.getRequiredLevel() > level) {
                System.out.println("Item level too high");
                return false;
            }
            return true;
        }
        return false;
    }

    public void equip(Weapon weapon) {
        if (canEquip(weapon)) {
            equipment.put(weapon.getSlot(), weapon);
        }
    }

    public void equip(Armor armor) {
        if (canEquip(armor)) {
            equipment.put(armor.getSlot(), armor);
        }
    }

    public HeroAttribute getHeroAttribute() {
        return heroAttribute;
    }

    public HeroAttribute totalHeroAttributes() {

        HeroAttribute heroA = new HeroAttribute(0, 0, 0);

        for (Item item : equipment.values()) {
            if (item instanceof Armor) {
                HeroAttribute h = ((Armor) item).getArmorAttribute();

                heroA.increaseAttributes(h.getStrength(), h.getDexterity(), h.getIntelligence());


            }
        }
        heroA.increaseAttributes(getHeroAttribute().getStrength(), getHeroAttribute().getDexterity(), getHeroAttribute().getIntelligence());

        return heroA;


    }


    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Level: " + level);
        System.out.println("Equipment: " + equipment);
        System.out.println(totalHeroAttributes());
    }


}
