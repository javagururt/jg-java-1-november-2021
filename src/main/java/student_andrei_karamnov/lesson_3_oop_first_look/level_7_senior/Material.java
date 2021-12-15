package student_andrei_karamnov.lesson_3_oop_first_look.level_7_senior;

class Material {
    String name;
    double price;
    double density;
    double weight;
    String manufacturer;
    String type;

    public Material(String materialName){
        this.name = materialName;
        this.price = 0;
        this.density = 0;
        this.weight = 0;
    }
    String getName(){
        return this.name;
    }
    void Ferum(String type, String manufacturer){
        this.density = 1.2;
        this.weight = 1;
        this.type = type;
        this.price = 0.44;
        this.manufacturer = manufacturer;
        System.out.println("Type: " + type + "Manufacturer: " + manufacturer);
        System.out.println(this.density + " g/cm3");
        System.out.println(this.weight + " kg");
        System.out.println(this.price +" $ per 1kg");
    }
}
