package student_rolands_gudels.lesson_9_interfaces.level_2_intern;

public class Task_4 {
/*    Несколько имплементаций одного интерфейса.

    Одну и ту же задачу можно решить разными способами.

    Дан класс: */

   public static class DayOfTheWeekDetectorIfVersion implements DayOfTheWeekDetector, DetectDayNameArra {

        @Override public String detectDayName(int number) {
             if (number == 1) {
                 return "Monday";
             } else if (number == 2) {
                 return "Tuesday";
             } else if (number == 3) {
                 return "Wednesday";
             } else if (number == 4) {
                 return "Thursday";
             } else if (number == 5) {
                 return "Friday";
             } else if (number == 6) {
                 return "Saturday";
             } else if (number == 7) {
                 return "Sunday";
             } else {
                 return "Please input a valid number between 1 and 7";
             }
         }
         /////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // Try to use switch here!!
       @Override public String detectDayNameSwit(int number) {
            switch (number) {
                case 1:
                    return ("Monday");
                case 2:
                    return("Tuesday");
                case 3:
                    return("Wednesday");
                case 4:
                    return("Thursday");
                case 5:
                    return("Friday");
                case 6:
                    return("Saturday");
                case 7:
                    return("Sunday");
                default:
                    return ("Please input a valid number between 1 and 7");
            }
        }

        @Override public String detectDayNameArra(int number) {
            String[] numbers = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
            //for (int i = 0; i < numbers.length; i++){
                return numbers[number-1];}
           // return numbers[number];
        }
           // return null;

    }


   /* Создайте для этого класса интерфейс DayOfTheWeekDetector.
    Сделайте так, чтобы класс DayOfTheWeekDetectorIfVersion реализовывал
    интерфейс DayOfTheWeekDetector.

    Создайте вторую имплементацию данного интерфейса основанную на switch операторе.

    Если сможете, то создайте третью имплементацию основанную на массиве строк.
            Индекс массива = номеру дня недели, а значение в ячейке массива это название соответствующего
    дня недели.

    Протестируйте все имплементации.*/

