

public class Mammal {
    private int energyLevel = 100;

    public int getEnergyLevel() {
        return this.energyLevel;
    }

    public void setEnergyLevel(int energyLevel) {
        this.energyLevel = energyLevel;
    }

    public int displayEnergy(){
        System.out.println("Energy level: " + this.energyLevel);
        return this.energyLevel;
    }
}
