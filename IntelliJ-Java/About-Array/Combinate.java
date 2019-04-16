import java.util.Scanner;

public class Combinate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Create and type element into array 1 and 2
		int[] array1, array2, array3;
		int a,b;
		
		System.out.println("Enter size of array 1: ");
		a = sc.nextInt();
		array1 = new int[a];
		for (int i = 0; i < array1.length; i++) {
			System.out.println("Type element number " + (i + 1) + " of array 1:");
			array1[i] = sc.nextInt();
		}
		
		System.out.println("Enter size of array 2: ");
		b = sc.nextInt();
		array2 = new int[b];
		for (int i = 0; i < array2.length; i++) {
			System.out.println("Type element number " + (i + 1) + " of array 2:");
			array2[i] = sc.nextInt();
		}
		
		//Create array 3
		array3 = new int[a + b];
		for (int j = 0; j < array3.length; j++) {
			if (j < a) {
				array3[j] = array1[j];
			} else if (j >= a) {
				int count = 0;
				while (count < array2.length) {
					array3[j] = array2[count];
					count++;
					j++;
				}
			}
		}
		//Show elements in array 3
		System.out.println("Elements in array 3: ");
		for (int j = 0; j < array3.length; j++) {
			System.out.print(array3[j] + " ");
		}
	}
}
