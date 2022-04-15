package student_mihails_nikolajevs.lesson_2_var.level_1_intern_;

public class LibraryUserInput {

     double dateOfBirth; // Enter Date Of Birth of User (dd.mm.year)
     String firstName;
     String lastName;


    public LibraryUserInput(String firstName, String lastName,double dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public double getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(double dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
