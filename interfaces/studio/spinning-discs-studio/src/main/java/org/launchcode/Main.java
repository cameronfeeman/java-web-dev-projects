package org.launchcode;

public class Main {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.
        CD myCD = new CD("Evanescence", 700, "Bring me to Life, My Immortal", "CD");
        DVD myDVD = new DVD("Star Wars", 4.7, "The Emperor Strikes Back", "DVD");
        // TODO: Call each CD and DVD method to verify that they work as expected.
       /* myCD.spinDisc();
        myDVD.spinDisc();
        myCD.storeData();
        myDVD.storeData();
        myCD.writeDiscWithLaser();
        myDVD.writeDiscWithLaser();
        myCD.readDiscWithLaser();
        myDVD.readDiscWithLaser();
        */

        System.out.println(myDVD.name);
        System.out.println(myDVD.capacity);
        System.out.println(myDVD.contents);
        System.out.println(myDVD.discType);
    }
}