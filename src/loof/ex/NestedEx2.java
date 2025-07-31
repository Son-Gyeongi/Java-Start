package loof.ex;

// 피라미드 출력
public class NestedEx2 {

    public static void main(String[] args) {
        int rows = 3;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
