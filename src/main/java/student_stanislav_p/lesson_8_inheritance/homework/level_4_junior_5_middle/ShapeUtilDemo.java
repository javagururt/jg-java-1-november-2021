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

        int bound = 100;

        ShapeUtil shapeUtil = new ShapeUtil();
        Shape circle = shapeUtil.createRandomCircle(bound);
        double circleArea = shapeUtil.calculateArea(circle);
        double circlePerimeter = shapeUtil.calculatePerimeter(circle);


        System.out.println("Circle radius -> ");

        System.out.println("Circles area -> " + mr(circleArea));

        System.out.println("Circles perimeter -> " + mr(circlePerimeter));
    }

     static double mr(double result) {

        return (double)Math.round(result * 1000d) / 1000d;

    }


}
