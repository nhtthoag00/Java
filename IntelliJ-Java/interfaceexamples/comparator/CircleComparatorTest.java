/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceexamples.comparator;

import java.util.Arrays;

/**
 *
 * @author Hoang Nhat
 */
public class CircleComparatorTest extends CircleComparator{
    public static void main(String[] args) {
        Circle[] circleTest = new Circle[3];
        circleTest[0] = new Circle(3.6);
        circleTest[1] = new Circle();
        circleTest[2] = new Circle(3.5, "Indigo", false);
        
        System.out.println("Pre-sort: ");
        for (Circle element : circleTest) {
            System.out.println(element);
        }
        CircleComparator circleComparator = new CircleComparator();
        Arrays.sort(circleTest, circleComparator);
        
        System.out.println("After-sort: ");
        for (Circle element : circleTest) {
            System.out.println(element);
        }
        
        
    }
}
