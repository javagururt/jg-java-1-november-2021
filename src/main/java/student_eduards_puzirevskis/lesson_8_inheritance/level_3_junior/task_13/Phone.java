package student_eduards_puzirevskis.lesson_8_inheritance.level_3_junior.task_13;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
abstract class Phone {

    private String brand;
    private String model;
    private String color;
    private double cameraPixels;
    private boolean supportsFiveG;


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCameraPixels() {
        return cameraPixels;
    }

    public void setCameraPixels(double cameraPixels) {
        this.cameraPixels = cameraPixels;
    }

    public boolean isSupportsFiveG() {
        return supportsFiveG;
    }

    public void setSupportsFiveG(boolean supportsFiveG) {
        this.supportsFiveG = supportsFiveG;
    }
}
