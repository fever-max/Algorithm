import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int year;

		do {
			year = scanner.nextInt();
		} while (year <= 1000 || year >= 3000);

		System.out.println(year - 543);

	}

}