package student_stanislav_p.lesson_8_inheritance.homework.level_2_intern;

/* Внесите изменения в код программы так,
        чтобы можно было создать экземпляр класса ComputerPlayer.

        Класс ComputerPlayer должен наследоваться от класса Player.
        Изменения в код можно вносить только в класс ComputerPlayer.

        Продемонстрируйте создание инстанции класса ComputerPlayer
        создав класс ComputerPlayerDemo и объявив в нём main() метод.

 */


class ComputerPlayer extends Player {

    ComputerPlayer(String name) {
        super(name);

    }

}

class ComputerPlayerDemo {
    public static void main(String[] args) {
        ComputerPlayer newPlayer = new ComputerPlayer("Bill");
        System.out.println("Player name ->"+ newPlayer.getName());
    }
}


