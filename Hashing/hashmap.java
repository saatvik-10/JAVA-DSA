import java.util.*;

class hashmap { //it is unordered

    public static void main(String args[]) {
        //country, population - (key, value)
        HashMap<String, Integer> map = new HashMap<>();

        //Insertion
        map.put("India", 120);
        map.put("Argentina", 20);
        System.out.println(map);

        map.put("India", 150);
        System.out.println(map);

        //Search
        if (map.containsKey("Argentina")) {
            System.out.println("Present in the map");
        } else {
            System.out.println("Not present");
        }

        //get value of the key
        System.out.println(map.get("India"));

        //can also use for loop in this manner
        int[] arr = { 1, 2, 3 };
        for (int val : arr) {
            System.out.println(val + " ");
        }

        //for loop iteration in hashmap (preferred)
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.print(e.getKey() + " ");
            System.out.println(e.getValue());
        }

        //another method by making set for the keys
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + " " + map.get(key));
        }

        //remove
        map.remove("Argentina");
        System.out.println(map);
    }
}
