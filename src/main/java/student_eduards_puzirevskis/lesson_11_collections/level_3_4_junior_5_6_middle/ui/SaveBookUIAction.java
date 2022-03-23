package student_eduards_puzirevskis.lesson_11_collections.level_3_4_junior_5_6_middle.ui;

import student_eduards_puzirevskis.lesson_11_collections.level_3_4_junior_5_6_middle.Book;
import student_eduards_puzirevskis.lesson_11_collections.level_3_4_junior_5_6_middle.BookDatabase;

import java.util.Scanner;

class SaveBookUIAction implements UIAction {

  private BookDatabase bookDatabase;

  public SaveBookUIAction(BookDatabase bookDatabase) {
   this.bookDatabase = bookDatabase;
  }

  @Override
  public void execute() {
   System.out.println("PLease, enter book Author: ");
   Scanner scanner = new Scanner(System.in);
   String userAuthor = scanner.nextLine();
   System.out.println("Please, enter book Title: ");
   String userTitle = scanner.nextLine();
   System.out.println("Please, enter book Year of Issue: ");
   int userYear = scanner.nextInt();
   Book userBook = new Book(userTitle,userAuthor,userYear);
   bookDatabase.save(userBook);
  }
 }
