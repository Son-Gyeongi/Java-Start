package scanner.ex;

import java.util.Scanner;

// 사이 숫자
public class ScannerEx5_My {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요:");
        int num1 = scanner.nextInt();

        System.out.print("두 번째 숫자를 입력하세요:");
        int num2 = scanner.nextInt();

        int min = Math.min(num1, num2);
        int max = Math.max(num1, num2);

        System.out.print("두 숫자 사이의 모든 정수:");
        for (int i = min; i <= max; i++) {
            if (i == min) {
                System.out.print(i);
            } else {
                System.out.print("," + i);
            }
        }
    }
}
