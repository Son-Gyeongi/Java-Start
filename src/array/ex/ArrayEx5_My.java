package array.ex;

import java.util.Scanner;

// 합계와 평균2
public class ArrayEx5_My {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요:");
        int length = scanner.nextInt();

        int[] numbers = new int[length];
        int sum = 0;
        double average;

        System.out.println(length + "개의 정수를 입력하세요:");
        for (int i = 0; i < numbers.length; i++) {
            int number = scanner.nextInt();
            numbers[i] = number;
            sum += number;
        }
        average = (double) sum / numbers.length;

        System.out.println("입력한 정수의 합계: " + sum);
        System.out.println("입력한 정수의 평균: " + average);
    }
}
