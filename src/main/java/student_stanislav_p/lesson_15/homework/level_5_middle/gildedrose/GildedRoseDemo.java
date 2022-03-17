package student_stanislav_p.lesson_15.homework.level_5_middle.gildedrose;

import teacher.lesson_15.homework.level_5_middle.gildedrose.GildedRose;
import teacher.lesson_15.homework.level_5_middle.gildedrose.Item;

import java.util.ArrayList;
import java.util.List;

class GildedRoseDemo {

    public static void main(String[] args) {
        List<teacher.lesson_15.homework.level_5_middle.gildedrose.Item> items = new ArrayList<>();
        items.add(new teacher.lesson_15.homework.level_5_middle.gildedrose.Item("+5 Dexterity Vest", 10, 20));
        items.add(new teacher.lesson_15.homework.level_5_middle.gildedrose.Item("Aged Brie", 2, 0));
        items.add(new teacher.lesson_15.homework.level_5_middle.gildedrose.Item("Elixir of the Mongoose", 5, 7));
        items.add(new teacher.lesson_15.homework.level_5_middle.gildedrose.Item("Sulfuras, Hand of Ragnaros", 0, 80));
        items.add(new teacher.lesson_15.homework.level_5_middle.gildedrose.Item("Backstage passes to a TAFKAL80ETC concert", 15, 20));
        items.add(new Item("Conjured Mana Cake", 3, 6));

        teacher.lesson_15.homework.level_5_middle.gildedrose.GildedRose gildedRose = new teacher.lesson_15.homework.level_5_middle.gildedrose.GildedRose();
        gildedRose.updateQuality(items);
    }

}