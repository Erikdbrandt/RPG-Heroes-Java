package org.rpg.heroes;


import org.rpg.items.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MageTest {

    Mage mage;

    @BeforeEach
    void setUp() {
        mage = new Mage("Erik");
    }


    @Test
    void nameShouldEqualErik() {

        // Arrange

        String expected = "Erik";

        // Act

        String actual = mage.name;

        // Assert

        assertEquals(expected, actual);

    }

    @Test
    void levelShouldEqual1() {

        // Arrange

        int expected = 1;

        // Act

        int actual = mage.level;

        // Assert

        assertEquals(expected, actual);

    }

    @Test
    void attributesShouldEqual1_1_8() {

        // Arrange

        HeroAttribute expected = new HeroAttribute(1, 1, 8);

        // Act

        HeroAttribute actual = mage.heroAttribute;

        // Assert

        assertEquals(expected, actual);

    }

    @Test
    void levelUpShouldIncreaseLevelBy1() {

        // Arrange

        int expected = 2;

        // Act

        mage.levelUp();

        int actual = mage.level;
        // Assert

        assertEquals(expected, actual);

    }

    @Test
    void levelUpShouldIncreaseAttributesBy1_1_5() {

        // Arrange

        HeroAttribute expected = new HeroAttribute(2, 2, 13);

        // Act

        mage.levelUp();

        HeroAttribute actual = mage.heroAttribute;

        // Assert

        assertEquals(expected, actual);

    }


    @Test
    void testAttributes_1Armor_shouldEquals2_2_9() throws InvalidArmorException {

        // Arrange

        mage.equip(new Armor("Armor", 1, Slot.BODY, ArmorType.CLOTH, new HeroAttribute(1,1,1)));

        HeroAttribute expected = new HeroAttribute(2, 2, 9);

        // Act

        HeroAttribute actual = mage.totalHeroAttributes();

        // Assert

        assertEquals(expected, actual);
    }

    @Test
    void testAttributes_2Armor_shouldEquals3_3_10() throws InvalidArmorException {

        // Arrange

        mage.equip(new Armor("Armor", 1, Slot.BODY, ArmorType.CLOTH, new HeroAttribute(1,1,1)));
        mage.equip(new Armor("Armor", 1, Slot.LEGS, ArmorType.CLOTH, new HeroAttribute(1,1,1)));

        HeroAttribute expected = new HeroAttribute(3, 3, 10);

        // Act

        HeroAttribute actual = mage.totalHeroAttributes();

        // Assert

        assertEquals(expected, actual);
    }



    @Test
    void testWeaponDamage_0Weapon_shouldEquals1_08()  {

        // Arrange

        double expected = 1.08;

        // Act

        double actual = mage.totalDamage();

        // Assert

        assertEquals(expected, actual);
    }

    @Test
    void testWeaponDamage_1WeaponDamage5_shouldEquals5_4() throws InvalidWeaponException {

        // Arrange

        mage.equip(new Weapon("Weapon", 1,5, WeaponType.STAFF));

        double expected = 5.4;

        // Act

        double actual = mage.totalDamage();

        // Assert

        assertEquals(expected, actual);
    }

    @Test
    void testWeaponDamage_replaceWeapon_shouldEquals5_4() throws InvalidWeaponException {

        // Arrange

        mage.equip(new Weapon("Weapon", 1,50, WeaponType.STAFF));
        mage.equip(new Weapon("Weapon", 1,5, WeaponType.STAFF));

        double expected = 5.4;

        // Act

        double actual = mage.totalDamage();

        // Assert

        assertEquals(expected, actual);
    }

    @Test
    void testWeaponDamage_1WeaponDamage5_1ArmorIntelligence5_shouldEquals5_65() throws InvalidWeaponException, InvalidArmorException {

        // Arrange

        mage.equip(new Weapon("Weapon", 1,5, WeaponType.STAFF));
        mage.equip(new Armor("Armor", 1, Slot.BODY, ArmorType.CLOTH, new HeroAttribute(0,0,5)));

        double expected = 5.65;

        // Act

        double actual = mage.totalDamage();

        // Assert

        assertEquals(expected, actual);
    }

    @Test
    void testDisplayHero()  {

        // Arrange

        String expected = """
                Name: Erik
                Level: 1
                Class: Mage
                Total strength: 1
                Total dexterity: 1
                Total intelligence: 8
                Total damage: 1.08
                """;

        // Act

        String actual = mage.display();

        // Assert

        assertEquals(expected, actual);
    }

}

