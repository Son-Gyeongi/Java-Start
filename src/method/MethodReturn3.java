package method;

/*
반환 타입
- 반환값 무시
 */
public class MethodReturn3 {

    public static void main(String[] args) {
        // 계산1
        int sum1 = add(5, 10);
        System.out.println("결과1 출력: " + sum1);

        // 계산2
        int sum2 = add(15, 20);
        System.out.println("결과2 출력: " + sum2);

        add(100, 200); // 호출만 함, 반환값 무시
    }

    // add 메서드
    public static int add(int a, int b) {
        System.out.println(a + "+" + b + " 연산 수행");
        int sum = a + b;
        return sum;
    }
}
