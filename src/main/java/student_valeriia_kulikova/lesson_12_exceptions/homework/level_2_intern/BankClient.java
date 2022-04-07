package student_valeriia_kulikova.lesson_12_exceptions.homework.level_2_intern;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class BankClient {
    private String uid;      // уникальный идентификатор клиента
    private String fullName; // полное имя клиента

    public BankClient(String uid, String fullName) {
        this.uid = uid;
        this.fullName = fullName;
    }

    public String getUid() {
        return uid;
    }

    public String getFullName() {return fullName;}
}
