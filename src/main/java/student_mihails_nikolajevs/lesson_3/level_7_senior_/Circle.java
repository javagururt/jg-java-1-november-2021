package student_mihails_nikolajevs.lesson_3.level_7_senior_;

/*
Разработать класс - круг, у которого должны быть следующие характеристики:
Свойства: радиус (double radius),
Методы: расчет площади (double calculateArea()).

Класс с объявлением фигуры круг должен называться "Circle".
Класс с демонстрацией работы должен называться "CircleDemo".
 */

public class Circle {

    double radius;
    double calculatedArea;
    double pi = 3.14;

    double calculatedArea(double radius){

        this.radius = radius;
        this.calculatedArea = this.radius * this.radius * pi;
        return calculatedArea;
    }

}