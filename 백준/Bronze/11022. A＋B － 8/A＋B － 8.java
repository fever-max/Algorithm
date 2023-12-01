import java.util.Scanner;

class Num {
	int num[] = new int[2];
}

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		Num num[] = new Num[count];

		for (int i = 0; i < count; i++) {
			num[i] = new Num();
			num[i].num[0] = sc.nextInt();
			num[i].num[1] = sc.nextInt();
		}

		for (int i = 0; i < count; i++) {
			System.out.printf("Case #%d: %d + %d = %d\n", i + 1, num[i].num[0], num[i].num[1],
					num[i].num[0] + num[i].num[1]);
		}

	}
}
