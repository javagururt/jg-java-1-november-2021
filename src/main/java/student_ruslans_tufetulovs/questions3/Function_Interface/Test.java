package student_ruslans_tufetulovs.questions3.Function_Interface;


@FunctionalInterface
interface functionalInterface{
    abstract public void abstractMethod();
}

class Test implements functionalInterface{
    @Override
    public void abstractMethod(){
        System.out.println("Функциональные интерфейсы в Java");
    }
}