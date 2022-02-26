package student_valeriia_kulikova.lesson_7_encapsulation.homework.level_6_middle;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class ArrayCopy {
    int[] copyInRange(int[] in, int numberFrom, int numberTo) {
        int count=0;
        for (int i = 0; i < in.length; i++) {
            if (in[i] >= numberFrom && in[i] <= numberTo) {
                count++;
            }
        }
        int [] newIn = new int[count];
        count = 0;
        for (int i = 0; i < in.length; i++) {
            if (in[i] >= numberFrom && in[i] <= numberTo){
                newIn [count] = in [i];
                count++;
            }
        }
        return newIn;
    }
}

