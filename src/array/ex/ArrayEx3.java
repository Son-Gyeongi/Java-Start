package array.ex;

import java.util.Scanner;

// 배열과 역순 출력
public class ArrayEx3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("5개의 정수를 입력하세요:");
        for (int i = 0; i < arr.length; i++) {
            int number = input.nextInt();
            arr[i] = number;
        }

        System.out.println("출력");
        // 배열 인덱스 0,1,2,3,4
        for (int i = 4; i >= 0; i--) {
            System.out.print(arr[i]);
            if (i > 0) System.out.print(", ");
        }
    }
}
