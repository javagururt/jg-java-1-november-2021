package student_stanislav_p.lesson_12_exceptions.homework.level_5_middle.internetshop;

import student_stanislav_p.lesson_12_exceptions.homework.level_5_middle.internetshop.product.Product;
import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class MachesTest {


    public static void main(String[] args) {

        Product product1 = new Product(null, 1, "descrip АЫЫАtion");
        Product product2 = new Product("ad", 1, "description");
        Product product3 = new Product("AbcdefghijklmnopqrstuvwxyzAbcdefghijklmnopqrstuvwxyzAbcdefghijklmnopqrstuvwxyzAbcdefghijklmnopqrstuvwxyz", 1, "description");
        Product product4 = new Product("Abcdабв", 1, "description");


        printProduct(product1);
        printProduct(product2);
        printProduct(product3);
        printProduct(product4);

        System.out.println( !product1.getDescription().matches("[a-zA-Z]+"));
        System.out.println( !product2.getDescription().matches("[a-zA-Z]+"));
        System.out.println( !product3.getDescription().matches("[a-zA-Z]+"));
        System.out.println( !product4.getDescription().matches("[a-zA-Z]+"));

        System.out.println( !product2.getTitle().matches("[a-zA-Z]+"));
        System.out.println( !product3.getTitle().matches("[a-zA-Z]+"));
        System.out.println( !product4.getTitle().matches("[a-zA-Z]+"));






    }

     static void printProduct (Product product){
         System.out.println("Product -------");
         if (product.getTitle()!=null) {System.out.println(product.getTitle());} else System.out.println("null");
         if (product.getTitle()!=null) {System.out.println(product.getTitle().length());} else System.out.println("null");
         System.out.println(product.getPrice());

         if (product.getDescription()!=null) {System.out.println(product.getDescription());} else System.out.println("null");

         if (product.getDescription()!=null) {System.out.println(product.getDescription().length());} else System.out.println("null");





     }

  }