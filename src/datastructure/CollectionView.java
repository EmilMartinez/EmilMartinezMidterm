package datastructure;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CollectionView {

public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "NYC");
        map.put(2, "LA");
        map.put(3, "Denver");
        map.put(4, "Boston");
        map.put(5, "San Jose");
        map.put(6, "Seattle");

        Map<Integer, String> temp = Collections.checkedMap(map, Integer.class, String.class);

                System.out.print(temp);
        System.out.println(map);

        }
}

