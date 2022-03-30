package student_mihails_nikolajevs.lesson_14.level_3_junior_;

//Вам поручили задачу по анализу данных в домене трейдеров и транзакций.

public class Trader {

    private String name;
    private String city;

    public Trader(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return this.name;
    }

    public String getCity() {
        return this.city;
    }

    public String toString() {
        return "Trader:"+this.name + " in " + this.city;
    }
}
