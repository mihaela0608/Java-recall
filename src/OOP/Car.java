package OOP;

public class Car extends Vehicle{
    private int trunkSize;

    public Car(String model, int year, int trunkSize) {
        super(model, year);
        this.trunkSize = trunkSize;
    }

    public void details(){
        System.out.println(info() + " " + this.trunkSize);
    }
}
