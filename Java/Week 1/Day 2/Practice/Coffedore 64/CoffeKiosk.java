import java.util.ArrayList;

public class CoffeKiosk {
    private ArrayList<Item> menu;
    private ArrayList<Order> orders;



public CoffeKiosk(){
    this.menu= new ArrayList<Item>();
    this.orders= new ArrayList<Order>();
}

public ArrayList getMenu(){
    return menu;
}
public void setMenu(ArrayList<Item> menu){
    this.menu=menu;
}


public void addMenuItem(String name, double price){
    Item newItem = new Item(name, price);
    menu.add(newItem );
}
public void displayMenu(){
    for (int i = 0; i < menu.size(); i++) {
        Item item = menu.get(i);
        System.out.println(i + " " + item.getName() + " -- $" + item.getPrice());
    }
}
public void newOrder() {
        
    // Shows the user a message prompt and then sets their input to a variable, name
    System.out.println("Please enter customer name for new order:");
    String name = System.console().readLine();

    // Your code:
    Order order = new Order(name);
    // Create a new order with the given input string
    displayMenu();
    // Show the user the menu, so they can choose items to add.
    
    // Prompts the user to enter an item number
    System.out.println("Please enter a menu item index or q to quit:");
    String itemNumber = System.console().readLine();
    
    // Write a while loop to collect all user's order items
    while(!itemNumber.equals("q")) {
        try{
        order.addItem(menu.get(Integer.parseInt(itemNumber)));
        }catch(NumberFormatException n){
            System.out.println("invalid selection");
        }
        // Get the item object from the menu, and add the item to the order
        System.out.println("please enter a menu item index or q to quit :");
        itemNumber= System.console().readLine();
        // Ask them to enter a new item index or q again, and take their input
    }
    order.display();
    // After you have collected their order, print the order details 

}

}
