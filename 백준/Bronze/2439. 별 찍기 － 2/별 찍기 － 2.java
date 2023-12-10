import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		for (int i = 1; i <= n; i++) {
			// 공백 출력
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}

			// 별 출력
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			// 개행
			System.out.println();
		}

	}

}