package scope;

public class Scope3_1 {

    public static void main(String[] args) {
        int m = 10; // m 생존 시작
        int temp = 0;
        if (m > 0) {
            temp = m * 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
    } // m 생존 종료
}
