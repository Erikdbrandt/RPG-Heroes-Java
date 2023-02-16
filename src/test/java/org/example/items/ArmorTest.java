package org.example.items;

import org.example.heroes.HeroAttribute;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArmorTest {


    Armor armor;


    @BeforeEach
    void setUp() {
        armor = new Armor("Armor", 2, Slot.BODY, ArmorType.LEATHER, new HeroAttribute(4,1,5));
    }

    @Test
    void nameShouldEqualArmor() {

        // Arrange

        String expected = "Armor";

        // Act

        String actual = armor.name;

        // Assert

        assertEquals(expected, actual);

    }

    @Test
    void levelShouldEqual2() {

        // Arrange

        int expected = 2;

        // Act

        int actual = armor.requiredLevel;

        // Assert

        assertEquals(expected, actual);

    }

    @Test
    void slotShouldEqualBody() {

        // Arrange

        Slot expected = Slot.BODY;

        // Act

        Slot actual = armor.slot;

        // Assert

        assertEquals(expected, actual);

    }

    @Test
    void armorTypeShouldEqualLeather() {

        // Arrange

        ArmorType expected = ArmorType.LEATHER;

        // Act

        ArmorType actual = armor.armorType;

        // Assert

        assertEquals(expected, actual);

    }

    @Test
    void attributesShouldEqual4_1_5() {

        // Arrange

        HeroAttribute expected = new HeroAttribute(4,1,5);

        // Act

        HeroAttribute actual = armor.armorAttribute;

        // Assert

        assertEquals(expected, actual);

    }

}
