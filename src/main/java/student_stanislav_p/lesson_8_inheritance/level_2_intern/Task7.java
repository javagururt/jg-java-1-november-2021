package student_stanislav_p.lesson_8_inheritance.level_2_intern;

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

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class HumanPlayer extends Player {

    HumanPlayer(String name) {
        super(name);

    }

}

public class Task7 {

    public static void main(String[] args) {
        // продемонстрируйте создание инстанции класса

        HumanPlayer newPlayer = new HumanPlayer("John");
        System.out.println("Player name ->"+ newPlayer.getName());

    }

}
