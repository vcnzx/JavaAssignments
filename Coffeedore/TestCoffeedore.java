

public class TestCoffeedore {
    public static void main(String[] args) {
        CoffeeKiosk coffeeKiosk = new CoffeeKiosk();

        coffeeKiosk.addMenuItem("bagel", 8.99);
        coffeeKiosk.addMenuItem("donut", 4.99);
        coffeeKiosk.addMenuItem("latte", 2.50);
        coffeeKiosk.addMenuItem("coffee", 0.23);
        coffeeKiosk.addMenuItem("tea", 1.20);

        coffeeKiosk.newOrder();
    }
}
