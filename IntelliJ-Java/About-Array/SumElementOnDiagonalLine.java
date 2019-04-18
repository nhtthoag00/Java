import java.util.Scanner;

public class SumElementOnDiagonalLine {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Type width of Square: ");
		int width = sc.nextInt();
		
		int[][] arr = new int[width][width];
		System.out.print("Type element into array: \t");
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < width; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int sum = 0;
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < width; j++) {
				if (i == j) {
					sum = sum + arr[i][j];
				}
			}
		}
		
		System.out.println("Sum: " + sum);
	}
}
