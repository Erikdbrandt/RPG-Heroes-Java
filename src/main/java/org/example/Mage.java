package org.example;

public class Mage extends Hero {

    private HeroAttribute heroAttribute;

    public Mage(String name) {
        super(name);
        heroAttribute = new HeroAttribute(1, 1, 8);
    }

    @Override
    public void levelUp() {
        super.levelUp();
        heroAttribute.strength += 1;
        heroAttribute.dexterity += 1;
        heroAttribute.intelligence += 8;

    }

    @Override
    public void display() {
        super.display();
        System.out.println("Strength: " + heroAttribute.strength);
        System.out.println("Dexterity: " + heroAttribute.dexterity);
        System.out.println("Intelligence: " + heroAttribute.intelligence);
    }
}
