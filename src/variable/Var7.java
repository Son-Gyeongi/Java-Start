package variable;

public class Var7 {

    public static void main(String[] args) {
        int a = 100; // 정수
        double b = 10.5; // 실수
        boolean c = true; // 불리언(boolean) true, false 입력 가능
        char d = 'A'; // 문자 하나
        String e = "Hello Java"; // 문자열, 문자열을 다루기 위한 특별한 타입

        // 타입과 값 불일치, 컴파일 에러 발생
        // int z = "백원";
        // int z = "100";
        int z = 100;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}
