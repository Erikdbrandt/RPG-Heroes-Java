package org.rpg.items;

import org.rpg.heroes.HeroAttribute;

public class Armor extends Item {


    // the attributes are protected so they can be accessed by the subclasses and also in the testing in the same package
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


}

