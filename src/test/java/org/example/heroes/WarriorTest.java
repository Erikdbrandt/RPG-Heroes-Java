package org.example.heroes;

import org.example.items.*;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class WarriorTest {

    Warrior warrior;

    @BeforeEach
    void setUp() {
        warrior = new Warrior("Erik");
    }

    @Test
    void nameShouldEqualErik() {

        // Arrange

        String expected = "Erik";

        // Act

        String actual = warrior.name;

        // Assert

        assertEquals(expected, actual);

    }

    @Test
    void levelShouldEqual1() {

        // Arrange

        int expected = 1;

        // Act

        int actual = warrior.level;

        // Assert

        assertEquals(expected, actual);

    }

    @Test
    void attributesShouldEqual5_2_1() {

        // Arrange

        HeroAttribute expected = new HeroAttribute(5, 2, 1);

        // Act

        HeroAttribute actual = warrior.heroAttribute;

        // Assert

        assertEquals(expected, actual);

    }

    @Test
    void levelUpShouldIncreaseLevelBy1() {

        // Arrange

        int expected = 2;

        // Act

        warrior.levelUp();
        int actual = warrior.level;

        // Assert

        assertEquals(expected, actual);

    }

    @Test
    void levelUpsShouldIncreaseAttributesBy3_2_1() {

        // Arrange

        HeroAttribute expected = new HeroAttribute(8, 4, 2);

        // Act


        warrior.levelUp();
        HeroAttribute actual = warrior.heroAttribute;

        // Assert

        assertEquals(expected, actual);

    }


    @Test
    void testAttributes_1Armor_shouldEquals6_3_2() throws InvalidArmorException {

        // Arrange

        warrior.equip(new Armor("Armor", 1, Slot.BODY, ArmorType.MAIL, new HeroAttribute(1,1,1)));

        HeroAttribute expected = new HeroAttribute(6, 3, 2);

        // Act

        HeroAttribute actual = warrior.totalHeroAttributes();

        // Assert

        assertEquals(expected, actual);
    }

    @Test
    void testAttributes_2Armor_shouldEquals7_4_3() throws InvalidArmorException {

        // Arrange

        warrior.equip(new Armor("Armor", 1, Slot.BODY, ArmorType.PLATE, new HeroAttribute(1,1,1)));
        warrior.equip(new Armor("Armor", 1, Slot.LEGS, ArmorType.PLATE, new HeroAttribute(1,1,1)));

        HeroAttribute expected = new HeroAttribute(7, 4, 3);

        // Act

        HeroAttribute actual = warrior.totalHeroAttributes();

        // Assert

        assertEquals(expected, actual);
    }

    @Test
    void testAttributes_replaceArmor_shouldEquals7_4_3() throws InvalidArmorException {

        // Arrange

        warrior.equip(new Armor("Armor", 1, Slot.BODY, ArmorType.PLATE, new HeroAttribute(3,3,3)));
        warrior.equip(new Armor("Armor", 1, Slot.BODY, ArmorType.PLATE, new HeroAttribute(2,2,2)));

        HeroAttribute expected = new HeroAttribute(7, 4, 3);

        // Act

        HeroAttribute actual = warrior.totalHeroAttributes();

        // Assert

        assertEquals(expected, actual);
    }

    @Test
    void testWeaponDamage_0Weapon_shouldEquals1_05()  {

        // Arrange

        double expected = 1.05;

        // Act

        double actual = warrior.totalDamage();

        // Assert

        assertEquals(expected, actual);
    }

    @Test
    void testWeaponDamage_1WeaponDamage5_shouldEquals5_25() throws InvalidWeaponException {

        // Arrange

        warrior.equip(new Weapon("Weapon", 1,5, WeaponType.SWORD));

        double expected = 5.25;

        // Act

        double actual = warrior.totalDamage();

        // Assert

        assertEquals(expected, actual);
    }

    @Test
    void testWeaponDamage_replaceWeapon_shouldEquals5_25() throws InvalidWeaponException {

        // Arrange

        warrior.equip(new Weapon("Weapon", 1,50, WeaponType.SWORD));
        warrior.equip(new Weapon("Weapon", 1,5, WeaponType.SWORD));

        double expected = 5.25;

        // Act

        double actual = warrior.totalDamage();

        // Assert

        assertEquals(expected, actual);
    }

    @Test
    void testWeaponDamage_1WeaponDamage5_1ArmorIntelligence5_shouldEquals5_55() throws InvalidWeaponException, InvalidArmorException {

        // Arrange

        warrior.equip(new Weapon("Weapon", 1,5, WeaponType.SWORD));
        warrior.equip(new Armor("Armor", 1, Slot.BODY, ArmorType.PLATE, new HeroAttribute(5,0,0)));

        double expected = 5.5;

        // Act

        double actual = warrior.totalDamage();

        // Assert

        assertEquals(expected, actual);
    }

    @Test
    void testDisplayHero()  {

        // Arrange

        String expected = """
                Name: Erik
                Level: 1
                Class: Warrior
                Total strength: 5
                Total dexterity: 2
                Total intelligence: 1
                Total damage: 1.05
                """;

        // Act

        String actual = warrior.display();

        // Assert

        assertEquals(expected, actual);
    }

}
