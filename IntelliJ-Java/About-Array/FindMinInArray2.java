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
public class FindMinInArray2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Check size of array
        int size;
        do {
            System.out.println("Enter a size: ");
            size = input.nextInt();
            if (size > 20) {
                System.out.println("Don't enter a too large size!!");
            }
        } while (size > 20);

        //Type number into array
        int[] num;
        num = new int[size];
        int i = 0;
        while ( i < num.length) {
            System.out.println("Enter number " + (i + 1) + " :");
            num[i] = input.nextInt();
            i++;
        }

        //Print array elements
        System.out.println("Array element: ");
        for (int a = 0; a < num.length; a++) {
            System.out.print(num[a] + "\t");
        }
        System.out.println("\n");

        //Find min in array
        int min = num[0];
        int index = 0;
        for (int j = 0; j < num.length; j++) {
            if (min > num[j]) {
                min = num[j];
                index = j + 1;
            }
        }

        //Print Result
        System.out.println("The max number in the list is " + min + " and it's position is " + index);
    }
}
