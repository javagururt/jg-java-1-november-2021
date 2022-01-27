package student_stanislav_p.lesson_8_inheritance.level_1_intern;

import teacher.annotations.CodeReview;

/*
Какие значения принимают свойства класса по умолчанию
(ссылки на объекты и примитивные типы данных)
при вызове дефолтного конструктора (конструктора по умолчанию)?

Создайте класс DefaultConstructorV3:

class DefaultConstructorV3 {

    private String fullName;
    private int age;
    private boolean male;
    private Boolean female;

    // создайте get() методы для каждого свойства

}

 */
@CodeReview(approved = true)
public class DefaultConstructorV3 {

    private String fullName;
    private int age;
    private boolean male;
    private Boolean female;

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public boolean isMale() {
        return male;
    }

    public Boolean getFemale() {
        return female;
    }
}
