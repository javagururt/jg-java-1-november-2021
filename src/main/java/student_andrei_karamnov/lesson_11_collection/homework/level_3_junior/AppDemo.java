package student_andrei_karamnov.lesson_11_collection.homework.level_3_junior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class AppDemo {


    public static void main(String[] args) {
        UniqueWordFinder finder = new UniqueWordFinder();
        String text = "java, guru, find, some, guru, java, words, fantastic, amazing, java, python, javascript, c++,\n" +
                "java, guru, find, some, guru, java, words, fantastic, amazing, java, python, javascript, c++,\n" +
                "java, guru, find, some, guru, java, words, fantastic, amazing, java, python, javascript, c++,\n";
        System.out.println(finder.textUpgrade(text));


        System.out.println("-------------------------------------------");

        finder.find(text);   // Хоть почти все дубликаты и отсеились,
        // почему все-равно слово java дублируется?

    }
}
