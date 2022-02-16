package student_mihails_nikolajevs.lesson_3.level_7_senior_;

 class ComputerDemo {

    public static void main(String[] args) {

        Computer dell = new Computer ("XXX-1", "Dell");

        String manufacturer = dell.getManufacturer();
        String model = dell.getModel();

        System.out.println("Computer manufacturer = " + manufacturer);
        System.out.println("Computer model = " + model);
    }

}
