package student_victor_veselov.lesson_8.junior_3.Task13;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Meizu extends Phone {
    @Override
    public void phoneTurnOn() {
        System.out.println("Meizu Включен");

    }

    @Override
    public void phoneTurnOff() {
        System.out.println("Meizu Выключен");

    }
}
