package student_andrei_karamnov.lesson_9_interfaces.homework.level_3_junior;

/*Что такое функциональный интерфейс в Java?

Найдите в интернете информацию об этом.
Придумайте и реализуйте его в виде программного кода.
В коментарии в коде напишите ответ на вопрос.*/

@FunctionalInterface
public interface FunctionalInterfaceExample<A, B> {
    /**
     * Applies this function to the given arguments.
     *
     * @param a the first function argument
     * @param b the second function argument
     * @return the function result
     */
    int calculate(int a, int b);
}
 /*
 Функциональный интерфейс — это интерфейс, который содержит ровно один абстрактный метод,
 то есть описание метода без тела. Статические методы и методы по умолчанию при этом не в счёт,
  их в функциональном интерфейсе может быть сколько угодно.
  Когда параметром метода является функциональный интерфейс,
  при вызове этого метода одним из аргументов должен быть блок кода.
  */