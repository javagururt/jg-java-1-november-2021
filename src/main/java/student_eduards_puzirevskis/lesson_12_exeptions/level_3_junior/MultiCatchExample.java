package student_eduards_puzirevskis.lesson_12_exeptions.level_3_junior;

import java.util.Scanner;

/*
В первую очередь должна быть изменена последовательность блоков.
Они должны быть выстроены в последовательности от более частных к обобщенным.
Класс ArithmeticException наследуется от класса RuntimeException,
 который в свою очередь наследуется от класса Exception. Следовательно,
 ArithmeticException должен идти перед Exception.

Блок try: выполняет код
Блок catch (ArithmeticException a) ловит арифметические ошибки (самый яркий пример: деление на "0", уравнение не имеет корней)
Блок (Exception e) ловит другие ошибки, к примеру неправильный ввод типа данных
 */

class MultiCatchExample {

     public static void main(String[] args) {
         System.out.println("Hello! Please type integer)");
         while (true) {
             try {
                 Scanner scanner = new Scanner(System.in);
                 System.out.println("Please, type first integer.");
                 int firstDouble = scanner.nextInt();
                 System.out.println("Please, type second integer.");
                 int secondDouble = scanner.nextInt();
                 int result = firstDouble/secondDouble;
                 System.out.println("Result of division is: " + result);
                 System.out.println("By!");
                 break;
             } catch (ArithmeticException a) {
                 System.out.println("Arithmetical Exception " + a);
                 System.out.println("Try again...");
             } catch (Exception e) {
                 System.out.println("Exception " + e);
                 System.out.println("Try again...");
             }
         }

     }
}
