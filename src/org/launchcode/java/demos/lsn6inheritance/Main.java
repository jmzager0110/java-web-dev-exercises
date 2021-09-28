package org.launchcode.java.demos.lsn6inheritance;

public class Main {
    public static void main(String[] args) {
        HouseCat garfield = new HouseCat("Garfield", 12);
        garfield.eat();
        System.out.println(garfield.isTired());   // prints true

        Cat suki = new HouseCat("Suki", 8);
        suki.noise();
        ((HouseCat) suki).isSatisfied();

    }

}
