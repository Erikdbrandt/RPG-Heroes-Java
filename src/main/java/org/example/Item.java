package org.example;

public class Item {

    private String name;
    private int requiredLevel;

    private Slot slot;

    public Item(String name, int requiredLevel, Slot slot) {
        this.name = name;
        this.requiredLevel = requiredLevel;
        this.slot = slot;
    }

    public Slot getSlot() {
        return slot;
    }

    public int getRequiredLevel() {
        return requiredLevel;
    }

    public String getName() {
        return name;
    }

    void equipItem(Hero hero) {
        hero.equip(this);
    }


}
