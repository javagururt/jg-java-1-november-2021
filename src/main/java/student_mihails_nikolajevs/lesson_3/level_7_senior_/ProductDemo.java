package student_mihails_nikolajevs.lesson_3.level_7_senior_;

public class ProductDemo {

   public static void main(String[] args){

       double regularPrice = 2200;
       double discount = 0.05;

   Product newMacbookPro = new Product("MacbookPro");
   newMacbookPro.setPrice(regularPrice, discount);
   newMacbookPro.printInformation();

   }

}
