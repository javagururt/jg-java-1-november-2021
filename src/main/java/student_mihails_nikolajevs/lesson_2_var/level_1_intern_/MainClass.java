package student_mihails_nikolajevs.lesson_2_var.level_1_intern_;

public class MainClass {

    public static void main(String[] args) {

        Car myCar = new Car();
        myCar.color = "green";
        myCar.fuelInTank = 10;
        Car myBrotherCar = new Car();

        Car myWifeCar = new Car("pink", "sedan", 1.8, 6, "PINKY",0);

        myCar.fillTank(20);
        myWifeCar.drive(100);
        System.out.println("current fuel level = " + myCar.fuelInTank);

        Employee[] emps = new Employee [3];
        emps [0] = new Doctor("Vasya", 2309,30000,1);
        emps [1] = new Lawer("Petia", 1609 ,90000,"Criminal");
        emps [2] = new Lawer("Petia", 1309 ,50000,"Criminal");

        double totalSalary = 0;
        for (int i = 0; i<emps.length; i++)
            totalSalary += emps[i].getSalaryUah();

        System.out.println("total salary  = " + totalSalary);
    }
}
