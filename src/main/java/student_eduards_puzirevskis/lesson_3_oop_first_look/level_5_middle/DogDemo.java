package student_eduards_puzirevskis.lesson_3_oop_first_look.level_5_middle;

 class DogDemo {

    public static void main(String[] args) {

        Dog Rex = new Dog("Rex");
        Dog Bim = new Dog("Bim", 2);
        Rex.voice1();
        System.out.println("");
        Bim.voice2();
        System.out.println("");
        Bim.happyBirthday();
        System.out.println("");
        System.out.println("Oh, look's like Bim had a Birthday!!!");
        Bim.voice3();
        System.out.println("");
        Dog Muha = new Dog("Muha", 3, "Black");
        Muha.voice4();
        System.out.println("");
        Muha.changeColor("White");
        System.out.println("Look's like it's not a dog, but a chameleon");
        System.out.println("");
        Muha.voice4();
    }
}
