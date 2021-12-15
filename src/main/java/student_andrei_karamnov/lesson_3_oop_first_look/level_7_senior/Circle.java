package student_andrei_karamnov.lesson_3_oop_first_look.level_7_senior;

class Circle {
    double radius;
    double Pi = 3.14;
    int a;
    double calculateArea;
    public Circle(double r){
        this.radius = r;
        this.a = 2;
        this.calculateArea = Math.pow(this.radius, a) * this.Pi;
        System.out.println("Площадь круга равна: " + calculateArea);

}


    }

