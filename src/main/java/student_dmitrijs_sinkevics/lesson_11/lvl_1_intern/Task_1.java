package student_dmitrijs_sinkevics.lesson_11.lvl_1_intern;


import java.util.ArrayList; // на основе массива
import java.util.LinkedList; // на основе двусвязного списка
import java.util.List;

public class Task_1 {
    public static void main(String[] args) {

        List<Integer> listOne = new ArrayList<>();
        List<Integer> listTwo = new LinkedList<>();

        listOne.add(10);
        listOne.add(11);
        listOne.add(12);
        System.out.println(listOne);

        listTwo.add(10);
        listTwo.add(11);
        listTwo.add(12);
        System.out.println(listTwo);

    }
}
