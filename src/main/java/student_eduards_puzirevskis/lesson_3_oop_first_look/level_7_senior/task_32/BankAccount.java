package student_eduards_puzirevskis.lesson_3_oop_first_look.level_7_senior.task_32;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class BankAccount {
    String owner;
    int money;

    public BankAccount(String owner, int money) {
        this.owner = owner;
        this.money = money;
    }

    public String getOwner() {
        return owner;
    }

    public int getMoney() {
        return money;
    }
}
