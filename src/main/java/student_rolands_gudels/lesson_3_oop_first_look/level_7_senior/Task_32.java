package student_rolands_gudels.lesson_3_oop_first_look.level_7_senior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
 class Task_32 {
  /*Найти логическую ошибку в коде.
Исправить и запустить программу так, что бы она выводила
на консоль владельца банковского счёта и количество денег. */


   static class BankAccount {

    String owner;
    int money;

    BankAccount(String owner, int money) {
     this.owner = owner;
     this.money = money;
    }

    String getOwner() {
     return this.owner;
    }

    int getMoney() {
     return this.money;
    }

   }

  }

// Done result is in BankAccountDemo