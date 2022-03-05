package student_valeriia_kulikova.lesson_8_inheritance.homework.level_4_junior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Square extends Shape {
    private double side;

    Square(String title, double side) {
        super(title);

        this.side = side;
    }


    @Override
    double calculateArea() {
        double area = side * side;
        return area;
    }

    @Override
    double calculatePerimetr() {
        double perimetr = side * 4;
        return perimetr;
    }
}
