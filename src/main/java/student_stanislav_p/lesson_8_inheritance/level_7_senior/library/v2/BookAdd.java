package student_stanislav_p.lesson_8_inheritance.level_7_senior.library.v2;

import java.util.Arrays;

class BookAdd {

    private Books[] listOfBooks = new Books[0];

    public void add(Books str) {
        // database.length == 0  create new DB min size 1
        Books[] newDatabase = new Books[listOfBooks.length + 1];
        for (int i = 0; i < listOfBooks.length; i++) {
            newDatabase[i] =listOfBooks[i];
        }
        newDatabase[listOfBooks.length] = str;

        listOfBooks = newDatabase;
    }

    public void printInformation() {
        for (int i = 0; i < listOfBooks.length; i++) {
            System.out.println(listOfBooks[i]);
        }
//        System.out.println(Arrays.toString(database));
    }

    public void changeName(int userId, String name) {
        for (int i = 0; i < listOfBooks.length; i++) {
            if (listOfBooks[i].getBookIndex() == userId) {
                Books book = listOfBooks[i];
                book.setBookName(name);
                return;
            }
        }
    }

    public Books[] getDatabase() {
        return Arrays.copyOf(listOfBooks, listOfBooks.length);
    }
}
