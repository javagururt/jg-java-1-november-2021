package student_stanislav_p.lesson_9_interfaces.homework.level_3_junior.Task_6_Function_Interface;

import teacher.annotations.CodeReview;

@FunctionalInterface
@CodeReview(approved = true)
interface CheckCar {
    public boolean test(Car car);

}
