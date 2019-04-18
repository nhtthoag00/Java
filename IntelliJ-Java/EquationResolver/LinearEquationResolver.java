import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c;

        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = 0', please enter constants: ");


        System.out.println("Enter a: ");
        a = scanner.nextDouble();

        System.out.println("Enter b: ");
        b = scanner.nextDouble();

        System.out.println("Enter c: ");
        c = scanner.nextDouble();

        if (a != 0) {
             double answer = (c - b) / a;
            System.out.println("x = " + answer);
        } else {
            if (b == 0) {
                System.out.println("All of x !!");
            } else {
                System.out.println("No solution !!");
            }
        }
    }
}
