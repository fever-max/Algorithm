import java.util.Scanner;

public class Main {

    // 최대공약수(GCD) 계산 함수 (유클리드 호제법)
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    // 최소공배수(LCM) 계산 함수
    public static int lcm(int a, int b) {
        return a * (b / gcd(a, b));
    }

    // 세 수의 최소공배수를 구하는 함수
    public static int lcm(int a, int b, int c) {
        return lcm(lcm(a, b), c);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 5개의 자연수를 입력받음
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        int minLCM = Integer.MAX_VALUE;

        // 5개 중 3개를 고르는 모든 조합에 대해 최소공배수를 계산
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                for (int k = j + 1; k < 5; k++) {
                    int currentLCM = lcm(numbers[i], numbers[j], numbers[k]);
                    if (currentLCM < minLCM) {
                        minLCM = currentLCM;
                    }
                }
            }
        }

        // 최소 LCM 출력
        System.out.println(minLCM);

        scanner.close();
    }
}