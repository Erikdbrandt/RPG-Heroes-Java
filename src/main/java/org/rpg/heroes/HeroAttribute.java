package org.rpg.heroes;



public class HeroAttribute {

    protected int strength;
    protected int dexterity;
    protected int intelligence;

    public HeroAttribute(int strength, int dexterity, int intelligence) {
        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
    }

    // this method is used to increase the attributes of the hero
    public void increaseAttributes(int strength, int dexterity, int intelligence) {
        this.strength += strength;
        this.dexterity += dexterity;
        this.intelligence += intelligence;
    }


    // this method is used to compare two objects of type hero attribute

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HeroAttribute that = (HeroAttribute) o;

       return strength == that.strength && dexterity == that.dexterity && intelligence == that.intelligence;
    }



}
