package array.ex;

import java.util.Scanner;

// 가장 작은 수, 큰 수 찾기
public class ArrayEx6_My {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수를 입력하세요:");
        int length = scanner.nextInt();

        int[] numbers = new int[length];

        System.out.println(length + "개의 정수를 입력하세요:");
        numbers[0] = scanner.nextInt();
        int min = numbers[0];
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
            if (numbers[i] > max) {
                max = numbers[i];
            } else if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("가장 작은 정수: " + min);
        System.out.println("가장 큰 정수: " + max);
    }
}
