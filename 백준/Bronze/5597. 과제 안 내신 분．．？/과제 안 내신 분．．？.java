import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int students[] = new int[30];
		// 28개의 번호 입력
		for (int i = 0; i < 28; i++) {
			int num = sc.nextInt();
			students[num - 1] = 1; // 번호 위치에 맞춰서 체크
		}

		for (int i = 0; i < students.length; i++) {
			// 1이 아니면 값 출력
			if (students[i] != 1) {
				System.out.println(i+1);
			}
		}
	}
}