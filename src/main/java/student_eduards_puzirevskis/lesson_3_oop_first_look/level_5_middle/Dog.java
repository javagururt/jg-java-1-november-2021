package student_eduards_puzirevskis.lesson_3_oop_first_look.level_5_middle;
/*
Тема: создание класса Dog.

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
class Dog {
   public String name;
   public int age;

   public Dog(String dogName, int dogAge){

       this.name = dogName;
       this.age = dogAge;
       if (dogAge < 1 ) {
           System.out.println("Dog age can't be negative");
       }

   }
   public void voice() {
       System.out.println(this.name+ " ! " + this.name + " ! " + this.name + " ! ");
   }
}
