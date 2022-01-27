package student_andrei_karamnov.lesson_8_inheritance.level_4_junior;

class ShapeUtilDemo {
    public static void main(String[] args) {

        int value = 10;

        ShapeUtil shapeUtil = new ShapeUtil();

        Shape circle = shapeUtil.createRandomCircle(value);
        double circleArea = shapeUtil.calculateArea(circle);
        double circlePerimeter = shapeUtil.calculatePerimeter(circle);

        System.out.println("Circle area is: " + circleArea);
        System.out.println("Circle perimeter is: " + circlePerimeter);
        System.out.println();

        Shape rectangle = shapeUtil.createRandomRectangle(value);
        double rectangleArea = shapeUtil.calculateArea(rectangle);
        double rectanglePerimeter = shapeUtil.calculatePerimeter(rectangle);

        System.out.println("Rectangle area is: " + rectangleArea);
        System.out.println("Rectangle perimeter is: " + rectanglePerimeter);


    }
}
