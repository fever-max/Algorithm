import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int h, m, result;
		Scanner sc = new Scanner(System.in);
		h = sc.nextInt();
		m = sc.nextInt();
		result = ((h * 60) + m - 45 + (24 * 60)) % (24 * 60);
		if (result < 0) {
			result += 24 * 60;
		}

		System.out.printf("%d %d", result / 60, result % 60);

	}
}