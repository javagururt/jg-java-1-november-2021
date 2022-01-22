package student_stanislav_p.lesson_8_inheritance.homework.level_4_junior_5_middle;
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


public class ShapeUtilDemo {

    public static void main(String[] args) {

        ShapeUtil shapeUtil = new ShapeUtil();
        Shape circle = shapeUtil.createRandomCircle();
        double circleArea = shapeUtil.calculateArea(circle);
        double circlePerimeter = shapeUtil.calculatePerimeter(circle);


        System.out.println("Circle radius -");

        System.out.println("Circles area -" + circleArea);
        System.out.println();
        System.out.println("Circles perimeter - " + circlePerimeter);
    }


}
