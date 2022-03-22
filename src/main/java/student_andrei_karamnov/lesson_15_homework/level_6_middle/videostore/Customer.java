package student_andrei_karamnov.lesson_15_homework.level_6_middle.videostore;

// This file is the original program.  It has been left here so you can compare it with the refactored version.

import student_andrei_karamnov.lesson_15_homework.level_6_middle.videostore.Movie;
import student_andrei_karamnov.lesson_15_homework.level_6_middle.videostore.Rental;

import java.util.Enumeration;
import java.util.Vector;

class Customer {

    private String name;
    private Vector rentals = new Vector();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(student_andrei_karamnov.lesson_15_homework.level_6_middle.videostore.Rental rental) {
        rentals.addElement(rental);
    }

    public String getName() {
        return name;
    }

    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration rentals = this.rentals.elements();
        String result = "Rental Record for " + getName() + "\n";

        while (rentals.hasMoreElements()) {
            double thisAmount = 0;
            student_andrei_karamnov.lesson_15_homework.level_6_middle.videostore.Rental each = (student_andrei_karamnov.lesson_15_homework.level_6_middle.videostore.Rental) rentals.nextElement();

            // determines the amount for each line
            switch (each.getMovie().getPriceCode()) {
                case student_andrei_karamnov.lesson_15_homework.level_6_middle.videostore.Movie.REGULAR:
                    thisAmount += 2;
                    if (each.getDaysRented() > 2)
                        thisAmount += (each.getDaysRented() - 2) * 1.5;
                    break;
                case student_andrei_karamnov.lesson_15_homework.level_6_middle.videostore.Movie.NEW_RELEASE:
                    thisAmount += each.getDaysRented() * 3;
                    break;
                case student_andrei_karamnov.lesson_15_homework.level_6_middle.videostore.Movie.CHILDRENS:
                    thisAmount += 1.5;
                    if (each.getDaysRented() > 3)
                        thisAmount += (each.getDaysRented() - 3) * 1.5;
                    break;
            }

            frequentRenterPoints++;

            if (each.getMovie().getPriceCode() == student_andrei_karamnov.lesson_15_homework.level_6_middle.videostore.Movie.NEW_RELEASE
                    && each.getDaysRented() > 1)
                frequentRenterPoints++;

            result += "\t" + each.getMovie().getTitle() + "\t"
                    + String.valueOf(thisAmount) + "\n";
            totalAmount += thisAmount;

        }

        result += "You owed " + String.valueOf(totalAmount) + "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points\n";


        return result;
    }
}