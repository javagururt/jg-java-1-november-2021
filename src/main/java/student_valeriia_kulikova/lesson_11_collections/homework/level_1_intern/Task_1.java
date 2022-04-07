package student_valeriia_kulikova.lesson_11_collections.homework.level_1_intern;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(comment = "константы создаются таким образом:" +
        "public static int MAX_COUNT_ELEMENTS = 10;")
public class Task_1 {


    static final int maxCountElements = 10;


    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < maxCountElements; i++) {
            list1.add(i);
        }
        System.out.println("The numbers of elements in the first list: " + list1.size());
        list1.set(1,15);
        list1.set(2,33);
        list1.set(3,25);
        System.out.println("Elements of the first list: ");
        printList(list1);

        List <Integer> list2 = new LinkedList<>();
        list2.add(0,25);
        list2.add(1,3);
        list2.add(2,15);
        System.out.println("The numbers of elements in the second list: " + list2.size());
        System.out.println("Elements of the second list: ");
        printList(list2);


    }

    @CodeReviewComment(comment = "указывайте generics List<????> list")
    private static void printList(List list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(" " + list.get(i));
        }
        System.out.println();
    }


}
