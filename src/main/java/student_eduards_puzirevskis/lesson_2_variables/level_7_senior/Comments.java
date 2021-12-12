package student_eduards_puzirevskis.lesson_2_variables.level_7_senior;
/*
Напишите программу и продемонстрируйте в ней использование
однострочного и многострочного коментариев.
 */
import java.util.Scanner;

public class Comments {
    public static void main(String[] args) {
        double pi = 3.1415926536 ; // в данном случае решил взять одну из программ по домашкам
        System.out.println("Please, enter your circle radius : ");
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
/*
т.к во всех домашках перед выполнением самого задания
в качестве многострочных комментов стоят условия самих заданий
не то, чтобы лень новую писать, но лень- двигатель прогресса же)
 */
        double perimeter = 2*pi*radius;
        double area = pi*radius*radius;

        System.out.println("Your circle Radius is : " + radius);
        System.out.println("Your circle Perimeter is : " + perimeter);
        System.out.println("Your circle Area is : " + area);

    }
}
