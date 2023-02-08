
import java.util.ArrayList;

public class Order {
    private String name;
    // double total; used in Orders and Items assignment 
    private boolean ready;
    private ArrayList<Item> items;

    public Order(){
        this.name = "Guest";
        this.items = new ArrayList<Item>();
    }

    public Order(String name){
        this.name = name;
        this.items = new ArrayList<Item>();
    }

    //Order getter
    public String getName(){
        return this.name;
    }

    public boolean getReady(){
        return this.ready;
    }

    public ArrayList<Item> getItems(){
        return this.items;
    }

    //Order Setter
    public void setName(String name){
        this.name = name;
    }

    public void setReady(boolean ready){
        this.ready = ready;
    }

    public void setItems(ArrayList<Item> items){
        this.items = items;
    }

    //Order class methods
    public void addItem(Item item){
        items.add(item);
    }

    public String getStatusMessage(){
        String status;
        if(this.ready){
            status = "Your order is ready.\n";
        }
        else {
            status = "Thank you for waiting. Your order will be ready soon.\n";
        }
        return status;
    }

    public double getOrderTotal(){
        double total = 0;
        for(Item item : items){
            total += item.getPrice();
        }
        return total;
    }

    public void display(){
        System.out.println("Customer name: " + this.name);
        for(Item item : items){
            System.out.println(item.getName() + " - $" + item.getPrice());
        }
        System.out.println("Total: $" + getOrderTotal());
    }
}
