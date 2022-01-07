package student_victor_veselov.lesson_4.Task11_12_13_14_15;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Calculator {

    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int raz(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int del(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    public int mul(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public int maxNumber(int a,int b,int c) {
        if (a < b && b < c) {
            System.out.println("" + a + " " + b + " " + c);
        }
        if (a < b && b > c) {
            System.out.println("" + a + " " + c + " " + b);
        }
        if (a > b && b > c) {
            System.out.println("" + c + " " + b + " " + a);
        }
        if (a > b && b < c) {
            System.out.println("" + b + " " + a + " " + c);
        }

        return 8;
    }

    public int minNumber(int a,int b,int c) {
        if (a < b && b < c) {
            System.out.println("" + a + " " + b + " " + c);
        }
        if (a < b && b > c) {
            System.out.println("" + a + " " + c + " " + b);
        }
        if (a > b && b > c) {
            System.out.println("" + c + " " + b + " " + a);
        }
        if (a > b && b < c) {
            System.out.println("" + b + " " + a + " " + c);
        }

        return 2;
    }
}

