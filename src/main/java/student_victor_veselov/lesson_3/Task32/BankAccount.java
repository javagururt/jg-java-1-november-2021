package student_victor_veselov.lesson_3.Task32;

class BankAccount {

    String owner;
    int money;

    public BankAccount(int moneyAmount) {
        this.money = moneyAmount;
    }

    String getOwner() {
        return this.owner;
    }

    int getMoney() {
        return this.money;
    }

}

class BankAccountDemo {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(10000);
        String owner = bankAccount.getOwner();
        int moneyAmount = bankAccount.getMoney();
        System.out.println("Owner = " + owner);
        System.out.println("Money = " + moneyAmount);
    }

}
