package student_vladislav_savickis.lesson_3_oop_first_look.level_7_senior;

class Circle {
    double radius;

    Circle(double circleRadius){
        this.radius = circleRadius;
    }

    double calculateArea(){
        return Math.PI * radius * radius;
    }
}
