/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexamples;



/**
 *
 * @author Hoang Nhat
 */
public class Cylinder extends Circle1 {
    private double high;
    Circle1 circle1 = new Circle1();
            
    public Cylinder() {}
    
    public Cylinder (double radius, double high, String color) {
        super(radius, color);
        this.high = high;
    } 
    
    public double getHigh() {
        return high;
    }
    
    public void setHigh(double high) {
        this.high = high;
    }
    
    public double getVolume(double radius, double high) {
        return circle1.getArea(radius) * high;
    }
}
