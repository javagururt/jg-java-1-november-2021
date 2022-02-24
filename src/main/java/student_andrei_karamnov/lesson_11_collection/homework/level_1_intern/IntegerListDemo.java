package student_andrei_karamnov.lesson_11_collection.homework.level_1_intern;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import teacher.annotations.CodeReview;

/*Продемонстрируйте как:
- добавить в список элемент (в начало и в конец)
- узнать длину списка
- удалить элемент из списка (по интексу и без)
- узнать пустой список или нет
- обойти список и вывести на консоль каждый элемент.*/
@CodeReview(approved = true)
class IntegerListDemo {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        Random random = new Random();
        for (int index = 0; index < 10; index++) {
            integerList.add(index, random.nextInt(10));
        }
        System.out.println("Array list: " + integerList);
        integerList.add(0, 5); //adding number 5 at the beginning of list
        integerList.add(integerList.size(), 5); //adding number 5 at the end of list
        System.out.println("Result list after changing: " + integerList);
        System.out.println("List size: " + integerList.size()); //getting list size
        integerList.remove(3); //removing fourth element by index 3
        System.out.println("Result list after deleting value of index 3: " + integerList);
        int number = 4;
        boolean emp = integerList.isEmpty();//getting info about list, is it empty?
        if(emp == true){
            System.out.println("The list is empty");
        }else {
            System.out.println("The list is not empty");
        }
            System.out.println("Every value in the list: "); //iterating list and printing every value to console
        for (int i = 0; i < integerList.size(); i++) {
            System.out.println("Index " + i + " ---- number: " + integerList.get(i));

        }
    }


}
