package student_andrei_karamnov.lesson_12_exceptions.homework.level_2_intern;

class BankClient {

    private String uid;      // уникальный идентификатор клиета
    private String fullName; // полное имя клиента

    // создайте конструктор класса, в котором вы получите значения указанных свойств
    // создайте get() методы для каждого из свойств

    public BankClient(String uid, String fullName) {
        this.uid = uid;
        this.fullName = fullName;
    }

    public String getUid() {
        return this.uid;
    }

    public String getFullName() {
        return this.fullName;
    }
}
