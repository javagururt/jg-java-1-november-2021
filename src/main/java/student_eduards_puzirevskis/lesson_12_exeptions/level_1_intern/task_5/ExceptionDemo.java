package student_eduards_puzirevskis.lesson_12_exeptions.level_1_intern.task_5;

 class ExceptionDemo {

  public static void main(String[] args) {

   MyExсeption myExсeption = new MyExсeption(1,"My Exception 1");
   String str = myExсeption.getMessage();
   System.out.println("Exception number: \""+ myExсeption.getExceptionNumber()+"\". Message: " + str);
  }
}
