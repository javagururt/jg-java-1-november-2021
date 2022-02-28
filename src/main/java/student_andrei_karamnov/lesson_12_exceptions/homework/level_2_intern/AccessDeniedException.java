package student_andrei_karamnov.lesson_12_exceptions.homework.level_2_intern;

public class AccessDeniedException extends Exception{

    public AccessDeniedException (String message){
        super(message);
    }
    /*Почему класс AccessDeniedException в нашем случае
лучше наследовать от Exception, а не от RuntimeException?*/

    /*Наследуемся от Exception т.к. мы можем ожидать получние данного исключения и делаем на него проверку.
     RuntimeException - является непроверяемым исключением, которое может появится в следствии "незапланированной"
     ошибки программиста.*/
}
