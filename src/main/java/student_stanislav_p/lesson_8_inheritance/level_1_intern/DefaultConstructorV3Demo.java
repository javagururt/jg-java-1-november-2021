package student_stanislav_p.lesson_8_inheritance.level_1_intern;

/*
Создайте класс DefaultConstructorV3Demo, в котором
внутри main() метода продемонстрируйте ответ на поставленный
в начале задания вопрос. Для этого после вызова дефолтного
конструктора и создания инстанции класса DefaultConstructorV3
распечатайте на экран значения каждого свойства созданой
инстанции в отдельной строке. Для получения значения свойств
воспользуйтесь соответствующими get() методами.

 */

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class DefaultConstructorV3Demo {

    public static void main(String[] args) {
        DefaultConstructorV3 obj3 = new DefaultConstructorV3();

        System.out.println("Full Name is - " +obj3.getFullName());
        System.out.println("Age       is - " +obj3.getAge());
        System.out.println("Male      is - " +obj3.isMale());
        System.out.println("Female    is - " +obj3.getFemale());


    }

}
