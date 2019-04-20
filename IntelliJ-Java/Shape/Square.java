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
public class Square extends Rectangle{
    public Square() {
    }
    
    public Square(double side) {
        super(side, side);
    }
    
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }
    
    public double getSide() {
        return getWidth();
    }
    
    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }
    
    @Override
    public void setWidth(double width) {
        setSide(width);
    }
    
    @Override
    public void setLength(double length) {
        setSide(length);
    }
    
    @Override
    public String toString() {
        return "A Square with side = " + getSide() + ", which is a subclass of " + super.toString();
    }
}
