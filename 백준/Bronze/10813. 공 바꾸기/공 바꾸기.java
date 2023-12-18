import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int nums[] = new int[n];

		for (int i = 0; i < nums.length; i++) {
			nums[i] = i + 1;
		}

		int ck = 0;

		while (ck < m) {
			int i = scanner.nextInt();
			int j = scanner.nextInt();
			int temp;

			temp = nums[i - 1];
			nums[i - 1] = nums[j - 1];
			nums[j - 1] = temp;

			ck++;
		}

		for (int l = 0; l < nums.length; l++) {
			System.out.print(nums[l] + " ");
		}

	}
}
