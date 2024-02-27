package ztemp3Kumar;

import java.util.LinkedHashMap;
import java.util.Map;

public class CustomHashMap<K, V> extends LinkedHashMap<K, V> {
    private final int maxSize;

    public CustomHashMap(int maxSize) {
        super(maxSize, 0.75f, true); // Access order set to true for LRU functionality
        this.maxSize = maxSize;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > maxSize;
    }

    public static void main(String[] args) {
        CustomHashMap<Integer, String> map = new CustomHashMap<>(3);
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        System.out.println(map); // {1=One, 2=Two, 3=Three}

        // Accessing an element
        map.get(1);

        // Adding a new element
        map.put(4, "Four");

        System.out.println(map); // {2=Two, 3=Three, 1=One}
    }
}

