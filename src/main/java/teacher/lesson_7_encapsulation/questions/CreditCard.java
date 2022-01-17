package teacher.lesson_7_encapsulation.questions;

/*
Необходимо разработать класс "кредитная карта" CreditCard
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
Все тестовые сценарии должны отрабатывать без ошибок.
 */

class CreditCard {

    static long cardNumber = 0;
    static long cardPinCode = 0 ;
    static long cardBalance = 0;
    static long cardCreditLineDebt = 0;
    static long cardCreditLimit = 0;

     public CreditCard(long cardNumber, long cardPinCode, long cardCreditLimit) {
        this.cardNumber = cardNumber;
        this.cardPinCode = cardPinCode;
        this.cardCreditLimit = cardCreditLimit;}



    static boolean makeDepositCard(long cardPin, long depositAmount){

         boolean result;
         if (cardPin == cardPinCode) {
                depositCard(depositAmount);
                result = true;
            }else {System.out.println("Incorrect operation"); result=false;}
        return result;
        }

    static boolean makeWithdrawCard(long cardPin, long withdrawAmount){

        boolean result;

        boolean conditionFirstIsOk = (cardBalance+cardCreditLimit-cardCreditLineDebt)>withdrawAmount;

        boolean conditionSecondIsOk = (cardPin == cardPinCode);


        if (conditionFirstIsOk&&conditionSecondIsOk) {
            withdrawCard(withdrawAmount);
            result = true;
        }
        else {System.out.println("Incorrect operation"); result=false;}

        return result;
    }



//----------------------------------------------------------------------------------

    private static void depositCard(long depositAmount){


            if (cardCreditLineDebt<depositAmount) {
                cardBalance = cardBalance+depositAmount-cardCreditLineDebt;
                cardCreditLineDebt=0;}
            else {
                cardCreditLineDebt=cardCreditLineDebt-depositAmount;
            }

    }

    private static void withdrawCard(long withdrawAmount){


         if (cardBalance>withdrawAmount) {
                cardBalance=cardBalance-withdrawAmount;}
            else {
                cardCreditLineDebt=cardCreditLineDebt+withdrawAmount-cardBalance;
                cardBalance=0;
            }


    }


    private long getCardNumber() {
        return cardNumber;
    }

    private long getCardPinCode() {
        return cardPinCode;
    }

    private long getCardBalance() {
        return cardBalance;
    }

    private long getCardCreditLineDebt() {
        return cardCreditLineDebt;
    }

    private long getCardCreditLimit() {
        return cardCreditLimit;
    }


}
