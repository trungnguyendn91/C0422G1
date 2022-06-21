package ss12_collection_frame.thuc_hanh.HashMap.LinkedHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapLinkedHashMapTreeMap {
    public static void main(String[] args) {
        //tạo HashMap
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Smith", 30);
        hashMap.put("Anderson", 31);
        hashMap.put("Lewis", 29);
        hashMap.put("Cook", 29);
        System.out.println("Display entry in hashMap: ");
        System.out.println(hashMap + "\n");
        //tạo treeMap
        Map<String, Integer> treeMap = new TreeMap<>();
        System.out.println("Display entries in ascending oder the key: ");
        System.out.println(treeMap);
        //tạo LinkedHashMap
        Map<String, Integer>linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);
        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Lewis"));

    }
}
