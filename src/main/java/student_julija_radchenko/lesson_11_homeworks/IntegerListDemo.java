package student_julija_radchenko.lesson_11_homeworks;

import java.util.ArrayList;
import java.util.List;

public class IntegerListDemo {
    public static void main (String [] args){
        List<Integer> demoList = new ArrayList<>();
demoList.add(5);
demoList.add(10);
demoList.add(15);
demoList.add(20);
demoList.add(1,3);
System.out.println("Current list size"+ demoList.size());

demoList.remove(2);
demoList.remove(Integer.valueOf(5));

System.out.println("Current list size"+ demoList.size());
System.out.println("Is list empty ? " + demoList.isEmpty());



for (Integer listItem : demoList) {
    System.out.println("List items : " + listItem);
}

    }
}
