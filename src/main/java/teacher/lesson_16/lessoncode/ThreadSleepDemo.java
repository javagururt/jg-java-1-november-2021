package teacher.lesson_16.lessoncode;

import java.util.Date;

class ThreadSleepDemo {

    public static void main(String[] args) throws InterruptedException {
        while (true) {
            var currentDate = new Date(System.currentTimeMillis());
            System.out.println("Current date:" + currentDate);
            Thread.sleep(1000);
        }
    }
}
