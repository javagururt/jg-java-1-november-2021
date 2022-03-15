package student_julija_radchenko.lesson_12_homeworks.level_1_intern.task_5;

public class ExceptionDemo extends Exception{

public ExceptionDemo(){}

    public ExceptionDemo(String message){
    super(message);
    }
public ExceptionDemo(String message, Throwable cause){
    super (message);
}
public static void main(String []args){
    ExceptionDemo except1 = new ExceptionDemo();
    ExceptionDemo except2 = new ExceptionDemo("Checked Exception!");
    ExceptionDemo except3 = new ExceptionDemo("Checked Exception!", null);
}
}
