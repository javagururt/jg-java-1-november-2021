package student_ruslans_tufetulovs.questions2;


public class CatalogDemo {


        public static void main(String[] args) {

            Book listOfBook = new Book(0, "", "");

            listOfBook.add(new Author(1, "Ruslan1"));
            listOfBook.add(new Author(2, "Ruslan2"));
            listOfBook.add(new Author(3, "Ruslan3"));
            listOfBook.add(new Author(4, "Ruslan4"));
            listOfBook.add(new Author(5, "Ruslan5"));
            listOfBook.add(new Author(6, "Ruslan6"));
            listOfBook.add(new Author(7, "Ruslan7"));

            listOfBook.printInformation();

            listOfBook.changeName(2, "Petr");
            System.out.println("=====");
            listOfBook.printInformation();



        }


}
