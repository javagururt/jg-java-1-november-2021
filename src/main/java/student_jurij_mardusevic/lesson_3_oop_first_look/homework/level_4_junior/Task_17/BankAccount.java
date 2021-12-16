package student_jurij_mardusevic.lesson_3_oop_first_look.homework.level_4_junior.Task_17;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class BankAccount {
    String ownerFirstName;
    String ownerLastName;
    int moneyAmount;

    public BankAccount(String ownerFirstName, String ownerLastName, int money) {
        this.ownerFirstName = ownerFirstName;
        this.ownerLastName = ownerLastName;
        this.moneyAmount = money;
    }

    String getOwnerFirstName(){
        return this.ownerFirstName;
    }

    String getOwnerLastName() {
        return this.ownerLastName;
    }

    int getMoneyAmount() {
        return this.moneyAmount;
    }
    }

