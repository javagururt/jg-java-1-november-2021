package student_stanislav_p.lesson_16.lessoncode;



import java.math.BigDecimal;
import java.util.Random;

class BankAccountService {

    private BankAccountValidationService validationService;
    private BankAccountRepository repository;
    private BankAccount bankAccount;

    BankAccountService(BankAccountValidationService validationService, BankAccountRepository repository) {
        this.validationService = validationService;
        this.repository = repository;
    }

    void increaseBalance(BankAccount bankAccount, BigDecimal deposit) {
        this.bankAccount = bankAccount;

        sleep();
//        validationService.validate(this.bankAccount);
//        repository.save(this.bankAccount);
        this.bankAccount.deposit(deposit);
    }

    private void sleep() {
        try {
            var random = new Random();
            Thread.sleep(random.nextInt(1000));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
