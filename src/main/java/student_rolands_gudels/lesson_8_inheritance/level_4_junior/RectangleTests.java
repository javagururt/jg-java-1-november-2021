package student_rolands_gudels.lesson_8_inheritance.level_4_junior;

public class RectangleTests {

    public static void main(String[] args) {
        RectangleTests.rectangleCalculateAreaTest();
        RectangleTests.rectangleCalculatePerimeter();
    }
    static void rectangleCalculateAreaTest() {
        Task_18.Rectangle rectangle = new Task_18.Rectangle("Rectangle no1");
        double expected = 20.0;
        double actual = rectangle.calculateArea();
        if (actual==expected){
            System.out.println("rectangle Calculate Area Test PASSED");} else {
            System.out.println("rectangle Calculate Area Test FAILED" + actual);
        }
    }
    static void rectangleCalculatePerimeter() {
        Task_18.Rectangle rectangle = new Task_18.Rectangle("Rectangle no1");
        double expected = 18.0;
        double actual = rectangle.calculatePerimeter();
        if (actual==expected){
            System.out.println("rectangle Calculate Perimeter PASSED");} else {
            System.out.println("rectangle Calculate Perimeter FAILED" + actual);
        }
    }
}


