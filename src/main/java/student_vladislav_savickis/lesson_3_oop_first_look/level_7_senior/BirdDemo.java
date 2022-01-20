package student_vladislav_savickis.lesson_3_oop_first_look.level_7_senior;

class BirdDemo {
    public static void main(String[] args) {
        Bird bird = new Bird("Sparrow", true, "Africa");
        System.out.println("Bird specie: " + bird.birdSpecie + "; Does bird fly: " + bird.birdFly + "; Bird destination: " + bird.flyDestination);
        bird.changeBirdStatus(false, "Bird is not flying");
        System.out.println("Bird specie: " + bird.birdSpecie + "; Does bird fly: " + bird.birdFly + "; Bird destination: " + bird.flyDestination);
    }
}
