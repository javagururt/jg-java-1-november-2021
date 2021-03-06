package student_eduards_puzirevskis.lesson_11_collections.level_1_intern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Task_1 {

  /*
  Какие реализации интерфейса java.util.List вы знаете?
Напишите программу, которая демонстрирует создание разных списков.
PS: чем они отличаются друг от друга?
   */

    List<String> myArrayList = new ArrayList<>();

  /*
  Коллекция, которая наследует свою функциональность от класса AbstractList и применяет интерфейс List.
  Проще говоря, ArrayList представляет простой список,
  аналогичный массиву, за тем исключением, что количество элементов в нем не фиксировано.
  Быстрый в доступе, но долго добавляет/удаляет элементы из него
  Разрешает хранить дубликаты
   */

    List<String> stringListLinked = new LinkedList<>();
 /*
 LinkedList — реализует интерфейс List. Является представителем двунаправленного списка,
  где каждый элемент структуры содержит указатели на предыдущий и следующий элементы.
  Итератор поддерживает обход в обе стороны. Реализует методы получения,
   удаления и вставки в начало, середину и конец списка.
   Позволяет добавлять любые элементы в том числе и null.
   Разрешает хранить дубликаты
   Медленне в доступе, чем ArrayList, но быстрее добавляет/удаляет элементы
  */

    Map<String,Integer> hashmap = new HashMap<>();
 /*
 HashMap позволяет хранить пары ключей и значений (key & value). Ключи не могут быть продублированы.
 По сути, это смесь ArrayList и LinkedList. Данные хранятся в корзинах, которые имеют тип
 ArrayList. Каждая корзина содержит LinkedList.
 Данные можно получить по ключу
  */

    Set<String> hashSet = new HashSet<>();
 /*
 HashSet в своей основе имеет HaspMap.
 Хранит только уникальные значения
 Порядок добавления элементов вычисляется с помощью хэш-кода
   */
}
