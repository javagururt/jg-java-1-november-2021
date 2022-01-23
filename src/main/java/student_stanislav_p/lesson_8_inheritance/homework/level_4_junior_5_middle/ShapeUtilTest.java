package student_stanislav_p.lesson_8_inheritance.homework.level_4_junior_5_middle;


/*

Создайте класс ShapeUtilTest
и напишите тесты для методов:

    double calculateArea(Shape[] shapes);
    double calculatePerimeter(Shape[] shapes);

PS: пример создания и заполнения массива
геометрических фигур:

ShapeUtil shapeUtil = new ShapeUtil();
Shape[] shapes = new Shape[4];
shape[0] = shapeUtil.createRandomCircle();
shape[1] = shapeUtil.createRandomSquare();
shape[2] = shapeUtil.createRandomRectangle();
shape[3] = shapeUtil.createRandomTriangle();
 */


public class ShapeUtilTest {

    public static void main(String[] args) {

        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shapes = new Shape[4];

        int bound = 50;

        shapes[0] = shapeUtil.createRandomCircle(bound);
        shapes[1] = shapeUtil.createRandomSquare(bound);
        shapes[2] = shapeUtil.createRandomRectangle(bound);
        shapes[3] = shapeUtil.createRandomTriangle(bound);

        for (int i = 0; i < 4; i++) {

          printShapesParameter(shapes, i);
        }

    }

    //-------------------------------------------

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }

    //-------------------------------------------

    private void printTestResult(String nameResult, double result1) {

        System.out.println(nameResult+result1);

    }

    private double mr(double result) {

        return (double)Math.round(result * 100000d) / 100000d;

    }

   static void printShapesParameter(Shape[] shapes, int i) {

        System.out.println(" Фигура № "+(i+1)+" -  "+shapes[i].getTitle());

        System.out.println("Площадь " + shapes[i].getTitle() + " № "+(i+1) +" равна "+ shapes[i].calculateArea());

        System.out.println("Периметр " + shapes[i].getTitle() + " № "+(i+1) +" равен "+ shapes[i].calculatePerimeter());

    switch (shapes[i].getTitle()){
        case   "Circle":
            System.out.println("Радиус -> "); // а как вытащить через getter???
            break;
    }

    }




}
