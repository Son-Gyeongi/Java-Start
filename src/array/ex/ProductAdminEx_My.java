package array.ex;

import java.util.Scanner;

// 상품 관리 프로그램 만들기
public class ProductAdminEx_My {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] productNames = new String[10];
        int[] productPrices = new int[10];
        int productCount = 0;

        while (true) {
            System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");
            System.out.print("메뉴를 선택하세요:");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    if (productCount == productNames.length) {
                        // 상품을 더 등록할 수 없는 경우
                        System.out.println("더 이상 상품을 등록할 수 없습니다.");
                        break;
                    }

                    System.out.print("상품 이름을 입력하세요:");
                    String productName = scanner.nextLine();
                    System.out.print("상품 가격을 입력하세요:");
                    int productPrice = scanner.nextInt();
                    productNames[productCount] = productName;
                    productPrices[productCount] = productPrice;
                    productCount++;
                    break;
                case 2:
                    if (productCount == 0) {
                        // 등록된 상품이 없는 경우
                        System.out.println("등록된 상품이 없습니다.");
                        break;
                    }
                    for (int i = 0; i < productCount; i++) {
                        System.out.println(productNames[i] + ": " + productPrices[i] + "원");
                    }
                    break;
                case 3:
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);
                default:
                    System.out.println("등록된 메뉴가 아닙니다. 다시 선택해주세요.");
            }
        }
    }
}
