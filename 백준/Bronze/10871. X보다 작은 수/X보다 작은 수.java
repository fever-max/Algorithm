import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		int n = sc.nextInt();
		int x = sc.nextInt();
		int nums[] = new int[n];
		int count = 0;

		for (int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
		}

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] < x) {
				System.out.print(nums[i] + " ");
			}
		}

	}
}