package method.ex;

// 평균값 리펙토링
public class MethodEx1Ref {

    public static void main(String[] args) {
        System.out.println("평균값: " + average(1, 2, 3));
        System.out.println("평균값: " + average(15, 25, 35));
    }

    // 출력하지 않고 계산만해서 결과를 반환
    public static double average(int a, int b, int c) {
        int sum = a + b + c;
        return sum / 3.0;
    }
}
