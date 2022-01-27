package student_rolands_gudels.lesson_8_inheritance.level_2_intern;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Task_8 {
/*    Внесите изменения в код программы так,
    чтобы можно было создать экземпляр класса ComputerPlayer.

    Класс ComputerPlayer должен наследоваться от класса Player.
    Изменения в код можно вносить только в класс ComputerPlayer.

    Продемонстрируйте создание инстанции класса ComputerPlayer
    создав класс ComputerPlayerDemo и объявив в нём main() метод.*/

    class Player {

        private String name;

        Player(String name) {
            this.name = name;
        }

    }

    class ComputerPlayer extends Player {

        ComputerPlayer(String name) {
            super(name);
        }
    }
}
