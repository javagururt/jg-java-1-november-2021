package student_victor_veselov.lesson_8.junior_4;

public class ShapeUtilDemo {
    public static void main(String[] args) {

        ShapeUtil shapeUtil = new ShapeUtil();
        Shape circle = shapeUtil.createRandomCircle();
        double circleArea = shapeUtil.calculatedArea(circle);
        double circlePerimeter = shapeUtil.calculatedPerimeter(circle);

        System.out.println("Circles area = " + circleArea);
        System.out.println();
        System.out.println("Circles perimeter = " + circlePerimeter);
    }
}