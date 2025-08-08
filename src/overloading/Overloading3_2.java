package overloading;

// 매개변수의 타입이 다른 오버로딩 예제2
public class Overloading3_2 {

    public static void main(String[] args) {
        System.out.println("1: " + add(1, 2)); // 자동 형변환
        System.out.println("2: " + add(1.2, 1.5));
    }

    public static double add(double a, double b) {
        System.out.println("2번 호출");
        return a + b;
    }
}
