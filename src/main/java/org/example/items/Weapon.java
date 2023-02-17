package org.example.items;



public class Weapon extends Item {

    protected final int weaponDamage;

    protected final WeaponType weaponType;


    public Weapon(String name, int requiredLevel, int weaponDamage, WeaponType weaponType) {
        super(name, requiredLevel);
        this.weaponDamage = weaponDamage;
        this.weaponType = weaponType;
        this.slot = Slot.WEAPON;
    }

    public int getWeaponDamage() {
        return weaponDamage;
    }


    public WeaponType getWeaponType() {
        return weaponType;
    }





}
