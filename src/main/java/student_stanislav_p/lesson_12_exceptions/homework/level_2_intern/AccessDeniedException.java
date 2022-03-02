package student_stanislav_p.lesson_12_exceptions.homework.level_2_intern;

class AccessDeniedException extends Exception {

        private boolean detail;

        public AccessDeniedException(boolean detail, String message) {
            super(message);
            this.detail = detail;
        }

        @Override
        public String toString() {
            return "MyException{"
                    + "detail=" + detail
                    + ", message=" + getMessage()
                    + "} ";
        }

}