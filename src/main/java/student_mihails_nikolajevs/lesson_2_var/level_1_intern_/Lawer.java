package student_mihails_nikolajevs.lesson_2_var.level_1_intern_;

public class Lawer extends Employee{


    private String mDepartment;
    public Lawer(String fullName, long date, long salary, String department) {
        super(fullName, date, salary);
        mDepartment = department;
    }
}
