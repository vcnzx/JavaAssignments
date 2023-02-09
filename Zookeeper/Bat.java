

public class Bat extends Mammal {
    
    public Bat(){
        this.setEnergyLevel(300);
    }

    public void fly(){
        System.out.println("flap flap flap woosh...");
        this.setEnergyLevel(getEnergyLevel() - 50);
    }

    public void eatHumans(){
        System.out.println("hongri munch munch..");
        this.setEnergyLevel(getEnergyLevel() + 25);
    }

    public void attackTown(){
        System.out.println("weewooweewooweewoooo");
        this.setEnergyLevel(getEnergyLevel() - 100);
    }
}
