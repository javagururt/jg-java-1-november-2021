package student_mihails_nikolajevs;

import java.util.Random;

public class RandomNumberTest {
    public static void main(String[] args) {
        Random RandomGenerator = new Random();
        int randomNumber = RandomGenerator.nextInt(101);
        System.out.println(randomNumber);
    }
}
