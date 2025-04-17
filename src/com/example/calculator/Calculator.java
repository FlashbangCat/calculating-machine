package com.example.calculator;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int intbox1 = sc.nextInt();
        System.out.print("두 번째 숫자를 입력하세요: ");
        int intbox2 = sc.nextInt();

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
            int val = intbox1 / intbox2;
            System.out.println("값: " + val);
        }

    }
}
