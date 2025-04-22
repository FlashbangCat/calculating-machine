package lv2;

public class Calculator {
    private int val1;
    private int val2;
    private char oper;


    public int calculate() {
        Integer result = null;
        switch (oper) {
            case '+' -> result = val1 + val2;
            case '-' -> result = val1 - val2;
            case '*' -> result = val1 * val2;
            case '/' -> result = val1 / val2;
            default -> System.out.println("유효하지 않은 연산자 입니다.");
        }
        return result;
    }

    public int getVal1() {
        return val1;
    }

    public void setVal1(int val1) {
        this.val1 = val1;
    }

    public int getVal2() {
        return val2;
    }

    public void setVal2(int val2) {
        this.val2 = val2;
    }

    public char getOper() {
        return oper;
    }

    public void setOper(char oper) {
        this.oper = oper;
    }
}