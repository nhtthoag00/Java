import java.util.Scanner;

public class CreateAndCheckArray {
	static Scanner sc = new Scanner(System.in);
	static int size;
	static int[] arr;
	public static void CreateAndCheck() {
		//Check size of array
		do {
			System.out.println("Enter the size: ");
			size = sc.nextInt();
			if (size > 20) {
				System.out.println("Size should not exceed 30");
			}
		} while (size > 20);
		
		//Create and type element into array
		arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Type element number " + (i + 1) + " :");
			arr[i] = sc.nextInt();
		}
	}
}