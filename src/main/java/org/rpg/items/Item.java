package org.rpg.items;

public abstract class Item {

    // the attributes are protected so that they can be accessed by the subclasses and test classes in the same package

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
