import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt(); // 472
		String num2 = scanner.next(); // 385

		for (int i = num2.length() - 1; i >= 0; i--) {
			int digit = (int) num2.charAt(i) - '0';
			System.out.println(num1 * digit);
		}

		int change = Integer.parseInt(num2);

		System.out.println(num1 * change);

	}

}
