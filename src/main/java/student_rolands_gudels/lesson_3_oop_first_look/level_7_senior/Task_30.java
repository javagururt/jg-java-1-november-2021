package student_rolands_gudels.lesson_3_oop_first_look.level_7_senior;

 class Task_30 {
    /*Разработать класс - круг, у которого должны быть следующие характеристики:
Свойства: радиус (double radius),
Методы: расчет площади (double calculateArea()).

Класс с объявлением фигуры круг должен называться "Circle".
Класс с демонстрацией работы должен называться "CircleDemo".*/
    static class Circle{

   double radius;
    Circle(double radius) {this.radius = radius;}

     void calculateArea(){
     double circleSquare;
     circleSquare=((radius*radius)*Math.PI);
      System.out.println("The circle square is "+ circleSquare);


     }

    }
}
