package lv1;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.print("첫 번째 숫자를 입력하세요: ");
            int intbox1 = sc.nextInt();
            if (intbox1 < 0){
                System.out.println("양의 정수만 받을수 있습니다.");
                continue;
            }
            System.out.print("두 번째 숫자를 입력하세요: ");
            int intbox2 = sc.nextInt();
            if (intbox2 <0){
                System.out.println("양의 정수만 받을수 있습니다.");
                continue;
            }

            System.out.print("사칙연산 기호를 입력하세요: ");
            char strbox = sc.next().charAt(0);

            if (strbox == '+') {
                int val = intbox1 + intbox2;
                System.out.println("값: " + val);
            } else if (strbox == '-') {
                int val = intbox1 - intbox2;
                System.out.println("값: " + val);
            } else if (strbox == '*') {
                int val = intbox1 * intbox2;
                System.out.println("값: " + val);
            } else if (strbox == '/') {
                if (intbox2 == 0) {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    continue;
                } else {
                    int val = intbox1 / intbox2;
                    System.out.println("값: " + val);
                }
            } else {
                System.out.println("유효하지 않은 연산자 입니다.");
                continue;
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String exitbox = sc.next();
            if (exitbox.equals("exit")) {
                break;
            }
        }
    }
}