/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparable;

/**
 *
 * @author Hoang Nhat
 */
public class Circle extends Shape {
   private double radius = 1.0;
   
   public Circle() {
   }
   
   public Circle(double radius) {
       this.radius = radius;
   }
   public Circle(double radius, String color, boolean filled) {
       this.radius = radius;
       setColor(color);
       makeFilled(filled);
   }
   
   public double getRadius() {
       return radius;
   }
   
   public double getArea(double radius) {
       return radius * radius * Math.PI;
   }
   
   public double getPerimeter(double radius) {
       return radius * 2 * Math.PI;
   }
   
   @Override
   public String toString() {
       return "A Cirlce with radius = " + getRadius() + ", which is a subclass of " + super.toString();
   }
}
   
