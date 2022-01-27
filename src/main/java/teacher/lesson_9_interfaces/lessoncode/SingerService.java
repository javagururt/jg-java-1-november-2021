package teacher.lesson_9_interfaces.lessoncode;

class SingerService {

    public Singer createSinger() {
        return new RockMusician();
    }
}
