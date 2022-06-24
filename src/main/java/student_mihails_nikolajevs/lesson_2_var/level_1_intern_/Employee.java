package student_mihails_nikolajevs.lesson_2_var.level_1_intern_;

public class Employee {

    private String mFullName;
    private long mEmploymentDate;
    protected long mSalary;

    public  Employee(String fullName, long date, long salary) {
        mFullName = fullName;
        mEmploymentDate = date;
        mSalary = salary;
    }
    public  double getSalaryUah() {
        return mSalary / 100f;
    }


}
