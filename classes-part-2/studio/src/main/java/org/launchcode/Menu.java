import org.launchcode.MenuItem;

import java.time.LocalDate;

public class Menu {


    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private LocalDate lastUpdated;

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    //Define Custom toString() method
    @Override
    public String toString() {
        StringBuilder appetizers = new StringBuilder();
        for (MenuItem item: menuItems) {
            if (item.getCategory().equals("appetizer")){
                appetizers.append("\n").append(item.toString()).append("\n");
            }
        }StringBuilder mainCourses = new StringBuilder();
        for (MenuItem item: menuItems) {
             if (item.getCategory().equals("main course")){
                    appetizers.append("\n").append(item.toString()).append("\n");
        }
        }StringBuilder desserts = new StringBuilder();
        for (MenuItem item: menuItems) {
             if (item.getCategory().equals("dessert")){
                    appetizers.append("\n").append(item.toString()).append("\n");
                }
}

        return  "\nMarvin's Pasta Menu\n" +
                "APPETIZERS" + appetizers.toString() + "\n" +
                "MAIN COURSES" + mainCourses.toString() + "\n" +
                "DESSERT" + desserts.toString() + "\n";


    }

    //Define  addItem()

    void addItem(MenuItem newItem){
        menuItems.add(newItem);
        lastUpdated = LocalDate.now();
        }

        // To Do  Define RemoveITem()
    void removeItem(MenuItem item) {
        menuItems.remove(item);
        lastUpdated = LocalDate.now();
    }
}

