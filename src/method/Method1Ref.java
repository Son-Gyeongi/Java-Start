package method;

// 메서드 - 중복이 제거되고, 코드가 상당히 깔끔해졌다.
public class Method1Ref {

    public static void main(String[] args) {
        // 계산1
        int sum1 = add(5, 10);
        System.out.println("결과1 출력: " + sum1);

        // 계산2
        int sum2 = add(15, 20);
        System.out.println("결과2 출력: " + sum2);
    }

    // add 메서드
    public static int add(int a, int b) {
        System.out.println(a + "+" + b + " 연산 수행");
        int sum = a + b;
        return sum;
    }
}
