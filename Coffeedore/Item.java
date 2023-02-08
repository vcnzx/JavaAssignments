
public class Item {
    private String name;
    private double price;
    private int index;

    //Constructor Item that takes in name and price
    public Item(String name, double price){
        this.name = name;
        this.price = price;
    }

    //Getters
    public String getName(){
        return this.name;
    }

    public double getPrice(){
        return this.price;
    }

    public int getIndex(){
        return this.index;
    }

    //Setters
    public void setName(String name){
        this.name = name;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void setIndex(int index){
        this.index = index;
    }
}

