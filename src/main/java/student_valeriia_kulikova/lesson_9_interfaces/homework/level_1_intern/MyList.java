package student_valeriia_kulikova.lesson_9_interfaces.homework.level_1_intern;

public interface MyList {

    void AddElementToBegining(); //Добавление элемента в начало списка, сдвигая последующие строки на 1
    void AddElementToEnd();     //Добавление элемента в конец списка
    void AddElementBetween();   //Добавление элемента между элементами Х и У
    void DeleteFirstElement();  //Удаление первого элемента, сдвигая последующие строки на 1 влево
    void DeleteLastElement();   //Удаление последнего элемента
    void DeleteElementsBetween();//Удаление элемента между элементами Х и У

}
