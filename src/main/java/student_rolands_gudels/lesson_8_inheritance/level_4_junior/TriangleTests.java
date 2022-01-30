package student_rolands_gudels.lesson_8_inheritance.level_4_junior;

public class TriangleTests {
        public static void main(String[] args) {
            TriangleTests.triangleCalculateAreaTest();
            TriangleTests.triangleCalculatePerimeter();
        }
        static void triangleCalculateAreaTest() {
            Task_19.Triangle triangle = new Task_19.Triangle("Triangle No1");
            double expected = 6.0;
            double actual = triangle.calculateArea();
            if (actual==expected){
                System.out.println("triangleCalculateAreaTest PASSED");} else {
                System.out.println("triangleCalculateAreaTest FAILED" + actual);
            }
        }
        static void triangleCalculatePerimeter() {
            Task_19.Triangle triangle = new Task_19.Triangle("Triangle No1");
            double expected = 12.0;
            double actual = triangle.calculatePerimeter();
            if (actual==expected){
                System.out.println("triangle Calculate Perimeter PASSED");} else {
                System.out.println("triangle Calculate Perimeter FAILED" + actual);
            }
        }
}
