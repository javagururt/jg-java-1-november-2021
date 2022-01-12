package student_dmitrijs_sinkevics.lesson_5.lvl_4_junior;

public class Task28 {
    public static void main(String[] args) {
        int[] numbers=new int[10];
        for (int i=0;i< numbers.length;i++){
            numbers[i]=((int)(Math.random()*41)-20); ;
        }

        for (int number : numbers)
            System.out.println(number);

        int min=numbers[0];
        for (int i=1;i< numbers.length;i++){
            if (min>numbers[i])
                min=numbers[i];
        }
        System.out.println("Min= "+min);
    }
}

