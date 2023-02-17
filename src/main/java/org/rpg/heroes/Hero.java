package org.rpg.heroes;

import java.util.ArrayList;
import java.util.HashMap;

import org.rpg.items.*;


public abstract class Hero {


    //the attributes in this class are protected so that they can be accessed by the subclasses and also in the testing in the same package

    protected final String name;

    protected int level = 1;

    protected ArrayList<WeaponType> validWeaponTypes;

    protected ArrayList<ArmorType> validArmorTypes;

    protected HashMap<Slot, Item> equipment = new HashMap<>();

    protected HeroAttribute heroAttribute;


    // when a hero is created it is given a name and the equipment hashmap is filled with null values with the Slots as keys
    public Hero(String name) {
        this.name = name;

        equipment.put(Slot.HEAD, null);
        equipment.put(Slot.BODY, null);
        equipment.put(Slot.LEGS, null);
        equipment.put(Slot.WEAPON, null);
    }


    public HashMap<Slot, Item> getEquipment() {
        return equipment;
    }


    //this method is used to increase the level of the hero

    public void levelUp() {
        level++;
    }


    /*
    * this method is used to equip a weapon to the hero
    * it checks if the weapon type is valid for the hero
    * it also checks if the weapon level is too high for the hero
    * if the weapon is valid it is added to the equipment hashmap
    * otherwise an exception is thrown
    * */

    public void equip(Weapon weapon) throws InvalidWeaponException {
        if (!validWeaponTypes.contains((weapon).getWeaponType())) {
            throw new InvalidWeaponException("Invalid weapon type");

        }
        if (weapon.getRequiredLevel() > level) {
            throw new InvalidWeaponException("Weapon level is too high");
        }

        equipment.put(Slot.WEAPON, weapon);

    }

    /*
    * this method is used to equip armor to the hero
    * it checks if the armor type is valid for the hero
    * it also checks if the armor level is too high for the hero
    * if the armor is valid it is added to the equipment hashmap
    * */

    public void equip(Armor armor) throws InvalidArmorException {
        if (!validArmorTypes.contains((armor).getArmorType())) {
            throw new InvalidArmorException("Invalid armor type");

        }
        if (armor.getRequiredLevel() > level) {
            throw new InvalidArmorException("Armor level is too high");
        }

        equipment.put(armor.getSlot(), armor);
    }


    /*
    * this method is used to return the total hero attributes
    * its adds the attributes from the equipment and adds it to the hero attributes
    * and also adds the hero attributes from the hero according to the hero level
    * */

    public HeroAttribute totalHeroAttributes() {

        HeroAttribute totalHeroAttributes = new HeroAttribute(0, 0, 0);

        for (Item item : equipment.values()) {
            if (item instanceof Armor armor) { //implementera detta
                HeroAttribute armorAttribute = armor.getArmorAttribute();
                totalHeroAttributes.increaseAttributes(armorAttribute.strength, armorAttribute.dexterity, armorAttribute.intelligence);
            }
        }
        totalHeroAttributes.increaseAttributes(heroAttribute.strength, heroAttribute.dexterity, heroAttribute.intelligence);

        return totalHeroAttributes;
    }

    /*
    * this method is used to return the total hero damage
    * it checks the hero type and gets the damaging attribute
    * it also checks if the hero has a weapon equipped and gets the weapon damage
    * it then calculates the total damage
    * */

    public double totalDamage() {

        double damagingAttribute = 0;
        double weaponDamage = 1;

        // this gets the damaging attribute of the hero depending on the hero type (mage, warrior, ranger, rogue)
        if (this instanceof Mage) {
            damagingAttribute = totalHeroAttributes().intelligence;
        } else if (this instanceof Warrior) {
            damagingAttribute = totalHeroAttributes().strength;
        } else if (this instanceof Ranger || this instanceof Rogue) {
            damagingAttribute = totalHeroAttributes().dexterity;
        }


        //this gets the weapon damage if there is a weapon equipped
        if (equipment.get(Slot.WEAPON) instanceof Weapon weapon) {
            weaponDamage = weapon.getWeaponDamage();
        }

        double heroDamage = weaponDamage * (1 + (damagingAttribute / 100));


        return Math.round(heroDamage * 100.0) / 100.0; //rounds the double to 2 decimals


    }

    //this method is used to display the hero information

    public String  display() {


        return "Name: " + name + "\n" +
                "Level: " + level + "\n" +
                "Class: " + this.getClass().asSubclass(this.getClass()).getSimpleName() + "\n" +
                "Total strength: " + totalHeroAttributes().strength + "\n" +
                "Total dexterity: " + totalHeroAttributes().dexterity + "\n" +
                "Total intelligence: " + totalHeroAttributes().intelligence + "\n" +
                "Total damage: " + totalDamage() + "\n";



    }


}
