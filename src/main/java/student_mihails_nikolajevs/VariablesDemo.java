package student_mihails_nikolajevs;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class VariablesDemo {

    public static void main(String[] args) {
        int age = 30;
        int x = 20;
        int y = 50;
        System.out.println(age);

        int sumResult = x + y;
        System.out.println("Sum Result = " + sumResult);

        boolean wantToDrink = true;
        System.out.println(wantToDrink);

    }
}