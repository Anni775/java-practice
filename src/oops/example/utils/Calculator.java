package oops.example.utils;

import oops.example.geometry.Circle;
import oops.example.geometry.Rectangle;

public class Calculator {
   public static void main(String[] args) {
       Circle c1 = new Circle(5);
       Rectangle r1 = new Rectangle(5,6);
       double cirArea = Math.PI * Math.pow(c1.radius, 2);
       double rectArea = r1.length * r1.breadth;
       System.out.println("Area of circle= "+cirArea);
       System.out.println("Area of rectangle= "+rectArea);
    }
}
