import java.util.Scanner;

public class subQuadraticEquation extends QuadraticEquation{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter a, b, c: ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
		System.out.println("Discriminant: " + quadraticEquation.getDiscriminant());
		System.out.println("Root 1: " + quadraticEquation.getRoot1());
		System.out.println("Root 2: " + quadraticEquation.getRoot2());
	}
}
