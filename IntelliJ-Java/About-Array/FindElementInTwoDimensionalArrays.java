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
public class FindElementInTwoDimensionalArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Get rows and columns from user
        System.out.println("Type number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Type number of columns: ");
        int columns = sc.nextInt();
        
        //Create and type element into array
        float arr[][] = new float[rows][columns];
        
        System.out.println("Type element for array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println("Type element arr[" + i + "][" + j + "] = ");
                arr[i][j] = sc.nextFloat();
            }       
        }
        
        //Find Max in Matrix
        float max = arr[0][0];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if ( max < arr[i][j]) {
                    max = (float) arr[i][j];
                }
            }
        }
        System.out.println("Max in Matrix is: " + max);
    }
}
