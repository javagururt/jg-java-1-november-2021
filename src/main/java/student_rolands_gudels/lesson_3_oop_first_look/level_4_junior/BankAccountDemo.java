package student_rolands_gudels.lesson_3_oop_first_look.level_4_junior;

 class BankAccountDemo {


        public static void main(String[] args) {
            Task_17.BankAccount bankAccount = new Task_17.BankAccount("Viktor", "Savonin", 100000);
            String ownerFirstName = bankAccount.getOwnerFirstName();
            String ownerLastName = bankAccount.getOwnerLastName();
            int moneyAmount = bankAccount.getMoneyAmount();
            System.out.println("Owner first name = " + ownerFirstName);
            System.out.println("Owner last name = " + ownerLastName);
            System.out.println("Money amount = " + moneyAmount);
        }

    }

