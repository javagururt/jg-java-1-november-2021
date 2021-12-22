package student_eduards_puzirevskis.lesson_3_oop_first_look.level_7_senior.task_30;
/*
Разработать класс - круг, у которого должны быть следующие характеристики:
Свойства: радиус (double radius),
Методы: расчет площади (double calculateArea()).

Класс с объявлением фигуры круг должен называться "Circle".
Класс с демонстрацией работы должен называться "CircleDemo".
 */
class Circle {
    double radius;
    double area;
    private double pi = 3.1415926536 ;

    public double getRadius() {
        System.out.println("What radius does you circle have?");
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        System.out.println("OK. Your circle radius is: " + this.radius + ". Now I'll calculate his area");
        area = pi*radius*radius;
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void whatWeHave() {
        System.out.println("Alright. We have: ");
        System.out.println("Circle radius is : " + this.radius);
        System.out.println("Circle area is :" + this.area);
        System.out.println("Thanks! See you later)");
    }
}
