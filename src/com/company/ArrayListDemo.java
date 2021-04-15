package com.company;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
    public void addArray() {
        List<String> list1 = new ArrayList<>();
        list1.add("apple");
        list1.add("apple1");
        list1.add("apple2");
        list1.add("pear");
        this.getArrayListWay1((ArrayList) list1);
        this.getArrayListWay2((ArrayList) list1);
        this.getArrayListWay3((ArrayList) list1);
    }

    public void getArrayListWay1(ArrayList arrayList) {
        System.out.println("---way1---");
        for(int i = 0; i<arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
    public void getArrayListWay2( ArrayList arrayList) {
        System.out.println("----way2----");
        for(Iterator<String> it = arrayList.iterator(); it.hasNext();) {
            String s = it.next();
            System.out.println(s);
        }
    }

    public void getArrayListWay3(ArrayList arrayList) {
        System.out.println("---way3----");
        for (Object s : arrayList) {
            System.out.println(s);
        }
    }
}
