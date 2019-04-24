/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparable;

import java.util.Arrays;

/**
 *
 * @author Hoang Nhat
 */
public class test {
    public static void main(String[] args) {
        Shape[] arr = new Shape[2];
        arr[0] = new Circle();
        arr[1] = new Square();
        
        for (Shape element : arr) {
            System.out.println(element);
            if (element instanceof Circle) {
                Circle circle = (Circle) element;
                System.out.println(circle.getArea(2));
            } else if (element instanceof Square) {
                Square square = (Square) element;
                System.out.println(square.getArea(4, 5));
                System.out.println(square.howToColor());
            }
        }
    }
}
