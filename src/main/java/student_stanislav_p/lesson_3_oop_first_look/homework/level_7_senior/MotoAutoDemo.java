package student_stanislav_p.lesson_3_oop_first_look.homework.level_7_senior;


/*
Выберите два разных объекта из реального мира.
Для каждого объекта выделите 2 - 3 самых важных
свойства и поведения, которое с этими свойствами
связано. Создайте для каждого объекта из реального
мира Java класс с его описанием. Создайте так же
Demo класс для каждого описанного вами объекта
и продемонстрируйте работу с объектом.
 */
import java.util.Scanner;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
    class Moto {


        String Class = "Moto";
        int Power = 160;
        int MaxSpeed = 240;
        double Displacement = 1.65;
        double LongDistance = 26.5/5.95*100;

        String AllMotoData;

        String MotoData() {
            this.AllMotoData = "Основные характеристики мотоцикла: " + System.lineSeparator()
                    + "Максимальная мощность - " + Power + " лошадиных сил" + System.lineSeparator()
                    + "Максимальная скорость - " + MaxSpeed + " км/ч" + System.lineSeparator()
                    + "Объем двигателя       -" + Displacement+ " литров" + System.lineSeparator()
                    + "Полного бака хватает на " + LongDistance+ " км" + System.lineSeparator();

            return  this.AllMotoData;
        }

    }



    class Auto {


        String Class = "Auto";
        int Power = 500;
        int MaxSpeed = 331;
        double Displacement = 5.4;
        double LongDistance = 80/13.5*100;

        String AllAutoData;

        String AutoData() {
            this.AllAutoData = "Основные характеристики автомобиля:" + System.lineSeparator()
            + "Максимальная мощность - " + Power + " лошадиных сил" + System.lineSeparator()
            + "Максимальная скорость - " + MaxSpeed + " км/ч" + System.lineSeparator()
            + "Объем двигателя       - " + Displacement+ " литров" + System.lineSeparator()
            + "Полного бака хватает на " + LongDistance+ " км" + System.lineSeparator();
            return  this.AllAutoData;
        }

    }

    public class MotoAutoDemo {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);


            System.out.println("Выбирете :");
            System.out.println("1) мотоцикл BWM K 1600 GTL");
            System.out.println("или");
            System.out.println("2) автомобиль Mercedes-Benz sl 55");
            System.out.println("->");

            int choise = scanner.nextInt();

            switch (choise) {
                case 1:
                    Moto newMoto = new Moto();
                    String AllMData = newMoto.MotoData();

                    System.out.println(AllMData);
                    break;


                case 2:

                    Auto newAuto = new Auto();

                    String AllAData = newAuto.AutoData();

                    System.out.println(AllAData);
                    break;

                default:

                    System.out.println(" Некорректный выбор!");
            }

        }
    }

