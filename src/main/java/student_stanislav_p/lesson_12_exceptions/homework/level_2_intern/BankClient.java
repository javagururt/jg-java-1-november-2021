package student_stanislav_p.lesson_12_exceptions.homework.level_2_intern;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class BankClient {

    private String uid;
    private String fullName;

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
