package lv2;

import java.util.Scanner;
import java.util.LinkedList;

public class App {

    public static void main(String[] args) {

        Calculator cal = new Calculator();
        LinkedList<Integer> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        boolean re = true;

        while (re) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int val1 = sc.nextInt();
            cal.setVal1(val1);
            System.out.print("두 번째 숫자를 입력하세요: ");
            int val2 = sc.nextInt();
            cal.setVal2(val2);

            System.out.print("사칙연산 기호를 입력하세요: ");
            char oper = sc.next().charAt(0);
            cal.setOper(oper);

            try {
                int result = cal.calculate();
                System.out.println("값 = " + result);
            } catch (ArithmeticException e){
                System.out.println("0으로 나눌수 없습니다.");
                continue;
            } catch (NullPointerException e){
                System.out.println("결과값이 NULL 일 수 없습니다.");
                continue;
            }

            void 


            //무한 탈출
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String rebox = sc.next();
            if (rebox.equals("exit")) {
                re = false;
            }
        }
    }
}
