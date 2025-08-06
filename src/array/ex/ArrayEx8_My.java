package array.ex;

import java.util.Scanner;

// 2차원 배열2
public class ArrayEx8_My {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("학생수를 입력하세요:");
        int count = scanner.nextInt();
        int[][] score = new int[count][3];
        String[] subjects = {"국어", "영어", "수학"};

        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요:");
            for (int j = 0; j < 3; j++) {
                System.out.print(subjects[j] + " 점수:");
                score[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < score.length; i++) {
            int sum = 0;

            for (int j = 0; j < score[i].length; j++) {
                sum += score[i][j];
            }
            double average = (double) sum / score[i].length;

            System.out.print((i + 1) + "번 학생의 총점: " + sum + ", 평균: " + average);
            System.out.println();
        }
    }
}
