package array.ex;

import java.util.Scanner;

// 2차원 배열1
public class ArrayEx7_My {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] score = new int[4][3];

        for (int i = 0; i < 4; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요:");

            System.out.print("국어 점수:");
            int kor = scanner.nextInt();
            score[i][0] = kor;

            System.out.print("영어 점수:");
            int eng = scanner.nextInt();
            score[i][1] = eng;

            System.out.print("수학 점수:");
            int math = scanner.nextInt();
            score[i][2] = math;
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
