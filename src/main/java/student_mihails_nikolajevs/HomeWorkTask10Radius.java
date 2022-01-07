package student_mihails_nikolajevs;



 /* Напишите программу, которая запрашивает у пользователя
         радиус круга (вещественное число) и печатает на консоль
         периметр и площадь круга.
         Test Data:
         Radius = 7.5
         Expected Output
         Perimeter is = 47.12388980384689
         Area is = 176.71458676442586
 */
        // Circle perimeter formula :  L = d*π = 2*r*π.
        // Formula for the area for the circle :  S = π × r2

        import java.util.Scanner;

    public class HomeWorkTask10Radius {

    public static void main(String[] args) {

        System.out.println( "PLease Enter The Lenght of Radius -> ");

        Scanner input = new Scanner(System.in);
        Double radius = input.nextDouble();

        Double Perimetr;

        Perimetr = 2 * radius * 3.14;
        System.out.println( "Perimetr is -> " + Perimetr );

        Double Area;

        Area = radius * radius * 3.14;
        System.out.println(" Area is -> " + Area);



    }

}