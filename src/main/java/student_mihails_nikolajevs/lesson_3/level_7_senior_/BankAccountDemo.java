package student_mihails_nikolajevs.lesson_3.level_7_senior_;

class BankAccountDemo {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount("Viktor", 100000);

        String ownerFirstName = bankAccount.getOwner();
        int moneyAmount = bankAccount.getMoney();

        System.out.println("Owner = " + ownerFirstName);
        System.out.println("Money = " + moneyAmount);
    }

}
