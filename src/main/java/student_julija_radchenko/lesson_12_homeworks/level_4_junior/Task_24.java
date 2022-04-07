package student_julija_radchenko.lesson_12_homeworks.level_4_junior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Task_24 {

    //Найдите в документации Java (javadoc) для чего испольхуются
    //следующие ошибки:
    //- ArrayIndexOutOfBoundsException
    //- IllegalArgumentException
    //- IOException
    //- StackOverflowError
    //- OutOfMemoryError
    //- NumberFormatException


    //ArrayIndexOutOfBoundsException кидается,
    // если произошла попытка обратиться к элементу, находящемуся за пределамимассива
    // (индекс меньше 0 или больше длины массива).

    //IllegalArgumentException предупреждает о попытке передать в метод несоответствующий логике метода аргумент.

    // IOException предупреждает о неудачной или прерванной операции ввода/вывода .

    // StackOverflowError - ошибка, не исключение.
    // Сообщает о том, что стек JVM переполнен, нет места для создания нового фрейма.
    // Чаще всего происходит при слишком глубокой рекурсии в определенной части кода.

    // OutOfMemoryError чаще всего означает, что в куче не хватает места под новый объект,
    // garbage collector не может расчистить кучу.

    // NumberFormatException - сигнализирует о попытке привести строку (String) к числовому значению,
    // однако содержимое строки представлено в непонятном для JVM формате.
}
