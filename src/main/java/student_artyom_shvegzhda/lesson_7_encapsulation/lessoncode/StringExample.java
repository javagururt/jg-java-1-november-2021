package student_artyom_shvegzhda.lesson_7_encapsulation.lessoncode;

class StringExample {

    public static void main(String[] args) {
        String name1 = "Ruslan";
        String name2 = "Ruslan";
        String name3 = new String("Ruslan");

        if (name1.equals(name2)) {
            System.out.println("name1 == name2");
        }
        if (name1.equals(name3)) {
            System.out.println("name1 == name3");
        }

        for (int i = 0; i < 10000; i++) {
            Long a = Long.valueOf(i);
            Long b = Long.valueOf(i);
            if (a.equals(b)) {
                System.out.println(i);
            }
        }
    }
}
