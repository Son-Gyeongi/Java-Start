package loof.ex;

/*
구구단 출력
중첩 for 문을 사용해서 구구단 완성
 */
public class NestedEx1 {

    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
        }
    }
}
