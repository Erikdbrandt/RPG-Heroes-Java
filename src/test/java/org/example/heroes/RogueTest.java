package org.example.heroes;

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

}
