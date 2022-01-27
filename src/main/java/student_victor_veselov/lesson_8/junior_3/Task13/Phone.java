package student_victor_veselov.lesson_8.junior_3.Task13;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public abstract class Phone {

    private String phoneName;
    private String phoneModel;
    private int phonePrice;

    public abstract void phoneTurnOn();

    public abstract void phoneTurnOff();

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public String getPhoneModel() {
        return phoneModel;
    }

    public void setPhoneModel(String phoneModel) {
        this.phoneModel = phoneModel;
    }

    public int getPhonePrice() {
        return phonePrice;
    }

    public void setPhonePrice(int phonePrice) {
        this.phonePrice = phonePrice;
    }

}
