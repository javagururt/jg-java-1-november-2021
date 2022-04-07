package student_julija_radchenko.lesson_12_homeworks.level_2_intern;

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

    public String getFullName(){
        return fullName;
    }
}
