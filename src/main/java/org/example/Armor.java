package org.example;

public class Armor extends Item {


    private final ArmorType armorType;

    private final HeroAttribute armorAttribute;

    private final Slot slot;

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


    public Slot getSlot() {
        return slot;
    }

    @Override
    public String toString() {
        return "Armor{" +
                "armorType=" + armorType +
                ", armorAttribute=" + armorAttribute +
                '}';
    }
}

