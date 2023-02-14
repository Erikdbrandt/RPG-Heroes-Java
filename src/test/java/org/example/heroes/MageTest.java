package org.example.heroes;


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

        int actual = mage.getLevel();

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

        int actual = mage.getLevel();

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

}

