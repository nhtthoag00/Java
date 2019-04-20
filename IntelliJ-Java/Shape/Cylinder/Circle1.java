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
public class Circle1 {
    private double radius;
    private String color;
    private double area;
    public Circle1 () {}
    
    public Circle1(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    
    public double getArea(double radius) {
        return this.area = Math.pow(radius, 2) * Math.PI;
    }
    
    
    @Override
    public String toString() {
        return "This is a cirlce with radius = " + this.radius + " and color is " + this.color;
    }

}
