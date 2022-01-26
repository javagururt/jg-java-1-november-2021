package student_andrei_karamnov.lesson_8_inheritance.level_4_junior;

import java.util.Random;

public class ShapeUtilTest {
    public static void main(String[] args) {

        ShapeUtilTest test = new ShapeUtilTest();
        test.calculateShapeTest();

    }

    void calculateShapeTest(){

        int value = 10;

        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shapes = new Shape[4];

        shapes[0] = shapeUtil.createRandomCircle(value);
        shapes[1] = shapeUtil.createRandomSquare(value);
        shapes[2] = shapeUtil.createRandomRectangle(value);
        shapes[3] = shapeUtil.createRandomTriangle(value);

        double expectedSumAreaResult = (shapes[0].calculateArea() + shapes[1].calculateArea() + shapes[2].calculateArea() + shapes[3].calculateArea());
        double realSumAreaResult =  shapeUtil.calculateArea(shapes);
        System.out.println("Expected sum area of the shapes: " + expectedSumAreaResult);
        System.out.println("Real sum area of the shapes: " + realSumAreaResult);
        checkTestResult(realSumAreaResult, expectedSumAreaResult, "Calculating shapes area TEST ");

        System.out.println();

        double expectedSumPerimeterResult = (shapes[0].calculatePerimeter() + shapes[1].calculatePerimeter() + shapes[2].calculatePerimeter() + shapes[3].calculatePerimeter());
        double realSumPerimeterResult =  shapeUtil.calculatePerimeter(shapes);
        System.out.println("Expected sum of the shape perimeters: " + expectedSumPerimeterResult);
        System.out.println("Real sum of the shape perimeters: " + realSumPerimeterResult);
        checkTestResult(realSumPerimeterResult, expectedSumPerimeterResult, "Calculating shape perimeters TEST ");
    }

    private void checkTestResult(double realResult, double expectedResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }

}
