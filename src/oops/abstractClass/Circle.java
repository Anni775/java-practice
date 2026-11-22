package oops.abstractClass;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area(){
        return Math.PI * Math.pow(radius,2);
    }

    static void main(String[] args) {
        Circle c1 = new Circle(5);
        System.out.println(c1.area());
    }
}
