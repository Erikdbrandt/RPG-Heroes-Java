package org.example.heroes;

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

}
