package student_stanislav_p.lesson_9_interfaces.homework.level_3_junior.Task_6_Function_Interface;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class SubtractCalculate implements FunctionalInterface1 {

    public static void main(String[] args) {
        SubtractCalculate demo = new SubtractCalculate();
        System.out.println(demo.calculate(10, 25));
    }

    public void subTwoNumbers(int a, int b, FunctionalInterface1<Integer, Integer> function) {
        function.calculate(a, b);
    }


    @Override
    public int calculate(int a, int b) {
        return a - b;
    }
}
