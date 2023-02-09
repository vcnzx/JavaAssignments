
public class Car {
    private int gas = 10;

    public int getGas() {
        return this.gas;
    }

    public void setGas(int gas) {
        this.gas = gas;
    }

    public void displayGasStatus(){
        System.out.println("Gas is at " + this.gas);
    }
}
