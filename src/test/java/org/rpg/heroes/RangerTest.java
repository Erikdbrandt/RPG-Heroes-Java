package org.rpg.heroes;

import org.rpg.items.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RangerTest {

    Ranger ranger;


    @BeforeEach
    void setUp() {
        ranger = new Ranger("Erik");
    }

    @Test
    void nameShouldEqualErik() {

        // Arrange

        String expected = "Erik";

        // Act

        String actual = ranger.name;

        // Assert


        assertEquals(expected, actual);

    }

    @Test
    void levelShouldEqual1() {

        // Arrange

        int expected = 1;

        // Act

        int actual = ranger.level;

        // Assert

        assertEquals(expected, actual);

    }

    @Test
    void attributesShouldEqual1_7_1() {

        // Arrange

        HeroAttribute expected = new HeroAttribute(1, 7, 1);

        // Act

        HeroAttribute actual = ranger.heroAttribute;

        // Assert

        assertEquals(expected, actual);

    }

    @Test
    void levelUpShouldIncreaseLevelBy1() {
        // Arrange
        int expected = 2;
        // Act
        ranger.levelUp();
        int actual = ranger.level;
        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void levelUpShouldIncreaseAttributesBy1_5_1() {
        // Arrange
        HeroAttribute expected = new HeroAttribute(2, 12, 2);
        // Act
        ranger.levelUp();
        HeroAttribute actual = ranger.heroAttribute;
        // Assert
        assertEquals(expected, actual);
    }


    @Test
    void testAttributes_1Armor_shouldEquals2_8_2() throws InvalidArmorException {

        // Arrange

        ranger.equip(new Armor("Armor", 1, Slot.BODY, ArmorType.LEATHER, new HeroAttribute(1,1,1)));

        HeroAttribute expected = new HeroAttribute(2, 8, 2);

        // Act

        HeroAttribute actual = ranger.totalHeroAttributes();

        // Assert

        assertEquals(expected, actual);
    }

    @Test
    void testAttributes_2Armor_shouldEquals3_9_3() throws InvalidArmorException {

        // Arrange

        ranger.equip(new Armor("Armor", 1, Slot.BODY, ArmorType.LEATHER, new HeroAttribute(1,1,1)));
        ranger.equip(new Armor("Armor", 1, Slot.LEGS, ArmorType.LEATHER, new HeroAttribute(1,1,1)));

        HeroAttribute expected = new HeroAttribute(3, 9, 3);

        // Act

        HeroAttribute actual = ranger.totalHeroAttributes();

        // Assert

        assertEquals(expected, actual);
    }
    @Test
    void testAttributes_replaceArmor_shouldEquals3_9_3() throws InvalidArmorException {

        // Arrange

        ranger.equip(new Armor("Armor", 1, Slot.BODY, ArmorType.LEATHER, new HeroAttribute(3,3,3)));
        ranger.equip(new Armor("Armor", 1, Slot.BODY, ArmorType.LEATHER, new HeroAttribute(2,2,2)));

        HeroAttribute expected = new HeroAttribute(3, 9, 3);

        // Act

        HeroAttribute actual = ranger.totalHeroAttributes();

        // Assert

        assertEquals(expected, actual);
    }


    @Test
    void testWeaponDamage_0Weapon_shouldEquals1_07()  {

        // Arrange

        double expected = 1.07;

        // Act

        double actual = ranger.totalDamage();

        // Assert

        assertEquals(expected, actual);
    }

    @Test
    void testWeaponDamage_1WeaponDamage5_shouldEquals5_35() throws InvalidWeaponException {

        // Arrange

        ranger.equip(new Weapon("Weapon", 1,5, WeaponType.BOW));

        double expected = 5.35;

        // Act

        double actual = ranger.totalDamage();

        // Assert

        assertEquals(expected, actual);
    }

@Test
    void testWeaponDamage_replaceWeapon_shouldEquals5_35() throws InvalidWeaponException {

        // Arrange

        ranger.equip(new Weapon("Weapon", 1,50, WeaponType.BOW));
        ranger.equip(new Weapon("Weapon", 1,5, WeaponType.BOW));

        double expected = 5.35;

        // Act

        double actual = ranger.totalDamage();

        // Assert

        assertEquals(expected, actual);
    }

    @Test
    void testWeaponDamage_1WeaponDamage5_1ArmorIntelligence5_shouldEquals5_6() throws InvalidWeaponException, InvalidArmorException {

        // Arrange

        ranger.equip(new Weapon("Weapon", 1,5, WeaponType.BOW));
        ranger.equip(new Armor("Armor", 1, Slot.BODY, ArmorType.LEATHER, new HeroAttribute(0,5,0)));

        double expected = 5.6;

        // Act

        double actual = ranger.totalDamage();

        // Assert

        assertEquals(expected, actual);
    }


    @Test
    void testDisplayHero()  {

        // Arrange

        String expected = """
                Name: Erik
                Level: 1
                Class: Ranger
                Total strength: 1
                Total dexterity: 7
                Total intelligence: 1
                Total damage: 1.07
                """;

        // Act

        String actual = ranger.display();

        // Assert

        assertEquals(expected, actual);
    }
}
