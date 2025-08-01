package scope;

// Scope 범위는 필요한 범위로 한정해서 사용하는 것이 좋다.
public class Scope3_2 {

    public static void main(String[] args) {
        int m = 10; // m 생존 시작
        if (m > 0) {
            int temp = m * 2;
            System.out.println("temp = " + temp);
        }
        // System.out.println(temp);
        System.out.println("m = " + m);
    } // m 생존 종료
}
