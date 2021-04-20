package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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


    public void setStus()  {
        List<Student> list = new ArrayList<Student>();
        Student stu1 = new Student("Bob", 78);
        Student stu2 = new Student("Alice", 85);
        Student stu3 = new Student("Brush", 66);
        Student stu4 = new Student("Newton", 99);
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        list.add(stu4);


    }
}
