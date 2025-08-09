package method.ex;

import java.util.Scanner;

// 은행 계좌 입출금
// 메서드 활용해보기
public class MethodEx4_My2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 0;

        while (true) {
            System.out.println("--------------------------------------");
            System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
            System.out.println("--------------------------------------");

            System.out.print("선택: ");
            int input = scanner.nextInt();

            if (input == 1) {
                // 입금
                System.out.print("입금액을 입력하세요: ");
                int money = scanner.nextInt();
                balance = deposit(balance, money);
            } else if (input == 2) {
                // 출금
                System.out.print("출금액을 입력하세요: ");
                int money = scanner.nextInt();
                balance = withdraw(balance, money);
            } else if (input == 3) {
                System.out.println("현재 잔액: " + balance + "원");
            } else if (input == 4) {
                System.out.println("시스템을 종료합니다.");
                break;
            } else {
                System.out.println("선택 번호를 잘못 누르셨습니다. 다시 입력해주세요.");
            }
        }
    }

    public static int deposit(int balance, int money) {
        if (money > 0) {
            balance += money;
            System.out.println(money + "원을 입금하였습니다. 현재 잔액: " + balance + "원");
        } else {
            System.out.println("금액을 잘못 입력하셨습니다.");
        }

        return balance;
    }

    public static int withdraw(int balance, int money) {
        if (balance >= money) {
            balance -= money;
            System.out.println(money + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
        } else {
            System.out.println(money + "원을 출금하려 했으나 잔액이 부족합니다.");
        }

        return balance;
    }
}
