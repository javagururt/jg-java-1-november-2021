package student_eduards_puzirevskis.lesson_11_collections.level_3_4_junior_5_6_middle.ui;

import student_eduards_puzirevskis.lesson_11_collections.level_3_4_junior_5_6_middle.BookDatabase;

import java.util.Scanner;

class FindByIdUIAction implements UIAction {

  private BookDatabase bookDatabase;

  public FindByIdUIAction(BookDatabase bookDatabase) {
   this.bookDatabase = bookDatabase;
  }

  @Override
  public void execute() {

   System.out.println("Please, enter Book ID, which You want to find.");
   Scanner scanner = new Scanner(System.in);
   Long idToFind = scanner.nextLong();
   System.out.println(bookDatabase.findById(idToFind));

  }
 }
