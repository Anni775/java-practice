package oops.abstractClass;

public class Test {
    static void main(String[] args) {
//        Shape s1 = new Shape();
        Shape c1 = new Circle(5);
        Shape s1 = new Square(4);
        System.out.println("Area of circle: "+ c1.area()+"\nArea of square: "+ s1.area());
    }
}
