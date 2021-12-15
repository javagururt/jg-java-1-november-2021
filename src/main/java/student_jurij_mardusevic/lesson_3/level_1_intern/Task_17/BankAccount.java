package student_jurij_mardusevic.lesson_3.level_1_intern.Task_17;

public class BankAccount {
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

