import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int num[] = new int[2];

		for (int i = 0; i < n; i++) {
			num[0] = scanner.nextInt();
			num[1] = scanner.nextInt();
			System.out.println(num[0] + num[1]);
		}

	}
}