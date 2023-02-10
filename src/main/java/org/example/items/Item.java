package org.example.items;

public abstract class Item {

    private final String name;
    private final int requiredLevel;



    public Item(String name, int requiredLevel) {
        this.name = name;
        this.requiredLevel = requiredLevel;

    }

    public abstract Slot getSlot();


    public int getRequiredLevel() {
        return requiredLevel;
    }

    public String getName() {
        return name;
    }


}
