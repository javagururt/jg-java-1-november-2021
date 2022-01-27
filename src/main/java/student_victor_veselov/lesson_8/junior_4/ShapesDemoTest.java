package student_victor_veselov.lesson_8.junior_4;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class ShapesDemoTest {
    public static void main(String[] args) {
        ShapesDemoTest shapesDemoTest = new ShapesDemoTest();

        shapesDemoTest.areaTest();
        System.out.println();
        shapesDemoTest.perimeterTest();

    }

    void areaTest(){
        double trueResult = 78.5;
        Circle circle = new Circle(5,"Circle");
        double result = circle.calculatedArea();
        if (trueResult == result){
            System.out.println("Circle Area Test Done");
        }else {
            System.out.println("Circle Area Test Failed");
        }
    }

    void perimeterTest(){
        double trueResult = 50.24;
        Circle circle = new Circle(8,"Circle");
        double result = circle.calculatedPerimeter();
        if (trueResult == result){
            System.out.println("Circle Perimeter Test Done");
        }else {
            System.out.println("Circle Perimeter Test Failed");
        }

    }
}
