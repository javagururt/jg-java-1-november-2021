package teacher.lesson_9_interfaces.lessoncode;

class RockMusicianDemo {

    public static void main(String[] args) {
        Musician musician = new RockMusician();
        Singer singer = new RockMusician();
        Dancer dancer = new RockMusician();

        musician.dance();
        musician.sing();

        singer.sing();

        Singer[] singers = {
                new RockMusician()
        };
        singers[0].sing();

        RockMusician[] rockMusicians = {
                new RockMusician()
        };

        RockMusicianService service = new RockMusicianService();
        service.singAll(rockMusicians);
    }
}
