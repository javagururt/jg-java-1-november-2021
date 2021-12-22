package student_valeriia_kulikova.Lesson_3.level_1_intern;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
 class Robot {

    String name;

    public void sayHello () {
        System.out.println("Hello!");
    }

    public Robot (String robotName) {
        this.name = robotName;
    }
    public void sayYourName () {
        System.out.println("My name is " + name);
    }






}
