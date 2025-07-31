package loof.ex;

// 진짜 피라미드 출력
public class NestedEx3 {

    public static void main(String[] args) {
        int rows = 6;

        for (int i = 1; i <= rows; i++) {
            int empty = 0;
            if (rows % 2 != 0) {
                empty = i == 1 || i % 2 == 0 ? (rows - i) / 2 + 1 : (rows - i) / 2;
            } else {
                empty = i % 2 == 0 ? (rows - i) / 2 : (rows - i) / 2 + 1;
            }
            System.out.print(" ".repeat(empty));

            for (int j = 1; j <= i; j++) {
                if (j == 1) {
                    System.out.print("*");
                } else System.out.print(" *");
            }
            System.out.println();
        }
    }
}
