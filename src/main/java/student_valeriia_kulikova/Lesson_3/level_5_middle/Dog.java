package student_valeriia_kulikova.Lesson_3.level_5_middle;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Dog {
    String dogName;

    public Dog (String dogName1) {
        this.dogName = dogName1;
    }

    public void Voice () {
        System.out.println(this.dogName);
        System.out.println(this.dogName);
        System.out.println(this.dogName);
    }

}
