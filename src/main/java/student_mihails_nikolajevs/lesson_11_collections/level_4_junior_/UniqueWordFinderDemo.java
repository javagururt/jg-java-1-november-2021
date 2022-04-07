package student_mihails_nikolajevs.lesson_11_collections.level_4_junior_;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class UniqueWordFinderDemo {

    public static void main(String[] args) {

        UniqueWordFinder wordFinder = new UniqueWordFinder();
        String text = wordFinder.getText();
        System.out.println(" Great! The Unique Words In Your Text Are : " + wordFinder.find(text));
    }
}
