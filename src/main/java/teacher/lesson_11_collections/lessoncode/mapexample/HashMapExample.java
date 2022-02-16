package teacher.lesson_11_collections.lessoncode.mapexample;

import java.util.HashMap;
import java.util.Map;

class HashMapExample {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Ruslan", 25);
        map.put("Viktor", 30);
        map.put("Petya", 20);

        System.out.println(map);

        Integer number = map.get("Ruslan");
        System.out.println(number);

        map.put("Ruslan", 30);
        System.out.println(map);
    }
}
