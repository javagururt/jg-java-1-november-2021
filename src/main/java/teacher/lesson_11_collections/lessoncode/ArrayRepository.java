package teacher.lesson_11_collections.lessoncode;

class ArrayRepository implements StringRepository {

    private String[] database = new String[0];

    @Override
    public void save(String text) {
        //...
        database[0] = text;
    }
}
