package student_dmitrijs_sinkevics.lesson_8.lvl_4_junior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class TriangleTest {
    public static void main(String[] args) {
        TriangleTest test = new TriangleTest();
        test.calculateAreaTest();
        test.calculatePerimeterTest();
    }

    public void calculateAreaTest() {
        double side = 5;
        double expectedResult = 2.1650635094610964;
        Triangle triangle = new Triangle("Triangle", side);
        double realResult = triangle.calculateArea();
        if (realResult == expectedResult)
            System.out.println("calculateAreaTest test = OK");
        else
            System.out.println("calculateAreaTest test = fail");
    }

    public void calculatePerimeterTest() {
        double side = 5;
        double expectedResult = 15;
        Triangle triangle = new Triangle("Triangle", side);
        double realResult = triangle.calculatePerimeter();
        if (realResult == expectedResult)
            System.out.println("calculatePerimeterTest test = OK");
        else
            System.out.println("calculatePerimeterTest test = fail");
    }
}
