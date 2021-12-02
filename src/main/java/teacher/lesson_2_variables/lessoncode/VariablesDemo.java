package teacher.lesson_2_variables.lessoncode;

class       VariablesDemo {

    public static void main(String[] args) {
        int age = 10;
        int x = 20;
        int y = 30;

        System.out.println(age);

        int sumResult = x + y;
        System.out.println("Sum result: " + sumResult); //sum

        System.out.println("Sum result = " + (x + y)); //sum
        System.out.println("Sum result = " + x + y); //string concat

        double bankBalance = 100000.00;
        System.out.println(bankBalance);

        boolean thirsty = true;
        System.out.println(thirsty);
    }

}
