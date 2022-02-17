package teacher.lesson_11_part2.lessoncode;

import java.util.HashMap;
import java.util.Map;

class MapExample {

    public static void main(String[] args) {
        Map<String, Integer> stringIntegerMap = new HashMap<>();
        stringIntegerMap.put("A", 1);
        stringIntegerMap.put("A", 1);
        stringIntegerMap.put("A", 1);
        stringIntegerMap.put("A", 1);
        stringIntegerMap.put("A", 1);
        stringIntegerMap.put("B", 2);
        stringIntegerMap.put("B", 2);
        stringIntegerMap.put("B", 2);
        stringIntegerMap.put("B", 2);
        stringIntegerMap.put("B", 2);

        System.out.println(stringIntegerMap);

        stringIntegerMap.put("A", 3);
        stringIntegerMap.put("A", 4);
        stringIntegerMap.put("A", 5);
        stringIntegerMap.put("B", 6);
        stringIntegerMap.put("B", 7);
        stringIntegerMap.put("B", 8);

        System.out.println(stringIntegerMap);
    }
}
