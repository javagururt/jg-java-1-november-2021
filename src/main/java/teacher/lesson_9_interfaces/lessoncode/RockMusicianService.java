package teacher.lesson_9_interfaces.lessoncode;

class RockMusicianService {

    public void singAll(RockMusician[] rockMusicians) {
        for (int i = 0; i < rockMusicians.length; i++) {
            rockMusicians[i].sing();
        }
    }


}
