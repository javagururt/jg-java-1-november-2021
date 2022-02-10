package student_rolands_gudels.lesson_9_interfaces.level_1_intern;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public interface MyList {
    void justAddNew();

    // Просто добавлять в конец списка новый элемент данных
    void sort();

    // Сортировать по разным принцыпам
    void find();

    // выполнять поиск по заданному принципу
    void delete();
    // удалять заданный элемент
}
