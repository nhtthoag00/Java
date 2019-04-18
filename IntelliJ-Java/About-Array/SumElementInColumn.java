import java.util.Scanner;

public class SumElementInColumn {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Type rows of array: ");
		int rows = sc.nextInt();
		System.out.println("Type columns of array: ");
		int columns = sc.nextInt();
				
		int[][] arr = new int[rows][columns];
		System.out.print("Type element into array: \t");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Type number of column: ");
		int num = sc.nextInt();
		int sum = 0;
		
		for (int i = 0; i < rows; i++) {
			sum += arr[i][num];
		}
		
		System.out.println("Sum: " + sum);
	}
}
