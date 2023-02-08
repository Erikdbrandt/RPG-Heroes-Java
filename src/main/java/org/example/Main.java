package org.example;

public class Main {
    public static void main(String[] args) {

        Mage mage = new Mage("Gandalf");


        mage.levelUp();
        mage.levelUp();
        mage.display();

        Ranger ranger = new Ranger("Legolas");
        ranger.levelUp();
        ranger.levelUp();
        ranger.display();

    }
}