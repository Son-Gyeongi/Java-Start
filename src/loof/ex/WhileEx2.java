package loof.ex;

// 짝수 출력
public class WhileEx2 {

    public static void main(String[] args) {
        int num = 0;
        int count = 0;

        while (count++ <= 10) {
            System.out.println(num);
            num += 2;
        }
    }
}
