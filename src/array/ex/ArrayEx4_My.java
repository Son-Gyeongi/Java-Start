package array.ex;

import java.util.Scanner;

// 합계와 평균
// 배열을 사용해서 풀어보자
public class ArrayEx4_My {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        int sum = 0;
        double average;

        System.out.println("5개의 정수를 입력하세요:");
        for (int i = 0; i < arr.length; i++) {
            int number = input.nextInt();
            arr[i] = number;
            sum += number;
        }
        average = (double) sum / arr.length;

        System.out.println("입력한 정수의 합계: " + sum);
        System.out.println("입력한 정수의 평균: " + average);
    }
}
