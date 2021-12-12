package student_andrei_karamnov.lesson_3_oop_first_look.level_7_senior;

class Material {
    String name;
    double price;
    double density;
    double weight;
    String manufacturer;

    public Material(){
        this.price = 0;
        this.density = 0;
        this.weight = 0;
    }
    void Ferum(String ferumType, String ferumManufacturer){
        this.density = 1.2;
        this.weight = 1;
        this.name = ferumType;
        this.price = 0.44;
        this.manufacturer = ferumManufacturer;
        System.out.println("Name: " + this.name + "Manufacturer: " + this.manufacturer);
        System.out.println(this.density + " g/cm3");
        System.out.println(this.weight + " kg");
        System.out.println(this.price +" $ per 1kg");
    }
}
