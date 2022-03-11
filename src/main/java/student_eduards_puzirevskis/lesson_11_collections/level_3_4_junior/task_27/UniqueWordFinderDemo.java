package student_eduards_puzirevskis.lesson_11_collections.level_3_4_junior.task_27;

 class UniqueWordFinderDemo {

     public static void main(String[] args) {

         UniqueWordFinder wordFinder = new UniqueWordFinder();
         String text = wordFinder.getText();
         System.out.println("Nice. Unique words in your text are: " + wordFinder.find(text));
     }

}
