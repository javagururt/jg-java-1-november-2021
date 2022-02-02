package student_andrei_karamnov.lesson_9_interfaces.homework.level_3_junior;

class ExampleSubtractionCalculate implements FunctionalInterfaceExample{

    public static void main(String[] args) {
        ExampleSubtractionCalculate demo = new ExampleSubtractionCalculate();
        System.out.println(demo.calculate(9, 5));
    }

    public void subTwoNumbers(int a, int b, FunctionalInterfaceExample<Integer, Integer> function) {
        function.calculate(a, b);
    }


    @Override
    public int calculate(int a, int b) {
        return a - b;
    }
}
