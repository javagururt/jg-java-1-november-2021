package student_dmitrijs_sinkevics.lesson_12.lvl_2_intern;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class BankClient {

    private String uid;
    private String fullName;


    public BankClient(String uid, String fullName) {
        this.uid = uid;
        this.fullName = fullName;
    }

    public String getUid() {
        return uid;
    }

    public String getFullName() {
        return fullName;
    }
}
