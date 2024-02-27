package ztemp3Kumar;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.*;

public class CustomTreeMap{

    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>(Collections.reverseOrder());

        treeMap.put(1, "One");
        treeMap.put(2, "Two");
        treeMap.put(3, "Three");

        for (Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}