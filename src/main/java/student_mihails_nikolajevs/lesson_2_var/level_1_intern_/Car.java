package student_mihails_nikolajevs.lesson_2_var.level_1_intern_;

public class Car {

    String color;
    String form;
    double engineV;
    double fuelConsumption;
    String id;
    double fuelInTank;

    Car () {
        fuelInTank = 0;
        id = "BB001";

    }
    Car(String color, String form, double engineV, double fuelConsumption, String id, double fuelInTank)    {
        this.color = color;
        this.form = form;
        this.engineV = engineV;
        this.fuelConsumption = fuelConsumption;
        this.id = id;
        this.fuelInTank = fuelInTank;
    }

    public void fillTank(int fuelV ) {
        fuelInTank = fuelInTank + fuelV;
    }

    public void drive (double distance) {
        fuelInTank = fuelInTank - distance / 100 * fuelConsumption ;
    }

}
