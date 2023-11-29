import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int A, B;
		Scanner sc = new Scanner(System.in);
		A = sc.nextInt();
		B = sc.nextInt();

		if (A > B) {
			System.out.println(">");
		} else if (A < B) {
			System.out.println("<");
		} else { 
			System.out.println("==");
		}

	}
}