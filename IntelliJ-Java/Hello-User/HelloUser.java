import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type your name: ");
        String userName = scanner.nextLine();
        System.out.print("Hello " + userName);

    }
}
