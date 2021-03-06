package student_andrei_karamnov.lesson_2_variables.level_7_senior;

import teacher.annotations.CodeReview;

/*Исправьте ошибки компиляции в данной программе.

public class SumTwoNumbers {

	public static void main(String[] args) {

		int numberOne;
		int numberTwo;

		System.out.println("Number 1 = " + numberOne);
		System.out.println("Number 2 = " + numberTwo);

		int numberOne = 10;
		int numberTwo = 20;

		int sum = numberOne + numberTwo;

		System.out.println("Sum = " + sum);
	}

}

Подсказка: в Java использовать переменные нельзя до тех пор пока
им не будет присвоено начальное значение.*/
@CodeReview(approved = true)
public class SumTwoNumbers {
    public static void main(String[] args) {
        int numberOne = 10;
        int numberTwo = 20;
        System.out.println("Number 1 = " + numberOne);
        System.out.println("Number 2 = " + numberTwo);

        int sum = numberOne + numberTwo;

        System.out.println("Sum = " + sum);
    }
}
