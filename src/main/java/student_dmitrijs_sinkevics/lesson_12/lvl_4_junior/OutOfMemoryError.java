package student_dmitrijs_sinkevics.lesson_12.lvl_4_junior;

import java.util.ArrayList;

public class OutOfMemoryError {

    public static void main(String[] args){
        ArrayList arrayList = new ArrayList<>();
        for (int i = 0; i < 1000000000; i++) {
            arrayList.add("Out of memory");
        }
    }
}
