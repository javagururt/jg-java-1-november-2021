package student_rolands_gudels.lesson_3_oop_first_look.level_7_senior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class BankAccountDemo {

        public static void main(String[] args) {
            Task_32.BankAccount bankAccount = new Task_32.BankAccount("Viktor", 100000);
            String ownerFirstName = bankAccount.getOwner();
            int moneyAmount = bankAccount.getMoney();
            System.out.println("Owner = " + ownerFirstName);
            System.out.println("Money = " + moneyAmount);
        }


}
