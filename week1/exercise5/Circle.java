package week1.exercise5;

import java.util.Scanner;

/**
 * @author Gyt
 * @create 2021-01-22-23:54
 */
public class Circle {
    private double radius;
    private double area;
    private double perimeter;

    public Circle(double radius) {
        this.radius = radius;
        this.area = Math.PI*radius*radius;
        this.perimeter = Math.PI*2*radius;
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Circle circle = new Circle(in.nextDouble());

        System.out.printf("the area is %.2f\n",circle.getArea());
        System.out.printf("the perimeter is %.2f",circle.getPerimeter());


    }
}
