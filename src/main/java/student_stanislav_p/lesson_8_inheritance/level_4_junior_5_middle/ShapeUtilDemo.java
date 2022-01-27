package student_stanislav_p.lesson_8_inheritance.level_4_junior_5_middle;
/*

  Создайте ShapeUtilDemo класс и продемонстрируйте
    расчёт площади и переиметра
    любой геометрической фигуры.


    Пример для круга:

    ShapeUtil shapeUtil = new ShapeUtil();
    Shape circle = shapeUtil.createRandomCircle();
    double circleArea = shapeUtil.calculateArea(circle);
    double circlePerimeter = shapeUtil.calculatePerimeter(circle);


 */

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class ShapeUtilDemo {

    public static void main(String[] args) {

        int bound = 100;

        ShapeUtil shapeUtil = new ShapeUtil();
        Square square = shapeUtil.createRandomSquare(bound);
        double squareArea = shapeUtil.calculateArea(square);
        double squarePerimeter = shapeUtil.calculatePerimeter(square);


        System.out.println("Circle radius -> " + square.getSide());

        System.out.println("Circles area -> " + mr(squareArea));

        System.out.println("Circles perimeter -> " + mr(squarePerimeter));
    }

    static double mr(double result) {

        return (double) Math.round(result * 1000d) / 1000d;

    }


}
