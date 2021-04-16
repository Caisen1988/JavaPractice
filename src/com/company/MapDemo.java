package com.company;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public void mapCreate() {
        int[] a  = {1,2,3,4,5};
        Map<String, int[]> map= new HashMap<>();
        map.put("mapdemo", a);
        int[] b = map.get("mapdemo");
        for(int i = 0;i<b.length;i++) {
            System.out.println(b[i]);
        }

    }
}
