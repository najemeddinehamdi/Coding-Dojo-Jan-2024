import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
        Item item1= new Item("mocha", 4.5);

        Item item2= new Item("latte",3.5);


        Item item3= new Item("drip coffe",4.0);

        Item item4= new Item("cappuccino",3.5);

        ArrayList<Item> itemsOrder1 = new ArrayList<>();
        

        ArrayList<Item> itemsOrder2 = new ArrayList<>();
        itemsOrder2.add(item1);
        
        ArrayList<Item> itemsOrder3 = new ArrayList<>();
        itemsOrder3.add(item4) ;

        ArrayList<Item> itemsOrder4 = new ArrayList<>();
        itemsOrder4.add(item2);
        itemsOrder4.add(item2);
        itemsOrder4.add(item2);


        // Order variables -- order1, order2 etc.
        Order order1= new Order("Cindhuri",0, true,itemsOrder1);

        Order order2= new Order("jimmy",0, true,itemsOrder2);

        Order order3= new Order("Noah", 0,false,itemsOrder3);

        Order order4= new Order("Sam",0,false,itemsOrder4);


        order2.total += item1.price;
        order3.total += item4.price;
        order4.total += item2.price;
        // Application Simulations
        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);

        System.out.printf("Name: %s\n", order2.name);
        System.out.printf("Total: %s\n", order2.total);
        System.out.printf("Ready: %s\n", order2.ready);
        System.out.printf("Ready: %s\n", order2.items.get(0).name);

        System.out.printf("Name: %s\n", order3.name);
        System.out.printf("Total: %s\n", order3.total);
        System.out.printf("Ready: %s\n", order3.ready);
        System.out.printf("Ready: %s\n", order3.items.get(0).name);

        System.out.printf("Name: %s\n", order4.name);
        System.out.printf("Total: %s\n", order4.total);
        System.out.printf("Ready: %s\n", order4.ready);
        System.out.printf("Ready: %s\n", order4.items.get(0).name);
    }
}
