package org.example;

public class Item {

    private String name;
    private int requiredLevel;

    public Item(String name, int requiredLevel) {
        this.name = name;
        this.requiredLevel = requiredLevel;
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
