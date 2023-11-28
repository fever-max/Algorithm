import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long num[] = new long[3];
		long result = 0;

		for (int i = 0; i < num.length; i++) {
			num[i] = scanner.nextLong();
			result += num[i];
		}

		System.out.println(result);
	}
}