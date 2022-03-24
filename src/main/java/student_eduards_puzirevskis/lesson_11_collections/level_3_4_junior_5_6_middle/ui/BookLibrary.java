package student_eduards_puzirevskis.lesson_11_collections.level_3_4_junior_5_6_middle.ui;

import student_eduards_puzirevskis.lesson_11_collections.level_3_4_junior_5_6_middle.BookDatabase;
import student_eduards_puzirevskis.lesson_11_collections.level_3_4_junior_5_6_middle.BookDatabaseImpl;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class BookLibrary {

     private Map<Integer, UIAction> menuNumberToActionMap;

     public BookLibrary() {
         BookDatabase bookDatabase = new BookDatabaseImpl();

         menuNumberToActionMap = new HashMap();
         menuNumberToActionMap.put(1, new SaveBookUIAction(bookDatabase));
         menuNumberToActionMap.put(2, new FindByIdUIAction(bookDatabase));
         menuNumberToActionMap.put(3, new FindByAuthorUIAction(bookDatabase));
         menuNumberToActionMap.put(4, new FindByTitleUIAction(bookDatabase));
         menuNumberToActionMap.put(5, new DeleteByIdUIAction(bookDatabase));
     }

     public void run() {
         Scanner sc = new Scanner(System.in);

         while (true) {
             System.out.println("=================");
             System.out.println("Please enter menu number: ");
             System.out.println("To Save book type 1.");
             System.out.println("To find book by ID type 2.");
             System.out.println("To find book by Author type 3.");
             System.out.println("To find book by Title type 4.");
             System.out.println("To find book by ID type 5.");
             System.out.println("To exit type 0.");
             int userSelectedMenuNumber = Integer.parseInt(sc.nextLine());
             if (userSelectedMenuNumber == 0) {
                 System.out.println("Thank you! Good by!");
                 break;
             } else {
                 executeUIAction(userSelectedMenuNumber);
             }
         }
     }

     private void executeUIAction(int userSelectedMenuNumber) {
         UIAction uiAction = menuNumberToActionMap.get(userSelectedMenuNumber);
         if (uiAction != null) {
             uiAction.execute();
         } else {
             System.out.println("Menu item not exist: " + userSelectedMenuNumber);
         }
     }


 }
