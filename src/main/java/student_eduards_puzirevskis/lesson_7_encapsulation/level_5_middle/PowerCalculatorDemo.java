package student_eduards_puzirevskis.lesson_7_encapsulation.level_5_middle;

 class PowerCalculatorDemo {

     public static void main(String[] args) {
         PowerCalculator demo = new PowerCalculator();
         System.out.println("Your result is " + demo.calculate(demo.getNumber(),demo.getDegree()));
     }
}
