package student_andrei_karamnov.lesson_9_interfaces.homework.level_1_intern;
/*Создаём интерфейс для структуры данных список.

Массив в Java это хорошая структура данных для хранения примитивных типов данных
или ссылок на объекты. Но у массива есть много ограничений. Например длинну массива
нельзя изменить после его создания.

В этом задании предлагается создать интерфейс для структуры данных список.
Структура данных список - это тот же массив, только без ограничений!
Придумайте каких операций вам не хватает в массиве. Для каждой операции
создайте свой метод в интерфейсе MyList и опишите словами, что этот метод должен
делать в коментарии к методу.

Не подсматривайте имплементацию java.util.List и тому подобных интерфейсов и классов.

Цель этого задания самостоятельно разработать свой интерфейс MyList.*/
public interface MyList {

    void addElement();

    void deleteElement();

    void editElementByIndex();

    String getElementByIndex();

    void sortList();

    String [] getList();








}
