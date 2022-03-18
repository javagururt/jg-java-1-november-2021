package student_stanislav_p.lesson_15.homework.level_6_middle.videostore;

import teacher.lesson_15.homework.level_6_middle.videostore.Movie;

class Rental {

    private teacher.lesson_15.homework.level_6_middle.videostore.Movie movie;
    private int daysRented;

    public Rental(teacher.lesson_15.homework.level_6_middle.videostore.Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public teacher.lesson_15.homework.level_6_middle.videostore.Movie getMovie() {
        return movie;
    }

    public int getDaysRented() {
        return daysRented;
    }
}