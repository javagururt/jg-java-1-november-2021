package student_eduards_puzirevskis.lesson_3_oop_first_look.level_7_senior.Task_29;

import java.util.Scanner;

class Smartphone {
    public String brand;
    public String model;
    public double cameraPixels;
    public boolean newOrUsed;

    public String getBrand() {
        System.out.println("What brand smartphone do you have?");
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        System.out.println("What model smartphone do you have?");
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getCameraPixels() {
        System.out.println("How much camera pixels does your phone have?");
        return cameraPixels;
    }

    public void setCameraPixels(double cameraPixels) {
        this.cameraPixels = cameraPixels;
    }

    public boolean isNewOrUsed() {
        System.out.println("Is it new or used?");
        System.out.println("1 - it's new");
        System.out.println("0 - it's used");
        return newOrUsed;
    }

    public void setNewOrUsed(boolean newOrUsed) {
        this.newOrUsed = newOrUsed;
    }
    public void showMeWhatWeGot(){
        System.out.println("OK. As I understand, you have: ");
        System.out.println(this.brand + " brand smartphone.");
        System.out.println("Model of your smartprone is : " + this.model);
        System.out.println("U've got nice camera with " + this.cameraPixels + " pixels.");
        if (this.newOrUsed == true){
            System.out.println("And it'new. Great!");
        } else {
            System.out.println("Is's used. So get some money for a new one)");
        }
    }
}
