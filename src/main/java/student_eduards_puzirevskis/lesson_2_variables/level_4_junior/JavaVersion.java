package student_eduards_puzirevskis.lesson_2_variables.level_4_junior;

import teacher.annotations.CodeReview;

/*
Как узнать какая версия JDK установлена на вашем компьютере?

Вот краткое руководство, показывающее использование команды «java -version» для проверки текущей версии JDK,
установленной на вашем компьютере.

Откройте командную строку в Windows или терминал в unix. + 2.
Введите java -version.

C:\Users\javaguru>java -version
openjdk version "14.0.1" 2020-04-14
OpenJDK Runtime Environment AdoptOpenJDK (build 14.0.1+7)
OpenJDK 64-Bit Server VM AdoptOpenJDK (build 14.0.1+7, mixed mode, sharing)
 */
@CodeReview(approved = true)
public class JavaVersion {
    public static void main(String[] args) {
        System.out.println("C:\\Users\\User>java -version");
        System.out.println("openjdk version \"11.0.9.1\" 2020-11-04");
        System.out.println("OpenJDK Runtime Environment AdoptOpenJDK (build 11.0.9.1+1)");
        System.out.println("OpenJDK 64-Bit Server VM AdoptOpenJDK (build 11.0.9.1+1, mixed mode)");
    }
}
