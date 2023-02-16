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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Weapon weapon = (Weapon) o;
        return weaponDamage == weapon.weaponDamage && weaponType == weapon.weaponType;
    }



    @Override
    public String toString() {
        return "Weapon{" +
                "weaponDamage=" + weaponDamage +
                ", weaponType=" + weaponType +
                '}';
    }

}
