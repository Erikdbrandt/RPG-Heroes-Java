package org.example;

public class Weapon extends Item{

    private int weaponDamage;

    private WeaponType weaponType;

    public Weapon(String name, int requiredLevel, Slot slot, int weaponDamage, WeaponType weaponType) {
        super(name, requiredLevel,slot);
        this.weaponDamage = weaponDamage;
        this.weaponType = weaponType;
    }


    public WeaponType getWeaponType() {
        return weaponType;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "weaponDamage=" + weaponDamage +
                ", weaponType=" + weaponType +
                '}';
    }
}
