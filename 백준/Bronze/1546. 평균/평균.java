import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr [] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        //정렬
        Arrays.sort(arr);

        //평균
        double avg = 0;
        //최대값
        int max = arr[arr.length-1];

        for (int i = 0; i < arr.length; i++) {
            // 과목/최대값*100
            // 과목 갯수 n
            avg += ((arr[i]/(double)max)*100)/n; //max 값 변환
        }

        System.out.println(avg);
    }


}