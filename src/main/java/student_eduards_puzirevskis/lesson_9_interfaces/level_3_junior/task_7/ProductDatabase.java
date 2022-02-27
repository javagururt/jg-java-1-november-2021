package student_eduards_puzirevskis.lesson_9_interfaces.level_3_junior.task_7;

//@FunctionalInterface

 interface ProductDatabase {

  void save(Product product);

  Product findByTitle(String productTitle);

  /*
  Данный интерфейс не является функциональным, т.к содержит 2 абстрактных метода.
  Ни один из них не является методом класса Object, что противоречит понятию о функциональных интерфейсахю
  Аннотация @FunctionalInterface может это продемонстрировать
   */

}
