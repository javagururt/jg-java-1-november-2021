package student_victor_veselov.lesson_3.Task30;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Circle {
    double radius = 3.5;
    double calculatedArea = 3.14*radius*radius;

    public void area(){
        System.out.println("Area is : " + calculatedArea);
    }
}
