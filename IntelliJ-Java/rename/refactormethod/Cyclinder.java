/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rename.refactormethod;

/**
 *
 * @author Hoang Nhat
 */
public class Cyclinder {
    public static double getVolume(int radius, int height){
        double baseArea = getBaseArea(radius);
        double perimeter = getPerimeter(radius);
        double volume = perimeter * height + 2 * baseArea;
        return volume;
    }
    
    public static double getBaseArea(int radius) {
        return Math.PI * radius * radius;
    }
    
    public static double getPerimeter(int radius) {
        return 2 * Math.PI  * radius;
    }
}
