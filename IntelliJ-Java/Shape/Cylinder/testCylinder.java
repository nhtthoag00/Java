/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexamples;

import java.util.Scanner;

/**
 *
 * @author Hoang Nhat
 */
public class testCylinder extends Cylinder{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Cylinder cylinder = new Cylinder();
        
        System.out.println("Volume: " + cylinder.getVolume(4, 5));
    }
}
