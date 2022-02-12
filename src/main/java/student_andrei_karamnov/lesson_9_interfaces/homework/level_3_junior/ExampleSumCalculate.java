package student_andrei_karamnov.lesson_9_interfaces.homework.level_3_junior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class ExampleSumCalculate implements FunctionalInterfaceExample {
    public static void main(String[] args) {
        ExampleSumCalculate demo = new ExampleSumCalculate();
        System.out.println(demo.calculate(4, 5));

    }


    public void sumTwoNumbers(int a, int b, FunctionalInterfaceExample<Integer, Integer> function) {
        function.calculate(a, b);
    }

    @Override
    public int calculate(int a, int b) {
        return a + b;
    }
}
