package org.example.items;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WeaponTest {

    Weapon weapon;


    @BeforeEach
    void setUp() {
        weapon = new Weapon("Sword", 2, 10, WeaponType.SWORD);
    }


    @Test
    void nameShouldEqualSword() {

        // Arrange

        String expected = "Sword";

        // Act

        String actual = weapon.name;

        // Assert

        assertEquals(expected, actual);

    }

    @Test
    void requiredLevelShouldEqual2() {

        // Arrange

        int expected = 2;

        // Act

        int actual = weapon.requiredLevel;

        // Assert

        assertEquals(expected, actual);

    }

    @Test
    void weaponSlotShouldEqualWeapon() {

        // Arrange

        Slot expected = Slot.WEAPON;

        // Act

        Slot actual = weapon.slot;

        // Assert

        assertEquals(expected, actual);
    }

    @Test
    void weaponTypeShouldEqualSword() {

        // Arrange

        WeaponType expected = WeaponType.SWORD;

        // Act

        WeaponType actual = weapon.weaponType;

        // Assert

        assertEquals(expected, actual);
    }

    @Test
    void damageShouldEqual10() {

        // Arrange

        int expected = 10;

        // Act

        int actual = weapon.weaponDamage;

        // Assert

        assertEquals(expected, actual);
    }



}