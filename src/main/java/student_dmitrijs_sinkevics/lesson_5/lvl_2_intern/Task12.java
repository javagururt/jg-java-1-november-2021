package student_dmitrijs_sinkevics.lesson_5.lvl_2_intern;

public class Task12 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        for (int i=0;i< numbers.length;i++){
            numbers[i]=((int)(Math.random()*11)-5);
            System.out.println(numbers[i]);
        }
    }
}
