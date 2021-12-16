package student_andrei_karamnov.lesson_3_oop_first_look.level_4_junior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Phone {
        String model;

        public Phone(String newModel) {     //В домашнем задании написана опечатка (Book вместо Phone)
            this.model = newModel;}

        String getModel() {
            return this.model;
        }
}
