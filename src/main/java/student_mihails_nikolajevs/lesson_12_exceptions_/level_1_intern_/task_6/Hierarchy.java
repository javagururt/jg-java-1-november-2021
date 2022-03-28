package student_mihails_nikolajevs.lesson_12_exceptions_.level_1_intern_.task_6;

/*
оспользуйтесь документацией Java (javadoc)
и найдите информацию о иерархии наследования класса java.lang.RuntimeException.
 */
public class Hierarchy {

    //   Class java.lang.RuntimeException

//       java.lang.Object
//       java.lang.Throwable
//       java.lang.Exception

    class Throwable extends Object {

    }

    class Exception extends java.lang.Throwable{

    }

    class RuntimeException extends java.lang.Exception{

    }

}