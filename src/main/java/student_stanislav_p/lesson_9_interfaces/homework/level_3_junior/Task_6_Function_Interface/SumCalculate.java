package student_stanislav_p.lesson_9_interfaces.homework.level_3_junior.Task_6_Function_Interface;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class SumCalculate implements FunctionalInterface1 {
    public static void main(String[] args) {
        SumCalculate demo = new SumCalculate();
        System.out.println(demo.calculate(10, 25));

    }


    public void sumTwoNumbers(int a, int b, FunctionalInterface1<Integer, Integer> function) {
        function.calculate(a, b);
    }

    @Override
    public int calculate(int a, int b) {
        return a + b;
    }
}
