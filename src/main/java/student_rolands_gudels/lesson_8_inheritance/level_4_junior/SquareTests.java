package student_rolands_gudels.lesson_8_inheritance.level_4_junior;

public class SquareTests {
    public static void main(String[] args) {
      SquareTests.squareCalculateAreaTest();
      SquareTests.squareCalculatePerimeter();
    }
    static void squareCalculateAreaTest() {
        Task_17.Square square = new Task_17.Square("Square No1");
        double expected = 16.0;
        double actual = square.calculateArea();
        if (actual==expected){
        System.out.println("squareCalculateAreaTest PASSED");} else {
            System.out.println("squareCalculateAreaTest FAILED" + actual);
        }
    }
    static void squareCalculatePerimeter() {
        Task_17.Square square = new Task_17.Square("Square No1");
        double expected = 16.0;
        double actual = square.calculatePerimeter();
        if (actual==expected){
            System.out.println("square Calculate Perimeter PASSED");} else {
            System.out.println("square Calculate Perimeter FAILED" + actual);
        }
    }
}

