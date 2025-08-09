package method.ex;

// 반복 출력 리펙토링
// 메서드를 사용하면 코드의 중복을 줄일 수 있다.
public class MethodEx2Ref {

    public static void main(String[] args) {
        String message = "Hello, world";
        printMessage(message, 3);
        printMessage(message, 5);
        printMessage(message, 7);

        printMessage("hello, world", 3);
        printMessage("java", 5);
        printMessage("hi", 7);
    }

    public static void printMessage(String message, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(message);
        }
    }
}
