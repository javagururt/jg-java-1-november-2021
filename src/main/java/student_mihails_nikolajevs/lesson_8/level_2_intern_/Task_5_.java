package student_mihails_nikolajevs.lesson_8.level_2_intern_;

import teacher.annotations.CodeReview;

/*
то такое множественное наследование в программировании?

Разрешено ли множественное наследование в Java?


Исправьте код программы:

class Mother {

}

class Father {

}

class Child extends Mother, Father {

}

PS: вносить изменения можно только в объявление класса Child.
Класс Child должен явно наследоваться от одного или двух классов
(Mother и Father). Правильных решений у этой задачи два, выбирайте любое.
 */
@CodeReview(approved = true)
public class Task_5_ {

   class Mother {

   }

   class Father {

   }

   class Child extends Mother {

   }

}
