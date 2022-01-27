package student_julija_radchenko.lesson_8_homeworks;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Task_7 {
    class Player {

        private String name;

        Player(String name) {
            this.name = name;
        }

    }

    class HumanPlayer extends Player {

        HumanPlayer(String name) {
            super(name);

        }

    }
}
