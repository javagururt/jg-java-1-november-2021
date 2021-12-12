package student_andrei_karamnov.lesson_3_oop_first_look.level_4_junior;

public class BankAccount {
    String ownerFirstName;
    String ownerLastName;
    int moneyAmount;

    public BankAccount(String ownerFirstName,
                String ownerLastName,
                int money) {
        this.ownerFirstName = ownerFirstName;
        this.ownerLastName = ownerLastName;
        this.moneyAmount = money;
    }

    String getOwnerFirstName(){
        return this.ownerFirstName;
    }

    String getOwnerLastName() {
        return this.ownerFirstName;
    }

    int getMoneyAmount() {
        return this.moneyAmount;
    }

}

