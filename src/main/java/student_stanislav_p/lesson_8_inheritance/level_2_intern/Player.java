package student_stanislav_p.lesson_8_inheritance.level_2_intern;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Player {

    private String name;

    Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}