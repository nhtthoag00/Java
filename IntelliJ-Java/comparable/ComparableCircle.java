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
public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
    
    public ComparableCircle() {}
    
    public ComparableCircle(double radius) {
        super(radius);
    }
    
    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }
    
    @Override
    public int compareTo(ComparableCircle o) {
        if (getRadius() > o.getRadius()) return 1;
        else if (getRadius() < o.getRadius()) return -1;
        else return 0;
    }
    
}
