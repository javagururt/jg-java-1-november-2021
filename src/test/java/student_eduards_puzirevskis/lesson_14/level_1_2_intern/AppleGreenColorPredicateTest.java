package student_eduards_puzirevskis.lesson_14.level_1_2_intern;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class AppleGreenColorPredicateTest {
    FruitStorage fruitStorage = new FruitStorage();
    List<Apple> appleList = fruitStorage.getAllApples();

    @Test
    public void getGreenApples() {
        List<Apple> actual = fruitStorage.findApplesByColor(appleList,"green");
        for (Apple apple:
                actual) {
            assertEquals("green", apple.getColor());
        }
    }

    @Test
    public void getRedApples() {
        List<Apple> actual = fruitStorage.findApplesByColor(appleList,"red");
        for (Apple apple:
                actual) {
            assertEquals("red", apple.getColor());
        }
    }

    @Test
    public void getYellowApples() {
        List<Apple> actual = fruitStorage.findApplesByColor(appleList,"yellow");
        for (Apple apple:
                actual) {
            assertEquals("yellow", apple.getColor());
        }
    }

    @Test
    public void shouldNotFindApples() {
        List<Apple> actual = fruitStorage.findApplesByColor(appleList,"blue");
        assertTrue(actual.isEmpty());
    }

    @Test
    public void shouldFindGreenApplesByPredicate() {
        List<Apple> actual = fruitStorage.findApples(appleList,new AppleGreenColorPredicate());
        for (Apple apple:
                actual) {
            assertEquals("green", apple.getColor());
        }
    }

    @Test
    public void shouldFindRedApplesByPredicate() {
        List<Apple> actual = fruitStorage.findApples(appleList,new AppleRedColorPredicate());
        for (Apple apple:
                actual) {
            assertEquals("red", apple.getColor());
        }
    }

    @Test
    public void shouldFindHeavyApplesByPredicate() {
        List<Apple> actual = fruitStorage.findApples(appleList,new AppleHeavyWeightPredicate());
        for (Apple apple:
                actual) {
            assertTrue(apple.getWeight() > 150);
        }
    }

    @Test
    public void shouldFindLightApplesByPredicate() {
        List<Apple> actual = fruitStorage.findApples(appleList,new AppleLightWeightPredicate());
        for (Apple apple:
                actual) {
            assertTrue(apple.getWeight() < 150);
        }
    }

    @Test
    public void shouldFindHeavyGreenApplesByPredicate() {
        List<Apple> actual = fruitStorage.findApples(appleList,new AppleGreenHeavyPredicate());
        for (Apple apple:
                actual) {
            assertTrue(apple.getWeight() > 150 && apple.getColor().equals("green"));
        }
    }

    @Test
    public void shouldFindGreenApplesByAnonymousClass() {
        List<Apple> actual = fruitStorage.findApples(appleList,new ApplePredicate() {
            public boolean test(Apple apple) {
                return "green".equals(apple.getColor());
            }
        });
        for (Apple apple:
                actual) {
            assertEquals("green", apple.getColor());
        }
    }

    @Test
    public void shouldFindRedApplesByAnonymousClass() {
        List<Apple> actual = fruitStorage.findApples(appleList,new ApplePredicate() {
            public boolean test(Apple apple) {
                return "red".equals(apple.getColor());
            }
        });
        for (Apple apple:
                actual) {
            assertEquals("red", apple.getColor());
        }
    }

    @Test
    public void shouldFindHeavyApplesByAnonymousClass() {
        List<Apple> actual = fruitStorage.findApples(appleList,new ApplePredicate() {
            public boolean test(Apple apple) {
                return apple.getWeight() > 150;
            }
        });
        for (Apple apple:
                actual) {
            assertTrue(apple.getWeight() > 150);
        }
    }

    @Test
    public void shouldFindLightApplesByAnonymousClass() {
        List<Apple> actual = fruitStorage.findApples(appleList,new ApplePredicate() {
            public boolean test(Apple apple) {
                return apple.getWeight() < 150;
            }
        });
        for (Apple apple:
                actual) {
            assertTrue(apple.getWeight() < 150);
        }
    }

    @Test
    public void shouldFindGreenApplesLambda() {
        List<Apple> actual = fruitStorage.findApples(appleList, apple -> "green".equals(apple.getColor()));
        for (Apple apple:
                actual) {
            assertEquals("green", apple.getColor());
        }
    }

    @Test
    public void shouldFindRedApplesByLambda() {
        List<Apple> actual = fruitStorage.findApples(appleList, apple -> "red".equals(apple.getColor()));
        for (Apple apple:
                actual) {
            assertEquals("red", apple.getColor());
        }
    }

    @Test
    public void shouldFindHeavyApplesByLambda() {
        List<Apple> actual = fruitStorage.findApples(appleList, apple -> apple.getWeight() > 150);
        for (Apple apple:
                actual) {
            assertTrue(apple.getWeight() > 150);
        }
    }

    @Test
    public void shouldFindLightApplesByLambda() {
        List<Apple> actual = fruitStorage.findApples(appleList, apple -> apple.getWeight() < 150);
        for (Apple apple:
                actual) {
            assertTrue(apple.getWeight() < 150);
        }
    }


}