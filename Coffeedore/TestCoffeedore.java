

public class TestCoffeedore {
    public static void main(String[] args) {
        CoffeeKiosk coffeeKiosk = new CoffeeKiosk();

        coffeeKiosk.addMenuItem("bagelchange", 8.99);
        coffeeKiosk.addMenuItem("donuts", 4.99);
        coffeeKiosk.addMenuItem("latte,change in main again", 2.50);
        coffeeKiosk.addMenuItem("coffeemainchange", 0.23);
        coffeeKiosk.addMenuItem("tea", 1.20);

        coffeeKiosk.newOrder();
    }
}
