import java.util.Scanner;

public class InsertElement {
    public static void inputArray() {
        Scanner sc = new Scanner(System.in);

        //Create array
        int[] arrayA;
        int[] arrayB;
        int numberA, numberB;

        System.out.println("Type number of element of Array A: ");
        numberA = sc.nextInt();
        System.out.println("Type number of elemnet of Array B: ");
        numberB = sc.nextInt();

        arrayA = new int[numberA + numberB];
        arrayB = new int[numberB];

        //Type element into array
        for (int i = 0; i < numberA; i++) {
            System.out.println("Type element number " + (i + 1) + " of array A :");
            arrayA[i] = sc.nextInt();
        }
        System.out.println("\n");
        for (int i = 0; i < numberB; i++) {
            System.out.println("Type element number " + (i + 1) + " of array B: ");
            arrayB[i] = sc.nextInt();
        }
        System.out.println("\n");
        //Show element in Array A
        for (int j = 0; j < numberA; j++) {
            System.out.print(arrayA[j] + " ");
        }
        //Get index want to insert
        System.out.println("Type index want to insert: ");
        int index = sc.nextInt();

        //Call method insertIntoArray()
        insertIntoArray(arrayA,arrayB,numberA,index);
    }
    public static void insertIntoArray(int[] arrayA, int[] arrayB, int numberA, int index) {
        //Insert at the end of Array A
        if (index >= numberA) for (int i = 0; i < arrayB.length; i++) arrayA[i + numberA] = arrayB[i];
        //Insert at the begin of Array A
        else if (index <= 0) {
            for (int i = arrayA.length - 1; i >= arrayB.length; i--) arrayA[i] = arrayA[i - arrayB.length];
            for (int i = 0; i < arrayB.length; i++) arrayA[i] = arrayB[i];
        } else {
            for (int i = arrayA.length - 1; i >= (arrayB.length + index); i--) arrayA[i] = arrayA[i - arrayB.length];
            for (int i = index; i < (index + arrayB.length); i++) arrayA[i] = arrayB[i - index];
        }
        display(arrayA,arrayB);
    }
    public static void display(int[] arrayA, int[] arrayB) {
        System.out.println("Array A: ");
        for (int x : arrayA) System.out.print(x + " ");
        System.out.println("\n");
        System.out.println("Array B: ");
        for (int x : arrayB) System.out.print(x + " ");
    }
    public static void main(String[] args) {
        inputArray();
    }
}
