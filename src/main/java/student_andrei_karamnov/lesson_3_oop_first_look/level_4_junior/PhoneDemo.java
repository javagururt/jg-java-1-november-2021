package student_andrei_karamnov.lesson_3_oop_first_look.level_4_junior;

class PhoneDemo {
    public static void main(String[] args) {
        Phone myPhone = new Phone("Huawei");
        String phoneModel = myPhone.getModel();
        System.out.println("Phone model = " + phoneModel);
    }
}
