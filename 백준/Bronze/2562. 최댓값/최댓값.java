
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nums[] = new int[9];

		for (int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
		}

		int max = 0;

		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > nums[max]) {
				max = i;
			}
		}

		System.out.println(nums[max]);
		System.out.println(max + 1);

	}
}