package loof;

public class For2 {

    public static void main(String[] args) {
        int sum = 0;
        int endNum = 3;

        // 1+2+3=6
        for (int i = 1; i <= endNum; i++) {
            sum += i;
            System.out.println("i=" + i + " sum=" + sum);
        }
    }
}
