
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();

		StringBuilder result = new StringBuilder();
		for (int i = 0; i < a.length(); i++) {
			char currentChar = a.charAt(i);
			// 대문자이면 소문자로, 소문자이면 대문자로 변환
			if (Character.isUpperCase(currentChar)) {
				result.append(Character.toLowerCase(currentChar));
			} else {
				result.append(Character.toUpperCase(currentChar));
			}
		}

		System.out.println(result);
	}

}
