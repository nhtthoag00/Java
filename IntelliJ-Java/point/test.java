/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package point;

import java.util.Scanner;

/**
 *
 * @author Hoang Nhat
 */
public class test extends Point2D {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       Point2D test1 = new Point2D(2,3);
       System.out.println(test1.getX() + "\t" + test1.getY());
       test1.setArr(0, 2);
       test1.setArr(1, 3);
       
       float[] arr = test1.getArr();
       for(float element : arr) {
           System.out.println(element);
       }
       
       
       
       
    }
}
