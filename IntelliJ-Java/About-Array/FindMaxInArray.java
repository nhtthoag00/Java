import java.util.Scanner;

public class FindMaxInArray {
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

        //Find max in array
        int max = num[0];
        int index = 0;
        for (int j = 0; j < num.length; j++) {
            if (max < num[j]) {
                max = num[j];
                index = j + 1;
            }
        }

        //Print Result
        System.out.println("The max number in the list is " + max + " and it's position is " + index);


    }
}
