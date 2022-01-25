package student_rolands_gudels.lesson_8_inheritance.level_2_intern;

public class Task_7 {
   /* Исправьте код программы так, что бы он компилировался.
    Изменения можно вносить только в код конструктора класса HumanPlayer.*/

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
