package student_stanislav_p.lesson_8_inheritance.level_7_senior.task_32;

/*
Разобраться в коде MathOperation, который находится в пакете super_task_2.
Реализовать две дополнительные математические операции: умножение и деление.
В демо программе сконструировать и вычислить выражение: (10 - 5) * (20 / 5).
Написать тесты для данного кода.
 */


import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class MAthOperationDemo_Task32 {

    public static void main(String[] args) {

        MAthOperationDemo_Task32 mod = new MAthOperationDemo_Task32();

        // build and calculate: 10 - 5
        Argument arg1 = new Argument(10);
        Argument arg2 = new Argument(5);
        MathOperation subtraction = new Subtraction(arg1, arg2);

        double realResultLeftSide = subtraction.calculate();

        double expectedResultLeftSide = 5;


        System.out.println("Left side Subtraction result = " + realResultLeftSide);


        // build and calculate:  10 / 2


        Divide divide = new Divide(new Argument(10), new Argument(2));

        double realResultRightSide = divide.calculate();

        double expectedResultRightSide = 5;

        System.out.println("Right side divide result = " + realResultRightSide);


        // build and calculate:  (10 - 5) * (20 / 5)

        Multiply multiply = new Multiply(subtraction, divide);

        double realResultFinal = multiply.calculate();

        double expectedResultFinal = 25;


        System.out.println("Final result = " + multiply.calculate());

        System.out.println("================== TEST RESULT ==============");

        mod.checkTestResult(realResultLeftSide == expectedResultLeftSide, "Test 1. Calculation result left side - ");
        mod.checkTestResult(realResultRightSide == expectedResultRightSide, "Test 2. Calculation result right side - ");
        mod.checkTestResult(realResultFinal == expectedResultFinal, "Test 3. Calculation final result  - ");

    }

    //-------------------------------------------

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }

    //-------------------------------------------

    private void printTestResult(String nameResult, double result1) {

        System.out.println(nameResult + result1);

    }


}
