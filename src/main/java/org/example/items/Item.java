package org.example.items;

public abstract class Item {

    protected final String name;
    protected final int requiredLevel;

    protected Slot slot;



    public Item(String name, int requiredLevel) {
        this.name = name;
        this.requiredLevel = requiredLevel;

    }

    public Slot getSlot() {
        return slot;
    }



    public int getRequiredLevel() {
        return requiredLevel;
    }


}
