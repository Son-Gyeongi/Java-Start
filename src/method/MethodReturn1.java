package method;

/*
반환 타입
- 반환 타입이 있으면 반드시 값을 반환해야 한다.
 */
public class MethodReturn1 {

    public static void main(String[] args) {
        boolean result = odd(2);
        System.out.println(result);
    }

    // 홀수, 짝수 확인
    public static boolean odd(int i) {
        if (i % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }
}
