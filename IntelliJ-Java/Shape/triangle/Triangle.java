/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangle;

/**
 *
 * @author Hoang Nhat
 */
public class Triangle extends Shape{
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;
    private double perimeter;
    private double area;
    
    public Triangle() {}
    
    public Triangle(double side1, double side2, double side3, String color, boolean filled) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
    
    public double getPerimeter(double side1, double side2, double side3) {
        return this.perimeter = (side1 + side2 + side3)/2;
    }
    
    public double getArea(double side1, double side2, double side3) {
        return this.area = Math.sqrt(this.perimeter*(this.perimeter-side1)*(this.perimeter-side2)*(this.perimeter-side3));
    }
    
    @Override
    public String toString() {
        return "This is a triangle with side1" + this.getSide1() + ", side2 = " + this.getSide2() + ", side3 = " + this.getSide3() + ", perimeter = " + this.perimeter + ", are = " + this.area;
    }
}
