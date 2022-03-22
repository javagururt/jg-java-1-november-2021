package student_andrei_karamnov.lesson_15_homework.level_6_middle.videostore;

import student_andrei_karamnov.lesson_15_homework.level_6_middle.videostore.Movie;

class Rental {

    private student_andrei_karamnov.lesson_15_homework.level_6_middle.videostore.Movie movie;
    private int daysRented;

    public Rental(student_andrei_karamnov.lesson_15_homework.level_6_middle.videostore.Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public student_andrei_karamnov.lesson_15_homework.level_6_middle.videostore.Movie getMovie() {
        return movie;
    }

    public int getDaysRented() {
        return daysRented;
    }
}