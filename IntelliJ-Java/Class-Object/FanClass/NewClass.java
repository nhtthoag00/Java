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
public class NewClass extends Fan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String color;
        double radius;
        int speed;
		Fan fan = new Fan();
		boolean on = true;
		System.out.println("Fan is " + fan.getStatus());
		System.out.println("Do you want to turn on the fan now ??");
		System.out.println("1.Yes");
		System.out.println("2.No");
		int input = sc.nextInt();
		if (input == 1 ) {
			fan.setStatus(on);
			System.out.println("Fan is " + fan.getStatus());
		} else if (input == 2 ){
			System.out.println("See you again!!");
		}
		
		
		if (fan.getStatus()) {
			System.out.print("Select speed: ");
			speed = sc.nextInt();
			fan.setSpeed(speed);
			
			System.out.print("Enter a color: ");
                        color = sc.next();
			fan.setColor(color);
			
			System.out.print("Change radius: ");
                        radius = sc.nextDouble();
			fan.setRadius(radius);
                        
                        System.out.println("Information of fan: ");
                        System.out.println("Color: " + fan.getColor());
                        System.out.println("Radius: " + fan.getRadius());
                        System.out.println("Speed: " + fan.getSpeed());
		} else {
			System.out.println("Fan is " + fan.getStatus());
		}
                
    }
    
}
