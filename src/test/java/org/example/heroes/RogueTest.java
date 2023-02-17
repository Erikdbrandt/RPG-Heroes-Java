package org.example.heroes;

import org.example.items.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RogueTest {

    Rogue rogue;


    @BeforeEach
    void setUp() {
        rogue = new Rogue("Erik");
    }

    @Test
    void nameShouldEqualErik() {

        // Arrange

        String expected = "Erik";

        // Act

        String actual = rogue.name;

        // Assert

        assertEquals(expected, actual);

    }

    @Test
    void levelShouldEqual1() {

        // Arrange

        int expected = 1;

        // Act

        int actual = rogue.level;

        // Assert

        assertEquals(expected, actual);

    }

    @Test
    void attributesShouldEqual2_6_1() {

        // Arrange

        HeroAttribute expected = new HeroAttribute(2, 6, 1);

        // Act

        HeroAttribute actual = rogue.heroAttribute;

        // Assert

        assertEquals(expected, actual);

    }

    @Test
    void levelUpShouldIncreaseLevelBy1() {

        // Arrange

        int expected = 2;

        // Act

        rogue.levelUp();
        int actual = rogue.level;

        // Assert

        assertEquals(expected, actual);

    }

    @Test
    void levelUpShouldIncreaseAttributesBy1_4_1() {

        // Arrange

        HeroAttribute expected = new HeroAttribute(3, 10, 2);

        // Act

        rogue.levelUp();
        HeroAttribute actual = rogue.heroAttribute;

        // Assert

        assertEquals(expected, actual);

    }

    @Test
    void testAttributes_1Armor_shouldEquals3_7_2() throws InvalidArmorException {

        // Arrange

        rogue.equip(new Armor("Armor", 1, Slot.BODY, ArmorType.LEATHER, new HeroAttribute(1,1,1)));

        HeroAttribute expected = new HeroAttribute(3, 7, 2);

        // Act

        HeroAttribute actual = rogue.totalHeroAttributes();

        // Assert

        assertEquals(expected, actual);
    }

    @Test
    void testAttributes_2Armor_shouldEquals4_8_3() throws InvalidArmorException {

        // Arrange

        rogue.equip(new Armor("Armor", 1, Slot.BODY, ArmorType.LEATHER, new HeroAttribute(1,1,1)));
        rogue.equip(new Armor("Armor", 1, Slot.LEGS, ArmorType.LEATHER, new HeroAttribute(1,1,1)));

        HeroAttribute expected = new HeroAttribute(4, 8, 3);

        // Act

        HeroAttribute actual = rogue.totalHeroAttributes();

        // Assert

        assertEquals(expected, actual);
    }

    @Test
    void testAttributes_replaceArmor_shouldEquals4_8_3() throws InvalidArmorException {

        // Arrange

        rogue.equip(new Armor("Armor", 1, Slot.BODY, ArmorType.LEATHER, new HeroAttribute(3,3,3)));
        rogue.equip(new Armor("Armor", 1, Slot.BODY, ArmorType.LEATHER, new HeroAttribute(2,2,2)));

        HeroAttribute expected = new HeroAttribute(4, 8, 3);

        // Act

        HeroAttribute actual = rogue.totalHeroAttributes();

        // Assert

        assertEquals(expected, actual);
    }

    @Test
    void testWeaponDamage_0Weapon_shouldEquals1_06()  {

        // Arrange

        double expected = 1.06;

        // Act

        double actual = rogue.totalDamage();

        // Assert

        assertEquals(expected, actual);
    }

    @Test
    void testWeaponDamage_1WeaponDamage5_shouldEquals5_3() throws InvalidWeaponException {

        // Arrange

        rogue.equip(new Weapon("Weapon", 1,5, WeaponType.DAGGER));

        double expected = 5.3;

        // Act

        double actual = rogue.totalDamage();

        // Assert

        assertEquals(expected, actual);
    }

    @Test
    void testWeaponDamage_replaceWeapon_shouldEquals5_3() throws InvalidWeaponException {

        // Arrange

        rogue.equip(new Weapon("Weapon", 1,50, WeaponType.DAGGER));
        rogue.equip(new Weapon("Weapon", 1,5, WeaponType.DAGGER));

        double expected = 5.3;

        // Act

        double actual = rogue.totalDamage();

        // Assert

        assertEquals(expected, actual);
    }

    @Test
    void testWeaponDamage_1WeaponDamage5_1ArmorIntelligence5_shouldEquals5_55() throws InvalidWeaponException, InvalidArmorException {

        // Arrange

        rogue.equip(new Weapon("Weapon", 1,5, WeaponType.DAGGER));
        rogue.equip(new Armor("Armor", 1, Slot.BODY, ArmorType.LEATHER, new HeroAttribute(0,5,0)));

        double expected = 5.55;

        // Act

        double actual = rogue.totalDamage();

        // Assert

        assertEquals(expected, actual);
    }

    @Test
    void testDisplayHero()  {

        // Arrange

        String expected = """
                Name: Erik
                Level: 1
                Class: Rogue
                Total strength: 2
                Total dexterity: 6
                Total intelligence: 1
                Total damage: 1.06
                """;

        // Act

        String actual = rogue.display();

        // Assert

        assertEquals(expected, actual);
    }

}
