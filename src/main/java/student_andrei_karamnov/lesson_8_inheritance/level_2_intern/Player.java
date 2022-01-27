package student_andrei_karamnov.lesson_8_inheritance.level_2_intern;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Player {

    protected String name;

    Player(String name) {
        this.name = name;
    }
}

class ComputerPlayer extends Player {

    protected String userName;

    public ComputerPlayer(String name, String userNAme) {
        super(name);
        this.userName = userNAme;
    }
}

class ComputerPlayerDemo {
        public static void main(String[] args) {
            ComputerPlayer user = new ComputerPlayer("Andrei", "Unreal");
            System.out.println("Player username: " + user.userName);
        }
    }

