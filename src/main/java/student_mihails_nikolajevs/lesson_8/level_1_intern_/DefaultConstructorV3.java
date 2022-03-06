package student_mihails_nikolajevs.lesson_8.level_1_intern_;
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

Создайте класс DefaultConstructorV3Demo, в котором
внутри main() метода продемонстрируйте ответ на поставленный
в начале задания вопрос. Для этого после вызова дефолтного
конструктора и создания инстанции класса DefaultConstructorV3
распечатайте на экран значения каждого свойства созданой
инстанции в отдельной строке. Для получения значения свойств
воспользуйтесь соответствующими get() методами.
 */
public class DefaultConstructorV3 {

    private String fullName;
    private int age;
    private boolean male;
    private Boolean female;

    public DefaultConstructorV3(String fullName, int age, boolean male, Boolean female) {
        this.fullName = fullName;
        this.age = age;
        this.male = male;
        this.female = female;
    }
    public String getFullName() {
        return fullName;
    }
    public int getAge() {
        return age;
    }
    public boolean isMale() {
        return male;
    }
    public boolean isFemale() {
        return female;
    }
}
