import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double weight;
        double height;

        System.out.println("Enter your weight: ");
        weight = input.nextDouble();

        System.out.println("Enter your height: ");
        height = input. nextDouble();

        double BMI = weight/Math.pow(height, 2);

        if (BMI < 18)
            System.out.printf("%10.2f\t%s", BMI, "Underweight");
        else if (BMI < 25.0)
            System.out.printf("%10.2f\t%s", BMI, "Normal");
        else if (BMI < 30.0)
            System.out.printf("%10.2f\t%s", BMI, "Overweight");
        else
            System.out.printf("%10.2f\t%s", BMI, "Obese");
    }
}
