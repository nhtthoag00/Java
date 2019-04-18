import java.util.Scanner;

public class CountCharInString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str;
		System.out.println("Type a String: ");
		str = sc.nextLine();
		System.out.println("Type char: ");
		char charCheck = sc.next().charAt(0);
		
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == charCheck) {
				count++;
			}
		}
		System.out.println("Number of char want to check: " + count);
	}
}
