package com.company;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        //数组之和
        int[] ns = new int[5];
        for(int i = 0; i < 5;i++) {
            ns[i] = i+10;
            System.out.println(ns[i]);
        }

        System.out.println(sum1(ns));

        //字符串 string 和字符 char
        char a = 'a';
        String b = "abcdefg";

        Reverse sr = new Reverse();
        sr.reverseStr(b);
        int[] needCheck = { 1, 4, 4, 16, 25 };;
        removeElement ele = new removeElement();
        ele.removeElement(needCheck, 4);
        Log log = new Log();
        log.outLog();

        ArrayListDemo demoArray =  new ArrayListDemo();
        demoArray.addArray();
    }

    public static int sum1(int[] ns) {
        int sum = 0;
        for(int i = 0 ; i<ns.length; i++) {
            sum = sum + ns[i];
        }
        return sum;
    }


}
