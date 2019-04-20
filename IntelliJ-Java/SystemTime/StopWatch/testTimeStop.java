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
public class testTimeStop extends StopWatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StopWatch time = new StopWatch();
        int choice = - 1;
        do {
            System.out.println("Type a number: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Time start: " + time.getTimeStart());
                    break;
                case 2:
                    System.out.println("Time end: " + time.getTimeEnd());
                    break;
                case 3:
                    System.out.println("Time elapse: " + time.getElapseTime());
                    System.exit(0);
                    break;
            }
        } while (choice != 0);
    }
}
