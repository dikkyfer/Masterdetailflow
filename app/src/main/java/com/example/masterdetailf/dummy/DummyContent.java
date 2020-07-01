package com.example.masterdetailf.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    private static final int COUNT = 25;

    static {
        addItem(new DummyItem("1","4","et porro tempora"));
        addItem(new DummyItem("1","8","quo adipisci enim quam ut ab"));
        addItem(new DummyItem("1","10","illo est ratione doloremque quia maiores aut"));
        addItem(new DummyItem("1","11","vero rerum temporibus dolor"));
        addItem(new DummyItem("1","12","vero rerum temporibus dolor"));
        addItem(new DummyItem("1","14","repellendus sunt dolores architecto voluptatum"));
        addItem(new DummyItem("1","15","ab voluptatum amet voluptas"));
        addItem(new DummyItem("1","16","accusamus eos facilis sint et aut voluptatem"));
        addItem(new DummyItem("1","17","quo laboriosam deleniti aut qui"));
        addItem(new DummyItem("1","19","molestiae ipsa aut voluptatibus pariatur dolor nihil"));
        addItem(new DummyItem("1","20","ullam nobis libero sapiente ad optio sint"));
        addItem(new DummyItem("1","21","distinctio vitae autem nihil ut molestias quo"));
        addItem(new DummyItem("1","25","voluptas quo tenetur perspiciatis explicabo natus"));
        addItem(new DummyItem("1","26","aliquam aut quasi"));

    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }



    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public final String user_id;
        public final String id;
        public final String title;

        public DummyItem(String user_id, String id, String title) {
            this.user_id = user_id;
            this.id = id;
            this.title = title;
        }

        @Override
        public String toString() {
            return user_id;
        }
    }
}
