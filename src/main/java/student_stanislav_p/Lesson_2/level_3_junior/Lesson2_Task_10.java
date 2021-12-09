package student_stanislav_p.Lesson_2.level_3_junior;

/*
Напишите программу, которая запрашивает у пользователя
радиус круга (вещественное число) и печатает на консоль
периметр и площадь круга.

Test Data:
Radius = 7.5

Expected Output
Perimeter is = 47.12388980384689
Area is = 176.71458676442586
 */
import java.util.Scanner;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(comment = "переменные лучше называть на английском языке.")
public class Lesson2_Task_10 {

        public static void main(String [] args) {


            double Perimetr, Plosh;

            Scanner scanner = new Scanner(System.in);


            System.out.println("Введите радиус круга ->");

            double Radius = scanner.nextDouble();


            double Pi = 3.1415926535897932384626433832795;


            Perimetr = 2 * Pi * Radius;
            Plosh =  Pi * Radius * Radius;

            System.out.println("Длина окружности = " + Perimetr);
            System.out.println("Площадь круга    = " + Plosh);
            }

        }

