package student_valeriia_kulikova.Lesson_3.level_7_senior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
 class  Computer {
    String computerName;
    int diagonal;
    String color;
    double price;

    public Computer (String computerName1, int diagonal1, String color1, double price1) {
        this.computerName = computerName1;
        this.diagonal = diagonal1;
        this.color = color1;
        this.price = price1;
    }

    public void PrintComputer () {
        System.out.println("Computer model - " + this.computerName);
        System.out.println("Diagonal - " + this.diagonal);
        System.out.println("Color - " + this.color);
        System.out.println("Price - " + this.price);
    }
}

public class ComputerDemo {
    public static void main(String[] args) {
        Computer newComputer1 = new Computer("Lenovo",16, "Grey", 800);
        Computer newComputer2 = new Computer("MacBook", 14, "Grey", 2500);
        System.out.println("****************");
        newComputer1.PrintComputer();
        System.out.println("****************");
        newComputer2.PrintComputer();
    }
}