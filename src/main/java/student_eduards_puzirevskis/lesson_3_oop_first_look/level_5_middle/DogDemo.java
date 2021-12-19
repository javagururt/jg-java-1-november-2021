package student_eduards_puzirevskis.lesson_3_oop_first_look.level_5_middle;

 class DogDemo {

    public static void main(String[] args) {

        Dog Rex = new Dog("Rex");
        Dog Bim = new Dog("Bim", 2);
        Rex.voice();
        System.out.println("");
        Bim.voiceWithNameAndAge();
        System.out.println("");
        Bim.happyBirthday();
        System.out.println("");
        Bim.voiceWithNameAndNewAge();
        System.out.println("");
        Dog Muha = new Dog("Muha", 3, "Black");
        Muha.voiceWithNameAgeColor();
        System.out.println("");
        Muha.changeColor();
        System.out.println("");
        Muha.voiceWithNameAgeColor();

    }
}
