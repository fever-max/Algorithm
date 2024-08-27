import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();


        for (int t = 0; t < T; t++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int count = 0;

            // 0 < a < b < n을 만족하는 정수 쌍 (a, b) 찾기
            for (int a = 1; a < n; a++) {
                for (int b = a + 1; b < n; b++) {
                    // 조건 (a^2 + b^2 + m) / (a * b)가 정수인지 확인
                    int numerator = a * a + b * b + m;
                    int denominator = a * b;

                    if (numerator % denominator == 0) {
                        count++;
                    }
                }
            }

            // 결과 출력
            System.out.println(count);
        }

        scanner.close();
    }
}
