package loof;

public class Break1 {

    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        while (true) { // 무한반복
            sum += i;
            if (sum > 10) {
                System.out.println("합이 10보다 크면 종료: i=" + i + " sum=" + sum);
                break;
            }

            i++;
        }
    }
}
