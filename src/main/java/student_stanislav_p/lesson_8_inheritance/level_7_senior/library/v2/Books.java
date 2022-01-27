package student_stanislav_p.lesson_8_inheritance.level_7_senior.library.v2;


import java.util.Arrays;

class Books {

    private int bookIndex;
    //private Author[] bookAuthor;
    private String bookName;
    private String bookDateOfPublication;

    public Books(int bookIndex,  String bookName, String bookDateOfPublication) {
        this.bookIndex = bookIndex;
       // this.bookAuthor = bookAuthor;
        this.bookName = bookName;
        this.bookDateOfPublication = bookDateOfPublication;
    }

    private Author[] listAuthors = new Author[0];

    public void add(Author str) {
        // database.length == 0  create new DB min size 1
        Author[] newDatabase = new Author[listAuthors.length + 1];
        for (int i = 0; i < listAuthors.length; i++) {
            newDatabase[i] = listAuthors[i];
        }
        newDatabase[listAuthors.length] = str;

        listAuthors = newDatabase;
    }

    public void printInformation() {
        for (int i = 0; i < listAuthors.length; i++) {
            System.out.println(listAuthors[i]);
        }
//        System.out.println(Arrays.toString(database));
    }

    public void changeName(int userId, String name) {
        for (int i = 0; i < listAuthors.length; i++) {
            if (listAuthors[i].getAuthorIndex() == userId) {
                Author author = listAuthors[i];
                author.setAuthorName(name);
                return;
            }
        }
    }

    public Author[] getDatabase() {
        return Arrays.copyOf(listAuthors, listAuthors.length);
    }


    //=========================================
    public void setBookIndex(int bookIndex) {
        this.bookIndex = bookIndex;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setBookDateOfPublication(String bookDateOfPublication) {
        this.bookDateOfPublication = bookDateOfPublication;
    }

    public int getBookIndex() {
        return bookIndex;
    }

    public String getBookName() {
        return bookName;
    }

    public String getBookDateOfPublication() {
        return bookDateOfPublication;
    }
}
