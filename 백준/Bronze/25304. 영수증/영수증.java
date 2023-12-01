import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int hap = scanner.nextInt();
		int count = scanner.nextInt();
		int superSum = 0;

		for (int i = 0; i < count; i++) {
			superSum += scanner.nextInt() * scanner.nextInt();
		}

		System.out.print((superSum == hap) ? "Yes" : "No");
	}
}