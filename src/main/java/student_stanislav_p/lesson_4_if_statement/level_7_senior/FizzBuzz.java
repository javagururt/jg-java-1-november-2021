package student_stanislav_p.lesson_4_if_statement.level_7_senior;

/*
Создайте класс FizzBuzz.
В классе FizzBuzz создайте метод со следующей сигнатурой:

class FizzBuzz {

    public String detect(int number) {
        // Реализуйте следующие требования:
        // - если переданное число делится на три возвращайте "Fizz"
        // - если переданное число делится на пять возвращайте "Buzz"
        // - если переданное число делится на три и на пять возвращайте "FizzBuzz"
        // - иначе возвращайте само число в виде строки (подсказка: return "" +  number)
    }

}

Создайте класс FizzBuzzTest и напишите автоматические тесты,
которые покрывают все возможные сценарии.
 */

public class FizzBuzz {

    String control(int number){
        if (DivOn3(number) && DivOn5(number)) {return "FizzBuzz";}
        if(DivOn3(number)) {return "Fizz";}
        if(DivOn5(number)) { return "Buzz";}
        return " " + number;
    }

    boolean DivOn3(int number) {return number % 3 == 0;}

    boolean DivOn5(int number) {return number % 5 == 0;}
}