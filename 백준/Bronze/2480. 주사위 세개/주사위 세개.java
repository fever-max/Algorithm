import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input[] = new int[3];
		int money = 0;

		for (int i = 0; i < input.length; i++) {
			input[i] = sc.nextInt();

		}
		Arrays.sort(input); // 오름차순 정렬

		if (input[0] == input[1] && input[1] == input[2]) {
			money = 10000 + input[0] * 1000; // 3개의 같은 눈

		} else if (input[0] == input[1] || input[0] == input[2]) {
			money = 1000 + input[0] * 100; // 2개의 같은 눈
		} else if (input[1] == input[2]) {
			money = 1000 + input[1] * 100; // 2개의 같은 눈
		} else {
			money = input[2] * 100; // 가장 큰 주사위의 값
		}

		System.out.println(money);

	}
}