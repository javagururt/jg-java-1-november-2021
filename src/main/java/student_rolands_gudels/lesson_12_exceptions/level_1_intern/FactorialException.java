package student_rolands_gudels.lesson_12_exceptions.level_1_intern;

    public class FactorialException extends Exception {
        private int number;
        public int getNumber(){return number;}
        public FactorialException(String message, int num){

            super(message);
            number=num;
        }
    }

