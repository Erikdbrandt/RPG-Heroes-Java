package org.example.heroes;

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



}
