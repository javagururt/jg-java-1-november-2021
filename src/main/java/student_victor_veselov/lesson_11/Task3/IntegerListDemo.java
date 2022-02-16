package student_victor_veselov.lesson_11.Task3;

import java.util.ArrayList;
import java.util.List;

public class IntegerListDemo {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(10);
        integers.add(0,1448);
        integers.add(1337);
        System.out.println("List size .. " +" "+integers.size());
        System.out.println("Now we remove all buckets");
        integers.clear();
        System.out.println("List size .. " +" "+integers.size());
        System.out.println("List is Empty ? .." + " " +integers.isEmpty());
        integers.add(0,1337);
        integers.add(1,1448);
        integers.add(2,1488);
        integers.add(3,7331);
        for(int list : integers){
            System.out.print(list + " ");
        }

    }

}
