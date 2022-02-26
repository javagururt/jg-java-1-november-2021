package student_stanislav_p.lesson_9_interfaces.homework.level_3_junior.Task_6_Function_Interface;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
@FunctionalInterface
interface functionalInterface2{
    abstract public void abstractMethod();
}

class Test implements functionalInterface2{
    @Override
    public void abstractMethod(){
        System.out.println("Функциональные интерфейсы в Java");
    }
}