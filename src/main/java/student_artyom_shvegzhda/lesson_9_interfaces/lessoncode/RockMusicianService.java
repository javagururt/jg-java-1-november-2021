package student_artyom_shvegzhda.lesson_9_interfaces.lessoncode;

import teacher.lesson_9_interfaces.lessoncode.RockMusician;

class RockMusicianService {

    public void singAll(teacher.lesson_9_interfaces.lessoncode.RockMusician[] rockMusicians) {
        for (int i = 0; i < rockMusicians.length; i++) {
            rockMusicians[i].sing();
        }
    }


}
