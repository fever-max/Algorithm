import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nums[] = new int[10];
		int ck[] = new int[10];
		Set<Integer> remainderSet = new HashSet<>();

		for (int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
			ck[i] = nums[i] % 42;
			remainderSet.add(ck[i]);
		}

		System.out.println(remainderSet.size());
	}
}
