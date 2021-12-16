package student_dmitrijs_sinkevics.lesson_3.lvl_5_middle;

import teacher.annotations.CodeReview;

/*Тема: создание класса Dog.

         Создать класс собака (Dog)
         и продемонстрировать его работу с ним в программе.

         Бизнес требования:
         - У собаки должна быть кличка.
         - Кличку собаке дают в момент создания и потом ее изменить нельзя.
         - Собака должна уметь выполнять команду голос (voice()),
         при выполнении этой команды на консоль должно выводиться
         кличка собаки три раза.

         Создать отдельный класс DogDemo,
         объявить в нём main() метод и продемонстрировать
         использование класса собака (Dog).

  */
@CodeReview(approved = true)
public class Dog {
     final String dogName = "Skubidu";
     public void voice () {
         System.out.println(dogName +" "+ dogName +" "+ dogName +"!");
    }
     public Dog() {

     }

}
