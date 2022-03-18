package student_stanislav_p.lesson_14.lessoncode;



import java.util.ArrayList;
import java.util.List;

class StringStreamExample {

    public static void main(String[] args) {
        List<String> strings = List.of(
                "Ruslan",
                "Viktor",
                "Dmitrij",
                "Vasilij",
                "Petr"
        );

        List<String> upperCaseNames = new ArrayList<>();

        for (int i = 0; i < strings.size(); i++) {
            String name = strings.get(i).toUpperCase();
            upperCaseNames.add(name);
        }

        System.out.println(upperCaseNames);

        NameToUpperCaseFunction toUpperCaseFunction = new NameToUpperCaseFunction();
        String nameRuslan = toUpperCaseFunction.apply("Ruslan");
        System.out.println(nameRuslan);

        List<String> upperCaseNames2 = strings.stream()
                .map(toUpperCaseFunction)
                .toList();
        System.out.println(upperCaseNames2);

        List<Integer> upperCaseNames3 = strings.stream()
                .map(name -> name.toUpperCase())
                .map(new NameToNameLengthFunction())
                .toList();
        System.out.println(upperCaseNames3);


        List<String> upperCaseNames4 = strings.stream()
                .map(String::toUpperCase)
                .toList();
        System.out.println(upperCaseNames4);

        List<Integer> upperCaseNames5 = strings.stream()
                .map(name -> name.toUpperCase())
                .map(name -> name.length())
                .map(length -> length * 100)
                .toList();
        System.out.println(upperCaseNames5);
    }

}
