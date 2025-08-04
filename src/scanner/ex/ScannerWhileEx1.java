package scanner.ex;

import java.util.Scanner;

// 이름과 나이 반복
public class ScannerWhileEx1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("이름을 입력하세요 (종료를 입력하면 종료): ");
            String name = input.nextLine(); // \n 로 인해 "" 빈문자열이 들어간다.

            if (name.equals("종료")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.print("나이를 입력하세요: ");
            int age = input.nextInt(); // 10\n 인데 숫자만 가져가서 \n만 남는다.
            input.nextLine(); // \n 라인을 읽어주고 버린다.

            System.out.println("입력한 이름: " + name + ", 나이: " + age);
        }
    }
}
