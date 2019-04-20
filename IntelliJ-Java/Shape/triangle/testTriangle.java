/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangle;

import java.util.Scanner;

/**
 *
 * @author Hoang Nhat
 */
public class testTriangle extends Triangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String color = "blue";
        boolean filled = true;
        Triangle triangle;
        triangle = new Triangle(2.0, 3.0, 4.0, color, filled);
        System.out.println(triangle.getSide1() + "\t" + triangle.getSide2() + "\t" + triangle.getSide3());
        System.out.println("Perimeter: " + triangle.getPerimeter(2.0, 3.0, 4.0));
        System.out.println("Area: " + triangle.getArea(2.0, 3.0, 4.0));
    }   
}
