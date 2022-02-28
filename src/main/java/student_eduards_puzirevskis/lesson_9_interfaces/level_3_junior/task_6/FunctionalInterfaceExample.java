package student_eduards_puzirevskis.lesson_9_interfaces.level_3_junior.task_6;

 @FunctionalInterface
  interface FunctionalInterfaceExample {

     void method();

     default int defaultMethod() {
         return 0;
     }

     /*
     Функциональный интерфейс это интерфейс у которого только один абстрактный метод.
     Функциональный интерфейс может содержать любое количество методов по умолчанию или статических методов.
     Аннотация @FunctionalInterface сгенерит ошибку, если интерфейс не является функциональным.
     /*

      */
     int hashCode();
      /*
     Так же функциональный интерфейс может иметь методы класса Object
      */


}
