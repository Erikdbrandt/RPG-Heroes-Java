package org.example;

public class Weapon extends Item{

    private int weaponDamage;

    private WeaponType weaponType;

    public Weapon(String name, int requiredLevel, int weaponDamage, WeaponType weaponType) {
        super(name, requiredLevel);
        this.weaponDamage = weaponDamage;
        this.weaponType = weaponType;
    }


    public WeaponType getWeaponType() {
        return weaponType;
    }
}
