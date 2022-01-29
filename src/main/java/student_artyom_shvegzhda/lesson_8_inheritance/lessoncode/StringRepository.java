package student_artyom_shvegzhda.lesson_8_inheritance.lessoncode;

class StringRepository {

    private String[] database = new String[0];

    public void add(String str) {
        // database.length == 0  create new DB min size 1
        String[] newDatabase = new String[database.length + 1];
        for (int i = 0; i < database.length; i++) {
            newDatabase[i] = database[i];
        }
        newDatabase[database.length] = str;

        database = newDatabase;
    }

    public void printInformation() {
        for (int i = 0; i < database.length; i++) {
            System.out.println(database[i]);
        }
    }
}
