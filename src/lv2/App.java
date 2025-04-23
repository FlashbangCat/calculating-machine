package lv2;

import java.util.LinkedList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Calculator cal = new Calculator();
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
                Integer result = cal.calculate();
                System.out.println("값 = " + result);
                cal.list.addLast(result);
                System.out.println(cal.getList());

            } catch (ArithmeticException e){
                System.out.println("0으로 나눌수 없습니다.");
                continue;

            } catch (NullPointerException e){
                System.out.println("결과값이 NULL 일 수 없습니다.");
                continue;
            }

            //무한 탈출
            System.out.println("아무 키를 입력해주세요. (exit 입력 시 종료), (delete 입력시 삭제), (set 입력시 수정)");
            String rebox = sc.next();
            if (rebox.equals("exit")) {
                re = false;

            } else if (rebox.equals("delete")){
                System.out.println("삭제되었습니다.");
                cal.remove();
                System.out.println(cal.getList());

            } else  if (rebox.equals("set")){
                System.out.print("몇번째 배열의 값을 바꿀지 선택해 주세요: ");
                int posi = sc.nextInt();
                System.out.print("무슨 값으로 바꿀지 작성해 주세요:");
                int cr = sc.nextInt();
                cal.setList(posi,cr);
                System.out.println(cal.getList());
            }

        }
    }
}
