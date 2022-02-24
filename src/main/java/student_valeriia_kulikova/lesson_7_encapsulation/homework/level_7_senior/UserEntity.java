package student_valeriia_kulikova.lesson_7_encapsulation.homework.level_7_senior;

public class UserEntity {
    private int id = 0;
    private String name = "";
    private String surname = "";
    private long personalID = 0;

    @Override
    public String toString() {
        return "\n"+"UserEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", personalID=" + personalID +
                '}';
    }

    public UserEntity() {


    }

    public int getId() {return id;}

    public void setId(int id) {this.id = id;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public String getSurname() {return surname;}

    public void setSurname(String surname) {this.surname = surname;}

    public long getPersonalID() {return personalID;}

    public void setPersonalID(long personalID) {this.personalID = personalID;}
}
