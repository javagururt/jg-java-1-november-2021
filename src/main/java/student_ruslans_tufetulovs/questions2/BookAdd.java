package student_ruslans_tufetulovs.questions2;

import java.util.Arrays;

class BookAdd {

    private Book[] listOfBooks = new Book[0];

    public void add(Book str) {
        // database.length == 0  create new DB min size 1
        Book[] newDatabase = new Book[listOfBooks.length + 1];
        for (int i = 0; i < listOfBooks.length; i++) {
            newDatabase[i] = listOfBooks[i];
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
                Book book = listOfBooks[i];
                book.setBookName(name);
                return;
            }
        }
    }

    public Book[] getDatabase() {
        return Arrays.copyOf(listOfBooks, listOfBooks.length);
    }
}
