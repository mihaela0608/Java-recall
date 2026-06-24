package OOP;

public class Rectangle extends Shape{
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double area() {
        return this.a * this.b;
    }

    @Override
    public double perimeter() {
        return (this.a + this.b) * 2;
    }
}
