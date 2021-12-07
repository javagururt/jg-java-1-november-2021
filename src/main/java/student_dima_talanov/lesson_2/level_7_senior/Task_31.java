/* Написать программу, которая запрашивает название книги и автора, и выводит на консоль,
   (Мастер и Маргарита, Михаил Булгаков), а также посчитать количество
   нечётных страниц если в книги всяго 732 страницы.
   Дополнительное задание:
   Дано любое количество страниц в книги от 0 до 1000, выведите последнию цифру.
*/

package student_dima_talanov.lesson_2.level_7_senior;
import java.util.Scanner;

public class Task_31 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Witch book are you reading?"); // Мастер и Маргарита
        String nameBook = scanner.nextLine();
        System.out.println("Who is the author?"); // Михаил Булгаков
        String nameAuthor = scanner.nextLine();

        System.out.println("Number of odd pages");
        int a = 732;
        int result;

        result = (a / 2);
        System.out.println("Result is: " + result);

        System.out.println("Additional task:");
        int b = scanner.nextInt(); // 0 - 1000
        int result1;

        result1 = (b % 10);
        System.out.println("Result is: " + result1);
    }
}
