

public class Gorilla extends Mammal {
    
    public void throwSomething(){
        System.out.println("Gorilla throw...");
        this.setEnergyLevel(getEnergyLevel() - 5);
    }

    public void eatBananas(){
        System.out.println("Eating delishus bananers..");
        this.setEnergyLevel(getEnergyLevel() + 10);
    }

    public void climb(){
        System.out.println("Tree climbin'...");
        this.setEnergyLevel(getEnergyLevel() - 10);
    }
}
