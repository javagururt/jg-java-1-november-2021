package student_andrei_karamnov.lesson_3_oop_first_look.level_7_senior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class BankAccount{

    String owner;
    int money;

    BankAccount(String ownerFirstName,int moneyAmount) {
        this.owner = ownerFirstName;
        this.money = moneyAmount;

    }

    String getOwner() {
        return this.owner;
    }

    int getMoney() {
        return this.money;
    }

}

