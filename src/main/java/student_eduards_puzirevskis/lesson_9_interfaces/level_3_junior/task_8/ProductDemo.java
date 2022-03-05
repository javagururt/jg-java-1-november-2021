package student_eduards_puzirevskis.lesson_9_interfaces.level_3_junior.task_8;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class ProductDemo {
 public static void main(String[] args) {

  InMemoryDatabase memoryDatabase = new InMemoryDatabase();
  Product apple = new Product("Apple");
  memoryDatabase.save(apple);
  Product pear = new Product("Pear");
  memoryDatabase.save(pear);
  Product box = new Product("Box");
  memoryDatabase.save(box);
  Product pencil = new Product("Pencil");
  memoryDatabase.save(pencil);
//      Product findSomeProduct = memoryDatabase.findByTitle("Box");
//         System.out.println("Your product is " + findSomeProduct.getTitle());
//         System.out.println(memoryDatabase);
 }
}
