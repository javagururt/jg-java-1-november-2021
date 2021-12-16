package student_rolands_gudels.lesson_3_oop_first_look.level_4_junior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Task_17 {
    /*Найти ошибку в коде.
Исправить и запустить программу. */



         static class BankAccount {

            String ownerFirstName;
            String ownerLastName;
            int moneyAmount;

            BankAccount(String ownerFirstName,
                        String ownerLastName,
                        int moneyAmount) {
                this.ownerFirstName = ownerFirstName;
                this.ownerLastName = ownerLastName;
                this.moneyAmount = moneyAmount;
            }

            String getOwnerFirstName() {
                return this.ownerFirstName;
            }

            String getOwnerLastName() {
                return this.ownerLastName;
            }

            int getMoneyAmount() {
                return this.moneyAmount;
            }

        }


    }

