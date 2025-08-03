package scanner;

import java.util.Scanner;

public class ScannerWhile1_My {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("문자열을 입력해주세요(exit: 종료):");
            String str = scanner.nextLine();

            if (str.equalsIgnoreCase("exit")) {
                System.out.println("프로그램을 종료합니다.");
                System.exit(0);
            }

            System.out.println("입력한 문자열: " + str);
        }
    }
}
