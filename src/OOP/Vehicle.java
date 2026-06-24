package OOP;

public class Vehicle {
    protected String model;
    protected int year;

    protected Vehicle(String model, int year) {
        this.model = model;
        this.year = year;
    }

    protected String info(){
        return this.model + ": " + this.year;
    }
}
