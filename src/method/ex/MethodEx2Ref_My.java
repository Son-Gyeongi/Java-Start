package method.ex;

// 반복 출력 리펙토링
public class MethodEx2Ref_My {

    public static void main(String[] args) {
        String message = "Hello, world";
        printMessage(3, message);
        printMessage(5, message);
        printMessage(7, message);
    }

    public static void printMessage(int n, String msg) {
        for (int i = 0; i < n; i++) {
            System.out.println(msg);
        }
    }
}
