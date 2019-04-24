/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mylinkedlist;

/**
 *
 * @author Hoang Nhat
 */
public class testMyLinkedList extends MyLinkedList {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
         MyLinkedList ll = new MyLinkedList(10);
         ll.addFirst(11);
         ll.addFirst(12);
         ll.addFirst(13);
 
         ll.add(4,9);
         ll.add(4,9);
         ll.printList();
    }
}
