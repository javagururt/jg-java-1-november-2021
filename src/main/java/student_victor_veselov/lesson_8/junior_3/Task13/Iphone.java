package student_victor_veselov.lesson_8.junior_3.Task13;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Iphone extends Phone {

    @Override
    public void phoneTurnOn() {
        System.out.println("Iphone Включен");

    }

    @Override
    public void phoneTurnOff() {
        System.out.println("Iphone Выключен");

    }

    public static void main(String[] args) {
        Phone iphone = new Iphone();
        iphone.setPhoneModel("XR");
        iphone.setPhoneName("Iphone");
        iphone.setPhonePrice(500);
        iphone.phoneTurnOn();
        System.out.println("Phone is " + iphone.getPhoneModel() + " " + iphone.getPhoneName() + " " + iphone.getPhonePrice());
    }
}
