import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int nums[] = new int[n];

		int ck = 0;

		while (ck < m) {
			int i = scanner.nextInt();
			int j = scanner.nextInt();
			int k = scanner.nextInt();
			for (i = i - 1; i < j; i++) {
				nums[i] = k;
			}
			ck++;
		}

		for (int l = 0; l < nums.length; l++) {
			System.out.print(nums[l] + " ");
		}

	}
}