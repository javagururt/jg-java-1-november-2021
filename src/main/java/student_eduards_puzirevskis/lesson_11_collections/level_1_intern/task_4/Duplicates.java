package student_eduards_puzirevskis.lesson_11_collections.level_1_intern.task_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Duplicates {
    public static void main(String[] args) {

        Map<String, Integer> hashmap = new HashMap<>();
        String[] array = {"Pen", "Pencil", "Pen"};
        List<String> myArrayList = new ArrayList<>(Arrays.asList(array));
        List<String> linkedList = new LinkedList<>(Arrays.asList(array));
        Set<String> hashSet = new HashSet<>(Arrays.asList(array));
        for (int i = 0; i < array.length; i++) {
            hashmap.put(array[i], i);
        }
        System.out.println("My Array List: " + myArrayList);
        System.out.println("My Linked List: " + linkedList);
        System.out.println("My HashSet: " + hashSet);
        System.out.println("My HashMap: " + hashmap);
    }
}
