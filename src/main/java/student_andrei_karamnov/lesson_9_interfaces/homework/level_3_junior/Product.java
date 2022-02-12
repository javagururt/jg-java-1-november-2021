package student_andrei_karamnov.lesson_9_interfaces.homework.level_3_junior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Product {

    private String title;


    public Product(String title) {
        this.title = title;
    }


    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
