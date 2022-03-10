package student_mihails_nikolajevs.lesson_8.level_2_intern_;

import teacher.annotations.CodeReview;

/*
Исправьте код программы так, что бы он компилировался.
Изменения можно вносить только в код конструктора класса HumanPlayer.

class Player {

    private String name;

    Player(String name) {
        this.name = name;
    }

}

class HumanPlayer extends Player {

    HumanPlayer(String name) {

    }

}
 */
@CodeReview(approved = true)
public class Player {

    private String name;

    Player(String name) {
        this.name = name;
    }

    class HumanPlayer extends Player {

       public HumanPlayer(String name) {
            super(name);

       }
    }

}
