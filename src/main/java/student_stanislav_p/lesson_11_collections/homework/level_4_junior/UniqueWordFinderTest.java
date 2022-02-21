package student_stanislav_p.lesson_11_collections.homework.level_4_junior;

import java.util.HashSet;
import java.util.Iterator;

public class UniqueWordFinderTest {
    public static void main(String[] args) {

        String testText = " Информация, содержащаяся в данной книге, получена из источников" +
                " рассматриваемых издательством как надежные. Тем не менее, имея в виду" +
                " возможные человеческие или технические ошибки, издательство не может" +
                " гарантировать абсолютную точность и полноту приводимых сведений и не" +
                " несет ответственности за возможные ошибки, связанные с использованием книги";

        UniqueWordFinder newFinder = new UniqueWordFinder();


        HashSet<String> myHashSet = new HashSet<>();

        myHashSet= (HashSet<String>) newFinder.find(testText);

            System.out.println(myHashSet);

    }
}
