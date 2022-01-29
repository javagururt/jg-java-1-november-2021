package student_artyom_shvegzhda.lesson_9_interfaces.lessoncode;

import teacher.lesson_9_interfaces.lessoncode.RockMusician;
import teacher.lesson_9_interfaces.lessoncode.Singer;

class SingerService {

    public Singer createSinger() {
        return new teacher.lesson_9_interfaces.lessoncode.RockMusician();
    }
}
