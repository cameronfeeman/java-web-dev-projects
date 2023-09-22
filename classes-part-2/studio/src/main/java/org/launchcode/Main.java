package org.launchcode;

import java.awt.*;

public class Main {

    public static void main(String[] args) {

        // To Do: Create 5 menu items in different categories
        MenuItem item1 = new MenuItem(  "Ravioli", "A delicious four cheese ravioli in a white cream sauce.",  18.99,  "main course");
        MenuItem item2 = new MenuItem( "House Salad",  "Lettuce with tomatoes and red onions and an italian vinaigrette.", 7.89, "appetizer");
        MenuItem item3 = new MenuItem( "crème brûlée",  "a French classic with vanilla bean and caramelized sugar", 9.99,  "dessert");
        MenuItem item4 = new MenuItem( "Eggplant Parm", "Roasted Eggplant with pasta.",  18.99,  "main course");
        MenuItem item5 = new MenuItem( "Cheese Board",  "Selection of artisan cheeses.",  14.89,  "appetizer");

        System.out.println(item1.isNew());

        // Print first Item
        System.out.println(item1);

        //Create Menu

        Menu menu = new Menu();

        //Add items to menu and print it
        menu.addItem(item1);
        menu.addItem(item2);
        menu.addItem(item3);
        menu.addItem(item4);
        menu.addItem(item5);

        System.out.println(menu);

        //Remove an item and print menu

        menu.removeItem(item4);
        System.out.println(menu);


        //Test equals method

    }
}
