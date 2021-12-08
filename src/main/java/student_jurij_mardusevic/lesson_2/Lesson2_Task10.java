/*Напишите программу, которая запрашивает у пользователя
радиус круга (вещественное число) и печатает на консоль
периметр и площадь круга.

Test Data:
Radius = 7.5

Expected Output
Perimeter is = 47.12388980384689
Area is = 176.71458676442586*/

package student_jurij_mardusevic.lesson_2;

class Lesson2_Task10 {
    private static final double radius = 7.5;
    public static void main(String[] args) {
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;
        System.out.println("Perimeter is =" + perimeter);
        System.out.println("Area is =" + area);
    }
}
