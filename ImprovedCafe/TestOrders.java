import java.net.SocketTimeoutException;

public class TestOrders {
    public static void main(String[] args) {
        // Menu items
        Item item1 = new Item("drip coffee",3.5);


        Item item2 = new Item("cappuccino", 1.5);


        Item item3 = new Item("latte",4.0);
  

        Item item4 = new Item("mocha", 4.5);


        // Order variables -- order1, order2 etc.
        Order order1 = new Order();
        Order order2 = new Order();


        Order order3 = new Order("Jimmy");
        Order order4 = new Order("Sam");
        Order order5 = new Order("Jill");

//--------FOR ASSIGNMENT ITEMS AND ORDERS--------------
        // // Printing order 1
        // System.out.printf("Order 1 is %s \n", order1);
        // //Adding item1 to order2's item list and increment the order total
        // order2.items.add(item1);
        // order2.total += item1.price;

        // //order 3 oredered a cappucino
        // order3.items.add(item2);
        // order3.total += item2.price;

        // //order 4 added a latte
        // order4.items.add(item3);
        // order4.total += item3.price;

        // //Cindhuri's order is now ready
        // order1.ready = true;

        // //Sam ordered more drink - 2 lattes
        // order2.items.add(item3);
        // order2.items.add(item3);
        // order2.total += (item3.price * 2);

        // //Jimmy's order is now ready
        // order3.ready = true;
        // // Application Simulations
        // // Use this example code to test various orders' updates
        // System.out.printf("Name: %s\n", order1.name);
        // System.out.printf("Total: %s\n", order1.total);
        // System.out.printf("Ready: %s\n", order1.ready);
        // System.out.printf("Name: %s\n", order2.name);
        // System.out.printf("Total: %s\n", order2.total);
        // System.out.printf("Ready: %s\n", order2.ready);
        // System.out.printf("Name: %s\n", order3.name);
        // System.out.printf("Total: %s\n", order3.total);
        // System.out.printf("Ready: %s\n", order3.ready);
        // System.out.printf("Name: %s\n", order4.name);
        // System.out.printf("Total: %s\n", order4.total);
        // System.out.printf("Ready: %s\n", order4.ready);

        order1.addItem(item4);
        order1.addItem(item4);

        order2.addItem(item1);
        order2.addItem(item2);

        order3.addItem(item4);
        order3.addItem(item3);

        order4.addItem(item2);
        order4.addItem(item3);

        order5.addItem(item1);
        order5.addItem(item3);
        order5.addItem(item3);

//Implement the getStatusMessage method within the Order class
        order4.setReady(true);
        order2.setReady(true);
        System.out.println(order1.getStatusMessage());
        System.out.println(order2.getStatusMessage());
        System.out.println(order3.getStatusMessage());
        System.out.println(order4.getStatusMessage());
        System.out.println(order5.getStatusMessage());


//GET ORDER
        System.out.println(order1.getOrderTotal());
        System.out.println(order2.getOrderTotal());
        System.out.println(order3.getOrderTotal());
        System.out.println(order4.getOrderTotal());
        System.out.println(order5.getOrderTotal());
        
        //CALL ORDER DISPLAY
        order1.display();
        order2.display();
        order3.display();
        order4.display();
        order5.display();
        
    }
}
