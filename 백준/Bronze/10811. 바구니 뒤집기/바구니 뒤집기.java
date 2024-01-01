import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //배열 범위
        int m = sc.nextInt(); //입력 횟수
        int arr [] = new int[n]; //입력값만큼 생성

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1; //배열에 1부터 숫자 입력
        }

        for (int k = 0; k < m; k++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            reverse(arr, i-1, j-1);
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }

    }

    public static void reverse (int[] arr, int start, int end){

        while (start < end){
            //시작이 마지막보다 작으면
            int temp = arr[start];
            arr [start] = arr [end];
            arr[end] = temp;

            //다음 인덱스 지정
            start ++;
            end--;
        }
    }
}