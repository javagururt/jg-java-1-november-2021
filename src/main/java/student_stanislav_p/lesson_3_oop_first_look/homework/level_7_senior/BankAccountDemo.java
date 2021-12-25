package student_stanislav_p.lesson_3_oop_first_look.homework.level_7_senior;

import teacher.annotations.CodeReview;

/*
Найти логическую ошибку в коде.
Исправить и запустить программу так, что бы она выводила
на консоль владельца банковского счёта и количество денег.
 */
@CodeReview(approved = true)
    class BankAccount {

        String owner;
        int money;

        BankAccount(String owner, int moneyAmount) {
            this.owner = owner;
            this.money = moneyAmount;
        }

        String getOwner() {
            return this.owner;
        }

       int getMoney() {
            return this.money;
        }

    }

    public class BankAccountDemo {

        public static void main(String[] args) {
            BankAccount bankAccount = new BankAccount("Viktor", 100000);
            String ownerFirstName = bankAccount.getOwner();
            int  moneyAmount = bankAccount.getMoney();
            System.out.println("Owner = " + ownerFirstName);
            System.out.println("Money = " + moneyAmount);
        }

    }

