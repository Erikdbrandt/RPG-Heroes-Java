package org.rpg.items;


import org.rpg.heroes.InvalidWeaponException;
import org.rpg.heroes.Ranger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class WeaponTest {

    Weapon weaponSword;
    Weapon weaponBow;

    Weapon validWeapon;
    Ranger ranger;


    @BeforeEach
    void setUp() {
        weaponSword = new Weapon("Sword", 2, 10, WeaponType.SWORD);
        ranger = new Ranger("Erik");
        weaponBow = new Weapon("Bow", 2, 5, WeaponType.BOW);
        validWeapon = new Weapon("Bow", 1, 10, WeaponType.BOW);

    }


    @Test
    void nameShouldEqualSword() {

        // Arrange

        String expected = "Sword";

        // Act

        String actual = weaponSword.name;

        // Assert

        assertEquals(expected, actual);

    }

    @Test
    void requiredLevelShouldEqual2() {

        // Arrange

        int expected = 2;

        // Act

        int actual = weaponSword.requiredLevel;

        // Assert

        assertEquals(expected, actual);

    }

    @Test
    void weaponSlotShouldEqualWeapon() {

        // Arrange

        Slot expected = Slot.WEAPON;

        // Act

        Slot actual = weaponSword.slot;

        // Assert

        assertEquals(expected, actual);
    }

    @Test
    void weaponTypeShouldEqualSword() {

        // Arrange

        WeaponType expected = WeaponType.SWORD;

        // Act

        WeaponType actual = weaponSword.weaponType;

        // Assert

        assertEquals(expected, actual);
    }

    @Test
    void damageShouldEqual10() {

        // Arrange

        int expected = 10;

        // Act

        int actual = weaponSword.weaponDamage;

        // Assert

        assertEquals(expected, actual);
    }

    @Test
    void testEquipWeapon_weaponlevel2_heroLevel1_shoulThrowInvalidWeaponException() {

        // Arrange

        String expected = "Weapon level is too high";

        // Act

        InvalidWeaponException actual = assertThrows(InvalidWeaponException.class, () -> ranger.equip(weaponBow));

        // Assert

        assertEquals(expected, actual.getMessage());

    }

    @Test
    void testEquipWeapon_ranger_sword_shouldNotThrowInvalidWeaponException() {

        // Arrange

        String expected = "Invalid weapon type";

        // Act

        InvalidWeaponException actual = assertThrows(InvalidWeaponException.class, () -> ranger.equip(weaponSword));

        // Assert

        assertEquals(expected, actual.getMessage());
    }

    @Test
    void testEquipWeapon_ranger_bow_shouldEquipWeapon() throws InvalidWeaponException {

        // Arrange

        ranger.equip(validWeapon);

        Weapon expected = validWeapon;

        // Act

       Weapon actual = (Weapon) ranger.getEquipment().get(Slot.WEAPON);

        // Assert

        assertEquals(expected, actual);
    }



}