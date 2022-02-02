package student_rolands_gudels.lesson_8_inheritance.level_5_middle;

import java.util.Random;

public class ShapeUtil {
    Circle createRandomCircle(){
        Random random = new Random();
        double radius = random.nextDouble();
        Circle circle = new Circle( "Circle",radius);
        return circle;
    }

    Square createRandomSquare() {
        Random random = new Random();

        return null;
    }

}
