import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int out[] = new int[count];

		for (int i = 0; i < count; i++) {
			out[i] = sc.nextInt() + sc.nextInt();
		}

		for (int i = 0; i < out.length; i++) {
			System.out.printf("Case #%d: %d\n", i + 1, out[i]);
		}

	}
}