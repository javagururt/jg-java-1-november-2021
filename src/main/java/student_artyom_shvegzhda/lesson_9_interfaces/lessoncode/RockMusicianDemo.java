package student_artyom_shvegzhda.lesson_9_interfaces.lessoncode;

import teacher.lesson_9_interfaces.lessoncode.*;
import teacher.lesson_9_interfaces.lessoncode.Dancer;
import teacher.lesson_9_interfaces.lessoncode.Musician;
import teacher.lesson_9_interfaces.lessoncode.RockMusician;
import teacher.lesson_9_interfaces.lessoncode.Singer;

class RockMusicianDemo {

    public static void main(String[] args) {
        Musician musician = new teacher.lesson_9_interfaces.lessoncode.RockMusician();
        teacher.lesson_9_interfaces.lessoncode.Singer singer = new teacher.lesson_9_interfaces.lessoncode.RockMusician();
        Dancer dancer = new teacher.lesson_9_interfaces.lessoncode.RockMusician();

        musician.dance();
        musician.sing();

        singer.sing();

        Singer[] singers = {
                new teacher.lesson_9_interfaces.lessoncode.RockMusician()
        };
        singers[0].sing();

        teacher.lesson_9_interfaces.lessoncode.RockMusician[] rockMusicians = {
                new teacher.lesson_9_interfaces.lessoncode.RockMusician()
        };

        RockMusicianService service = new RockMusicianService();
        service.singAll(rockMusicians);
    }
}
