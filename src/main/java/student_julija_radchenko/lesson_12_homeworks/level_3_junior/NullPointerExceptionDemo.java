package student_julija_radchenko.lesson_12_homeworks.level_3_junior;

public class NullPointerExceptionDemo {
    public static void main (String []args){

        int[] nullLength = null;
        System.out.println(nullLength.length);
    }

}

//NullPointerException - исключение,
// которое выбрасывается каждый раз,
// когда обращаешься к методу или полю объекта по ссылке, которая равна null.