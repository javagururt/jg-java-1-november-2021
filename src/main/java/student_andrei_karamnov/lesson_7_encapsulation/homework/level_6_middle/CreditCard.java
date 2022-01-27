package student_andrei_karamnov.lesson_7_encapsulation.homework.level_6_middle;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

/*Необходимо разработать класс "кредитная карта" CreditCard
с учетом инкапсуляции, которая обладает следующими характеристиками:

Свойства
-Номер карты
-Пин-код карты
-Баланс
-Кредитный лимит
-Задолженность по кредиту


Методы

-Зачисление средств на карту ("deposit")
-Снятие средств с карты ("withdraw")

При создании карты нужно указывать ее номер и пинкод.
Начальный баланс и задолженность по кредиту равны 0.
Кредитный лимит можно менять после создания карты.

Требования к снятию средств:
-При снятии средств с карты необходимо указывать пин-код и желаемую сумму;
-Если пин-коды не совпадают, операция по снятию денег должна быть отклонена;
-Деньги снимаются с карточного баланса. В случае, если их не хватает, остаток суммы нужно брать за счет задолженности по кредиту;
-Если сумма задолженности превышает кредитный лимит, операция по снятию денег должна быть отклонена;

Требования к зачислению средств:
-При зачислении средств на карту необходимо указывать пин-код и желаемую сумму;
-Если пин-коды не совпадают, операция по зачислению денег должна быть отклонена;
-В первую очередь зачисление покрывает задолженность по кредиту;
-Если задолженность по кредиту равна 0, то остаток средств зачисляется в счет баланса;

Написать тестовые сценарии для класса CreditCard в классе CreditCardTest.
Все тестовые сценарии должны отрабатывать без ошибок.*/
@CodeReview(approved = false)
@CodeReviewComment(comment = "неверное использование статики, в случае 2+ объектов программа будет работать некорректно.")
class CreditCard {
    static long cardNumber;
    static long cardPinCode;
    static double cardBalance;
    static double creditCardLimit;
    static double cardLoanDebt;

    public CreditCard(long cardNumber, long cardPinCode, double cardCreditLimit) {
        this.cardNumber = cardNumber;
        this.cardPinCode = cardPinCode;
        this.creditCardLimit = cardCreditLimit;

    }
    boolean cardDepositOperation(long pinCode, double depositAmount){
        if(pinCode == cardPinCode){
            cardDeposit(depositAmount);
            return true;
        }else {System.out.println("Incorrect operation, please try again ");
            return false;
        }
    }
    boolean cardWithdrawOperation(long pinCode, double withdrawAmount){
        if(pinCode == cardPinCode && cardLoanDebt < creditCardLimit){
            cardWithdraw(withdrawAmount);
            return true;
        }
        else {System.out.println("Incorrect operation, please try again ");
            return false;
        }
    }
    private void cardDeposit(double depositAmount){
        if(cardLoanDebt < depositAmount) {
            cardBalance = cardBalance + depositAmount - cardLoanDebt;
            cardLoanDebt = 0;
        }
    }
    private void cardWithdraw(double withdrawAmount){
        if(cardBalance  > withdrawAmount){
            cardBalance = cardBalance - withdrawAmount;}
            else{cardLoanDebt = cardLoanDebt - withdrawAmount + cardBalance;
            cardBalance = 0;
        }
    }

    private double getCardBalance() {
        return cardBalance;
    }

    private double getCardCreditLimit() {
        return creditCardLimit;
    }

    private double getCardLoanDebt() {
        return cardLoanDebt;
    }

    private void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    private void setCardPinCode(long cardPinCode) {
        this.cardPinCode = cardPinCode;
    }

    private void setCardCreditLimit(double cardCreditLimit) {
        this.creditCardLimit = cardCreditLimit;
    }

    }

