package student_stanislav_p;

import java.util.Scanner;

public class Lesson2_Ex10 {

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

