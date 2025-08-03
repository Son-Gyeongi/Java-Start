package scanner;

import java.util.Scanner;

public class ScannerWhile3_My {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("0을 입력하면 프로그램은 종료됩니다.");
        while (true) {
            System.out.print("1개의 숫자를 입력하세요:");
            int num = scanner.nextInt();

            if (num == 0) {
                System.out.println("모든 숫자의 합: " + sum);
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            sum += num;
        }
    }
}
