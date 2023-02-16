package org.example.items;

import org.example.heroes.HeroAttribute;

public class Armor extends Item {


    protected final ArmorType armorType;

    protected final HeroAttribute armorAttribute;



    public Armor(String name, int requiredLevel, Slot slot, ArmorType armorType, HeroAttribute armorAttribute) {
        super(name, requiredLevel);
        this.armorType = armorType;
        this.armorAttribute = armorAttribute;
        this.slot = slot;
    }

    public HeroAttribute getArmorAttribute() {
        return armorAttribute;
    }

    public ArmorType getArmorType() {
        return armorType;
    }





    @Override
    public String toString() {
        return "Armor{" +
                "armorType=" + armorType +
                ", armorAttribute=" + armorAttribute +
                '}';
    }
}

