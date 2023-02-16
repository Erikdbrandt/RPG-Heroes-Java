package org.example.items;

import org.example.heroes.HeroAttribute;
import org.example.heroes.InvalidArmorException;
import org.example.heroes.Ranger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ArmorTest {


    Armor armorLeatherLevel2;

    Ranger ranger;

    Armor armorClothLevel1;

    Armor armorLeatherLevel1;


    @BeforeEach
    void setUp() {
        armorLeatherLevel2 = new Armor("Armor", 2, Slot.BODY, ArmorType.LEATHER, new HeroAttribute(4,1,5));
        ranger = new Ranger("Erik");
        armorClothLevel1 = new Armor("Armor", 1, Slot.BODY, ArmorType.CLOTH, new HeroAttribute(2,1,3));
        armorLeatherLevel1 = new Armor("Armor", 1, Slot.BODY, ArmorType.LEATHER, new HeroAttribute(3,1,4));
    }

    @Test
    void nameShouldEqualArmor() {

        // Arrange

        String expected = "Armor";

        // Act

        String actual = armorLeatherLevel2.name;

        // Assert

        assertEquals(expected, actual);

    }

    @Test
    void levelShouldEqual2() {

        // Arrange

        int expected = 2;

        // Act

        int actual = armorLeatherLevel2.requiredLevel;

        // Assert

        assertEquals(expected, actual);

    }

    @Test
    void slotShouldEqualBody() {

        // Arrange

        Slot expected = Slot.BODY;

        // Act

        Slot actual = armorLeatherLevel2.slot;

        // Assert

        assertEquals(expected, actual);

    }

    @Test
    void armorTypeShouldEqualLeather() {

        // Arrange

        ArmorType expected = ArmorType.LEATHER;

        // Act

        ArmorType actual = armorLeatherLevel2.armorType;

        // Assert

        assertEquals(expected, actual);

    }

    @Test
    void attributesShouldEqual4_1_5() {

        // Arrange

        HeroAttribute expected = new HeroAttribute(4,1,5);

        // Act

        HeroAttribute actual = armorLeatherLevel2.armorAttribute;

        // Assert

        assertEquals(expected, actual);

    }


    @Test
    void testEquipArmor_armorlevel2_heroLevel1_shoulThrowInvalidArmorException() {

        // Arrange

        String expected = "Armor level is too high";

        // Act

        InvalidArmorException actual = assertThrows(InvalidArmorException.class, () -> ranger.equip(armorLeatherLevel2));

        // Assert

        assertEquals(expected, actual.getMessage());
    }

    @Test
    void testEquipArmor_ranger_cloth_shouldNotThrowInvalidArmorException() {

        // Arrange

        String expected = "Invalid armor type";

        // Act

        InvalidArmorException actual = assertThrows(InvalidArmorException.class, () -> ranger.equip(armorClothLevel1));

        // Assert

        assertEquals(expected, actual.getMessage());
    }

    @Test
    void testEquipArmor_ranger_leather_shouldEquipArmor() throws InvalidArmorException {

        // Arrange

        ranger.equip(armorLeatherLevel1);

        Armor expected = armorLeatherLevel1;

        // Act

        Armor actual = (Armor) ranger.getEquipment().get(Slot.BODY);

        // Assert

        assertEquals(expected, actual);
    }


}
