package student_mihails_nikolajevs.lesson_8.level_2_intern_;

import teacher.annotations.CodeReview;

/*
Внесите изменения в код программы так,
чтобы можно было создать экземпляр класса ComputerPlayer.

Класс ComputerPlayer должен наследоваться от класса Player.
Изменения в код можно вносить только в класс ComputerPlayer.

Продемонстрируйте создание инстанции класса ComputerPlayer
создав класс ComputerPlayerDemo и объявив в нём main() метод.

class Player {

    private String name;

    Player(String name) {
        this.name = name;
    }

}

class ComputerPlayer {

}
 */
@CodeReview(approved = true)
public class ComputerPlayer extends Player {

    public ComputerPlayer(String name) {
        super(name);

    }
}
