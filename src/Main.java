import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int intbox1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int intbox2 = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요: ");
            char strbox = sc.next().charAt(0);

            if (strbox == '+') {
                int val = intbox1 + intbox2;
                System.out.println("값: " + val);
            }
            else if (strbox == '-') {
                int val = intbox1 - intbox2;
                System.out.println("값: " + val);
            }
            else if (strbox == '*') {
                int val = intbox1 * intbox2;
                System.out.println("값: " + val);
            }
            else if (strbox == '/') {
                int val = intbox1 / intbox2;
                System.out.println("값: " + val);
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String exitbox = sc.next();
            if (exitbox.equals("exit")) {
                System.out.println("장비를 정지합니다.");
                break;
            } else {
                continue;
            }

        }
    }

}