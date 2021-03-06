package student_stanislav_p.Lesson_2.level_7_senior;


import teacher.annotations.CodeReview;

/*
Исправьте ошибки компиляции в данной программе.

public class CorrectDataTypes {

	public static void main(String[] args) {

		int numberOne = 10;
		double numberTwo = 20.0;

		System.out.println("Number 1 = " + numberOne);
		System.out.println("Number 2 = " + numberTwo);

		float sum = numberOne + numberTwo;

		System.out.println("Sum = " + sum);
	}

}

Подсказка: в Java тип результата арифметической операции является
типом самого широкого аргумента. Тоесть если:
    int a = 1;
    long b = 2L;
    long result = a + b;

типом результата операции сложения (a + b) будет long, так как
тип long являтся более широким типом данных чем int.
Широкий - в том смысле, что в переменной этого типа данных
можно представить значения из большего диапазона.
Диапазон типа данных long больше чем диапазон типа int.
 */
@CodeReview(approved = true)
public class Lesson2_Task_30 {


            public static class CorrectDataTypes {

                public static void main(String[] args) {


                            int numberOne = 10;
                            double numberTwo = 20.0;

                            System.out.println("Number 1 = " + numberOne);
                            System.out.println("Number 2 = " + numberTwo);

                            double sum = numberOne + numberTwo;

                            System.out.println("Sum = " + sum);
                        }

                    }
                }
