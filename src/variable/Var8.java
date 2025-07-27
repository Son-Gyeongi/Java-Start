package variable;

public class Var8 {

    public static void main(String[] args) {
        // 정수
        byte b = 127; // -128 ~ 127 저장 가능
        short s = 32767; // -32,768 ~ 32,767
        int i = 2147483647; // -2,147,483,648 ~ 2,147,483,647 (약 20억)

        // long z = 2147483648L; int 크기 넘어가는 경우 long 사용

        // -9,223,372,036,854,775,808L ~ -9,223,372,036,854,775,807L, 제일 긴 정수 저장 가능
        long l = 9223372036854775807L; // 높을수록 메모리 공간 많이 차지

        // 실수
        float f = 10.0f;
        double d = 10.0; // float 보다 더 큰 범위의 실수를 사용할 수 있다.
    }
}
