import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int y, result;
		Scanner sc = new Scanner(System.in);
		int time[] = new int[2];

		for (int i = 0; i < time.length; i++) {
			time[i] = sc.nextInt(); // 현재 시각
		}

		y = sc.nextInt(); // 요리 필요 시간

		result = ((time[0] * 60) + (time[1] + y + (24 * 60)) % (24 * 60));

		if (result < 0) {
			result += 24 * 60;
		}

		int h = result / 60;
		int m = result % 60;

		if (h >= 24) {
			h -= 24;
		} else if (h < 0) {
			h += 24;
		}

		System.out.printf("%d %d", h, m);
	}
}