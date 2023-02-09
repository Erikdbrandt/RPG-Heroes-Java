package org.example;

public class Weapon extends Item {

    private final int weaponDamage;

    private final WeaponType weaponType;

    private final Slot slot;

    public Weapon(String name, int requiredLevel, int weaponDamage, WeaponType weaponType) {
        super(name, requiredLevel);
        this.weaponDamage = weaponDamage;
        this.weaponType = weaponType;
        this.slot = Slot.WEAPON;
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

    @Override
    public Slot getSlot() {
        return slot;
    }
}
