package student_rolands_gudels.lesson_6_arrays_while_loop.level_3_junior;

public class ArrayService {

        public boolean findNeededArrayNumber (int[] array, int numberThatNeedToFind){
            int count = 0;
            boolean b = false;
            for (int i = 0; i < array.length; i++) {
                if (array[i]==numberThatNeedToFind) {count=count+1;}
            } if (count>0) { b=true;}
            return b;
        }
        }


