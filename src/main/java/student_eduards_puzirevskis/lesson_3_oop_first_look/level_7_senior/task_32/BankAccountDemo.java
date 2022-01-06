package student_eduards_puzirevskis.lesson_3_oop_first_look.level_7_senior.task_32;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Viktor", 10000);
        String owner = bankAccount.getOwner();
        int money = bankAccount.getMoney();
        System.out.println("Owner = " + owner);
        System.out.println("Money = " + money);
    }
}
