package student_eduards_puzirevskis.lesson_12_exeptions.level_1_intern.task_5;

 class MyExeption extends Exception {

  private final int exceptionNumber;

  MyExeption(int exceptionNumber,String message) {
   super(message);
   this.exceptionNumber = exceptionNumber;
  }

  public int getExceptionNumber() {
   return exceptionNumber;
  }
 }
