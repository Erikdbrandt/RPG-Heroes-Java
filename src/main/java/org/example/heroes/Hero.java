package org.example.heroes;

import java.util.ArrayList;
import java.util.HashMap;

import org.example.items.*;


public abstract class Hero {

    protected final String name;
    protected int level = 1;

    protected ArrayList<WeaponType> validWeaponTypes;

    protected ArrayList<ArmorType> validArmorTypes;

    protected HashMap<Slot, Item> equipment = new HashMap<>();

    protected HeroAttribute heroAttribute;



    public Hero(String name) {
        this.name = name;

        equipment.put(Slot.HEAD, null);
        equipment.put(Slot.BODY, null);
        equipment.put(Slot.LEGS, null);
        equipment.put(Slot.WEAPON, null);
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public ArrayList<WeaponType> getValidWeaponTypes() {
        return validWeaponTypes;
    }

    public ArrayList<ArmorType> getValidArmorTypes() {
        return validArmorTypes;
    }

    public HashMap<Slot, Item> getEquipment() {
        return equipment;
    }

    public HeroAttribute getHeroAttribute() {
        return heroAttribute;
    }

    public void levelUp() {
        level++;
    }


    public Boolean canEquip(Item item) {
        if (item instanceof Weapon) {
            if (!validWeaponTypes.contains(((Weapon) item).getWeaponType())) {
                System.out.println("Invalid weapon type");
                return false;
            }
            if (item.getRequiredLevel() > level) {
                System.out.println("Item level too high");
                return false;
            }
            return true;
        } else if (item instanceof Armor) {
            if (!validArmorTypes.contains(((Armor) item).getArmorType())) {
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

    public void totalDamage() {

        int damagingAttribute = 0;
        int weaponDamage = 1;

        // this gets the damaging attribute of the hero depending on the hero type (mage, warrior, ranger, rogue)
        if (this instanceof Mage) {
            damagingAttribute = heroAttribute.intelligence;
        } else if (this instanceof Warrior) {
            damagingAttribute = heroAttribute.strength;
        } else if (this instanceof Ranger || this instanceof Rogue) {
            damagingAttribute = heroAttribute.dexterity;
        }


        //this gets the weapon damage if there is a weapon equipped
        if (equipment.get(Slot.WEAPON) instanceof Weapon weapon) {
            weaponDamage = weapon.getWeaponDamage();
        }

        int heroDamage = weaponDamage * (1 + (damagingAttribute / 100));

        System.out.println("Hero damage: " + heroDamage);


    }


    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Level: " + level);
        System.out.println("Equipment: " + equipment);
        System.out.println(totalHeroAttributes());
    }


}
