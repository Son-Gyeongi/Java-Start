package method.ex;

// 평균값 리펙토링
public class MethodEx1Ref_My {

    public static void main(String[] args) {
        add(1, 2, 3);
        add(15, 25, 35);
    }

    public static void add(int a, int b, int c) {
        int sum = a + b + c;
        double average = sum / 3.0;
        System.out.println("평균값: " + average);
    }
}
