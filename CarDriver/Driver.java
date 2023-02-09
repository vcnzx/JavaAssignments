
public class Driver extends Car {
    
    public void drive(){
        this.setGas(getGas()-1);
        System.out.println("Driving..");
        displayGasStatus();
    }

    public void boost(){
        this.setGas(getGas()-3);
        System.out.println("Boosted!");
        displayGasStatus();
    }

    public void refuel(){
        this.setGas(getGas()+2);
        System.out.println("refueling..");
        displayGasStatus();
    }
}
