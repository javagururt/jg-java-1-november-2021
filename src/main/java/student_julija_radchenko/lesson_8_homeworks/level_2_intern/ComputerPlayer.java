package student_julija_radchenko.lesson_8_homeworks.level_2_intern;


import teacher.annotations.CodeReview;

class ComputerPlayer extends Player {
    ComputerPlayer(String name) {
        super(name);
    }
}

@CodeReview(approved = true)
class ComputerPlayerDemo {
    public static void main(String[] args) {
        ComputerPlayer player = new ComputerPlayer("Vasja");

    }
}