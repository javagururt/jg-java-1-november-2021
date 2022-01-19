package student_vladislav_savickis.lesson_3_oop_first_look.level_7_senior;

class Bird {
    String birdSpecie;
    boolean birdFly;
    String flyDestination;

    Bird(String specie, boolean fly, String destination){
        this.birdSpecie = specie;
        this.birdFly = fly;
        this.flyDestination = destination;
    }

    void changeBirdStatus(boolean stillFly, String newDestination){
        this.birdFly = stillFly;
        this.flyDestination = newDestination;
    }
}
