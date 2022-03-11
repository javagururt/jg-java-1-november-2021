package student_eduards_puzirevskis.lesson_12_exeptions.level_1_intern.task_5;

 class ExceptionDemo {

  public static void main(String[] args) {

   MyExeption myExeption = new MyExeption(1,"My Exception 1");
   String str = myExeption.getMessage();
   System.out.println("Exception number: \""+myExeption.getExceptionNumber()+"\". Message: " + str);
  }
}
