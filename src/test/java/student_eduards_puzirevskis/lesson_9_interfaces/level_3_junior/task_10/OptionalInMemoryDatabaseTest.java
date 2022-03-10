package student_eduards_puzirevskis.lesson_9_interfaces.level_3_junior.task_10;

import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.*;

public class OptionalInMemoryDatabaseTest {

    @Test
    public void save() {
        OptionalInMemoryDatabase memoryDatabase = new OptionalInMemoryDatabase();
        Product pen = new Product("Pen");
        Product glue = new Product("Glue");
        Product pencil = new Product("Pencil");
        Product marker = new Product("Marker");
        Product mouse = new Product("Mouse");
        memoryDatabase.save(pen);
        memoryDatabase.save(glue);
        memoryDatabase.save(pencil);
        memoryDatabase.save(marker);
        memoryDatabase.save(mouse);
        Product[] expected = {new Product("Pen"),
                new Product("Glue"),
                new Product("Pencil"),
                new Product("Marker"),
                new Product("Mouse")};
        Product[] actual = memoryDatabase.getDatabase();

        assertEquals(expected[0].getTitle(), actual[0].getTitle());
        assertEquals(expected[1].getTitle(), actual[1].getTitle());
        assertEquals(expected[2].getTitle(), actual[2].getTitle());
        assertEquals(expected[3].getTitle(), actual[3].getTitle());
        assertEquals(expected[4].getTitle(), actual[4].getTitle());
    }

    @Test
    public void findByTitle() {
        Product[] victim = {new Product("Pen"),
                new Product("Glue"),
                new Product("Pencil"),
                new Product("Marker"),
                new Product("Mouse")};
        OptionalInMemoryDatabase memoryDatabase = new OptionalInMemoryDatabase();
        Optional<Product> actual = memoryDatabase.findByTitle(victim, "Marker");
        Product expected = new Product("Marker");

        assertEquals(expected.getTitle(),actual.get().getTitle());
    }

    @Test
    public void shouldReturnEmpty() {
        Product[] victim = {new Product("Pen"),
                new Product("Glue"),
                new Product("Pencil"),
                new Product("Marker"),
                new Product("Mouse")};
        OptionalInMemoryDatabase memoryDatabase = new OptionalInMemoryDatabase();
        Optional<Product> actual = memoryDatabase.findByTitle(victim, "Gun");
        assertEquals(actual, Optional.empty());
    }
}