package student_dmitrijs_sinkevics.lesson_5.lvl_5_middle;

public class ArrayUtil {

        public int[] createArray ( int arrayLength){
            return new int[arrayLength];
        }

    public void fillArrayWithRandomNumbers(int[] array, int min, int max) {
        for (int i=0;i< array.length;i++){
            int range=max-min+1;
            int randomInteger=((int)(Math.random()*range)+min);
            array[i]=randomInteger;
        }

    }
    }

