import java.util.Scanner;

public class ReserveArrayElement {
    public static void main(String[] args) {
//        int[] arr = new int[3];
//        arr[0] = 1;
//        arr[1] = 2;
//        arr[2] = 3;
//        for (int j = 0; j < (arr.length / 2); j++) {
//            int temp = arr[j];
//            arr[j] = arr[3 - 1 - j];
//            arr[3 - 1 - j] = temp;
//        }
//
//        for (int i : arr) {
//            System.out.println(i);
//        }


        Scanner input = new Scanner(System.in);


        //Check size of the array
        int size;
        do {
            System.out.println("Enter the size: ");
            size = input.nextInt();
            if (size > 20) {
                System.out.println("Don't type a size too large");
            }
        } while (size > 20);

        //Create and Type number into array
        int[] num;
        num = new int[size];
        for (int i = 0; i < num.length; i++) {
            System.out.println("Enter element " + (i + 1) + " :");
            num[i] = input.nextInt();
        }

        //Show array element
        System.out.println("Array emlent: ");
        for (int j = 0; j < num.length; j++) {
            System.out.print(num[j] + "\t");
        }
        System.out.println("\n");

        //Reserve Array's element

        for (int j = 0; j < (num.length / 2); j++) {
            int temp = num[j];
            num[j] = num[size - 1 - j];
            num[size - 1 - j] = temp;
        }

        //Print result

        /*System.out.println("Array after reserve: ");
        for (int i : num) {
            System.out.print(i + "\t");
        }*/

        System.out.println("Array after reserve: ");
        for (int j = 0; j < num.length; j++) {
            System.out.print(num[j] + "\t");
        }


    }
}
