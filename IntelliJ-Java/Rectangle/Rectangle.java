import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        float length;
        float width;
        float area;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter length: ");
        length = scanner.nextFloat();

        System.out.println("Enter width: ");
        width = scanner.nextFloat();

        area = length * width;
        System.out.println("Area: " + area);

    }
}
