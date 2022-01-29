package student_artyom_shvegzhda.lesson_9_interfaces.lessoncode;

import teacher.lesson_9_interfaces.lessoncode.Dancer;
import teacher.lesson_9_interfaces.lessoncode.Singer;

public interface Musician extends Dancer, Singer {

    void playMusic();

}
